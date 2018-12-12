package com.mini.board.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mini.board.dto.BoardDto4;
import com.mini.board.service.BoardService4;

@Controller
public class BoardController4 {

	private static final Logger logger = LoggerFactory.getLogger(BoardController4.class);

	@Resource(name="boardService4")
	private BoardService4 boardService4;

	@RequestMapping("/home")
	public String home1() {
		return "home";
	}
	//寃뚯떆�뙋 由ъ뒪�듃 
	@RequestMapping("/freeBoard4") 			
	public String list(Model model, HttpServletRequest request, HttpServletResponse response) {
		logger.info("freeBoard4()");
		if(LoginCheck.LoginCheckRedirect(request, response) == null) {
			return "redirect:loginForm";
		} else {
			model.addAttribute("list", boardService4.listDao());

			return "freeBoard4";
		}
	}
	//湲��벐湲곗갹�쑝濡� �씠�룞
	@RequestMapping("/writeForm4")
	public String writeForm(Model model,HttpSession session) {
		logger.info("writeform()");

		String writer = (String)session.getAttribute("loginid");
		model.addAttribute("writer",writer);
		return "/writer/freeBoard4Writer";
	}
	//湲��벐湲� 湲곕뒫
	@RequestMapping("/write4")
	public String write (@ModelAttribute BoardDto4 dto4 ) {
		logger.info("write()");

		boardService4.writeDao(dto4);

		return "redirect:freeBoard4";
	}
	//寃뚯떆�뙋 �긽�꽭蹂닿린 湲곕뒫 , 議고쉶�닔(updateHit)
	@RequestMapping("/freeBoard4View")
	public String view (HttpServletRequest request, Model model) { 
		logger.info("view()");

		boardService4.updateHit(Integer.parseInt(request.getParameter("no")));
		model.addAttribute("view", boardService4.viewDao(Integer.parseInt(request.getParameter("no"))));

		return "/view/freeBoard4View";
	}
	//湲� �닔�젙 李쎌쑝濡� �씠�룞
	@RequestMapping("/freeBoard4Modify")
	public String modifyview (HttpServletRequest request, Model model) { 
		logger.info("modifyview()");

		model.addAttribute("view",  boardService4.modifyView(Integer.parseInt(request.getParameter("no"))));

		return "/modify/freeBoard4Modify";
	}
	// 湲� �닔�젙 �븯湲� 湲곕뒫
	@RequestMapping("/modify4")
	public String modify(@ModelAttribute BoardDto4 dto4) {
		logger.info("modify()");

		boardService4.updateDao(dto4);

		return "redirect:freeBoard4";
	}

	//�궘�젣湲곕뒫 
	@RequestMapping("/delete4")
	public String delete (HttpServletRequest request) {
		logger.info("delete()");

		boardService4.deleteDao(Integer.parseInt(request.getParameter("no")));

		return "redirect:freeBoard4";
	}
	//�떟湲� �떖湲� 李쎌쑝濡� �씠�룞 
	@RequestMapping("freeBoard4ReplyForm")
	public String replyView (HttpServletRequest request, Model model) {

		model.addAttribute("view",  boardService4.viewDao(Integer.parseInt(request.getParameter("no"))));

		return "writer/freeBoard4Reply";
	}
	//�떟湲��떖湲� 湲곕뒫
	@RequestMapping("/reply4")
	public String refly (@ModelAttribute BoardDto4 dto4) {
		logger.info("reply");

		boardService4.replywrite(dto4);
		boardService4.replyShape(dto4);

		return "redirect:freeBoard4";
	}
	
	@RequestMapping("freeBoard4Search" )
	public String freeBoard4Search (Model model, @ModelAttribute BoardDto4 dto4) {
		logger.info("search");
		model.addAttribute("list", boardService4.searchDao(dto4));
		model.addAttribute("check", dto4);
		
		return "freeBoard4";
		
	}
}
