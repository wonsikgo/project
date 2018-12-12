package com.mini.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.mini.board.dto.BoardDto1;
import com.mini.board.service.BoardService1;


@Controller
public class BoardController1 {

	@Autowired
	public BoardService1 boardService;

	private static final Logger logger = LoggerFactory.getLogger(BoardController1.class);


	@RequestMapping("/freeBoard1") //�옄�쑀寃뚯떆�뙋1濡쒖씠�룞 db�뿉 �엳�뒗 寃뚯떆�뙋 紐⑸줉 媛��졇�샂
	public String FreeBoard1(Model model, HttpServletRequest request, HttpServletResponse response) {
		logger.info("�옄�쑀寃뚯떆�뙋1濡� �씠�룞");
		if(LoginCheck.LoginCheckRedirect(request, response) == null) {
			return "redirect:loginForm";
		} else {
			model.addAttribute("list", boardService.getAllList());
			return "freeBoard1";
		}
	}
	@RequestMapping("/freeBoard1Writer") //�옄�쑀寃뚯떆�뙋�뿉�꽌 湲��벐湲� 踰꾪듉�늻瑜대㈃ 湲��벐湲컅sp濡쒖씠�룞
	public String freeBoard1Writer(Model model,HttpSession session) {

		String writer = (String)session.getAttribute("loginid");

		model.addAttribute("writer",writer);
		return "writer/freeBoard1Writer";		
	}

	@RequestMapping(value="/writer1", method = RequestMethod.POST) //湲��벖媛믩뱾�쓣 db濡� �씠�룞�븯怨� 硫붿씤由ъ뒪�듃�뿉�꽌  異붽��빐�꽌 蹂댁뿬二쇰뒗 硫붿냼�뱶 
	public String freeBoardWriter(Model model,@ModelAttribute BoardDto1 dto){
		logger.info("�뜲�씠�꽣�씠�룞");
		MultipartFile uploadFile = dto.getUploadFile(); // 媛앹껜濡쒕컺�븘�삩 �뾽濡쒕뱶 �뙆�씪�쓣 uploadFile �뿉�떞�뒗�떎.

		boardService.insertContents(dto);
		logger.info("db濡쒓컪�씠�룞");
		model.addAttribute("list", boardService.getAllList());

		return "redirect:freeBoard1";

	}
	@RequestMapping(value="/freeBoardView1")  //�젣紐⑺겢由��븯硫� �븞�뿉 洹몄젣紐⑷낵 愿��젴�맂 �궡�슜�씠 蹂댁씠寃뚰븯�뒗 硫붿냼�뱶
	public String writerView(Model model, HttpServletRequest request) {

		int no = Integer.parseInt(request.getParameter("no"));
		boardService.updateCount(no);  //議고쉶�닔 利앷�
		model.addAttribute("list", boardService.getno(no));
		return "view/freeBoard1View";
	}


	@RequestMapping("/freeBoardDelete1") //�궘�젣踰꾪듉�쑝濡� �늻瑜대㈃ �궘�젣�븯怨� 由ъ뒪�듃濡쒖씠�룞
	public String freeBoardDelete(Model model,HttpServletRequest request) {

		int no = Integer.parseInt(request.getParameter("no"));
		logger.info("�궘�젣而⑦듃濡ㅻ찓�냼�뱶濡쒖씠�룞");
		boardService.deletsContents(no);
		logger.info("�궘�젣�셿猷�");
		model.addAttribute("list", boardService.getAllList());
		return "redirect:freeBoard1";
	}

	@RequestMapping("/freeBoardModify1")  //�닔�젙踰꾪듉�쓣 �늻瑜대㈃ freeBoard1Modify濡� �뜲�씠�꽣瑜� 媛�吏�怨좎씠�룞  
	public String freeBoardModify(Model model,HttpServletRequest request) {

		int no = Integer.parseInt(request.getParameter("no"));	
		model.addAttribute("list", boardService.getno(no));
		logger.info("�닔�젙寃뚯떆�뙋�씠�룞");
		return "/modify/freeBoard1Modify";
	}

	@RequestMapping("/freeBoardUpdate1") //�닔�젙�솗�씤踰꾪듉�쓣 �늻瑜대㈃ db�뾽�뜲�씠�듃�븯怨� 硫붿씤由ъ뒪�듃濡쒖씠�룞 
	public String freeBoardUpdate(Model model,@ModelAttribute BoardDto1 dto) {
		logger.info("�닔�젙�솗�씤");
		boardService.updateContents(dto);
		return "redirect:freeBoard1";
	}

	@RequestMapping("/freeBoardSearch1") // 寃��깋湲곕뒫
	//@RequestParam(defaultValue="title") seachOption�쓽 珥덇린媛믪쓣 title �쑝濡� �븿
	public String freeBoardSearch(Model model,@ModelAttribute BoardDto1 dto) { 
		System.out.println(dto.toString());
		model.addAttribute("list", boardService.freeBoardSearch(dto));

		System.out.println(boardService.freeBoardSearch(dto));
		System.out.println("�릺�굹?");
		return "freeBoard1";

	}



}


