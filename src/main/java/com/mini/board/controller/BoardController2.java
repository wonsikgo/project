package com.mini.board.controller;

import java.io.File;
import java.io.IOException;

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

import com.mini.board.dto.BoardDto2;
import com.mini.board.service.BoardServiceImpl2;

@Controller
public class BoardController2 {
	
	
	private static final Logger logger = LoggerFactory.getLogger(BoardController2.class);
	
	@Autowired
	private BoardServiceImpl2 boardServiceImpl;
	
	@RequestMapping(value = "/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/freeBoard2")
	   public String freeBoard2(Model model, HttpServletRequest request, HttpServletResponse response) {
	      logger.info("freeBoard2");
	      if(LoginCheck.LoginCheckRedirect(request, response) == null) {
	         return "redirect:loginForm";
	      } else {
	         model.addAttribute("freeBoard2", boardServiceImpl.freeBoard2ListService());
	         
	         return "freeBoard2";
	      }
	   }
	
	
	@RequestMapping("/writeForm2")	// �۾�����
	public String writePage(Model model,HttpSession session) {
		logger.info("writeForm2");
		String writer = (String)session.getAttribute("loginid");

		model.addAttribute("writer",writer);
		return "/write/freeBoard2Write";
	}
	
	@RequestMapping(value="/write2", method=RequestMethod.POST)	// �۾��� + ÷������ ���ε�
	public String write(Model model, @ModelAttribute BoardDto2 boardDto
								 , @RequestParam("uploadFile") MultipartFile uploadFile, HttpServletRequest request) {
		logger.info("write2()");
		logger.info(boardDto.getFileName());
		System.out.println(uploadFile.isEmpty());
		
//		String realPath = request.getSession().getServletContext().getRealPath("/");
		File path = new File("");
	    String realPath = path.getAbsolutePath();
		
		// ÷������ ��Ʈ��
		if (!uploadFile.isEmpty()) {
			// DB�� �۹�ȣ Ȯ��
			String bNo = boardServiceImpl.getSeqService() + "";
			logger.info("bno : " + bNo);
			String targetPath = realPath+"\\resources\\upload\\"+boardDto.getWriter() + "\\" + bNo;

			// DB fileName�� ����� �̸� ����
			String result = saveFile(uploadFile, targetPath);
			if (result == "Failed to upload") {
				logger.info(result);
				model.addAttribute("result", result);
			} else {
				boardDto.setFileName(result);				// ÷������ ���� ������ ���� �̸�/��� db�� ����
				boardDto.setFilePath(targetPath); 
			}
		} else { 
			boardDto.setFileName("none"); 					// ÷�������� ���ٸ� ���� �̸�/��� none���� ����
			boardDto.setFilePath("none");
		}
		
		
		// �۾��� ��Ʈ��
		logger.info("write2()");
		boardServiceImpl.writeService(boardDto);
		return "redirect:freeBoard2";
	}
	
	// resources/upload/�ۼ��ڸ�/�۹�ȣ ������ ÷������ ����
	private String saveFile(MultipartFile files, String targetPath) {
		logger.info("uploadWriting");
		
		String fileNameTmp=files.getOriginalFilename();
		
		File saveDir = new File(targetPath);
		System.out.println(saveDir);
		System.out.println("exists? : " +saveDir.exists());

		if (!saveDir.exists())	// ����ڸ�+�Խñ� ��ȣ ������ ���ٸ� ����
			  saveDir.mkdirs();
		
		File saveFile = new File(saveDir, fileNameTmp);
		try {
			files.transferTo(saveFile);
		} catch(IOException e) {
			e.printStackTrace();
			return "Failed to upload";
		} 
		return fileNameTmp;
	}
	
	
	@RequestMapping("/view2")
	public String view(Model model, String no) {
		logger.info("view2()");
		boardServiceImpl.hitUpService(Integer.parseInt(no));
		model.addAttribute("view", boardServiceImpl.viewService(Integer.parseInt(no)));
		return "view/freeBoard2View";
	}
	
	@RequestMapping("/modifyForm2")
	public String modifyForm(Model model, String no) {
		logger.info("modifyForm2()");
		model.addAttribute("modifyS", boardServiceImpl.viewService(Integer.parseInt(no)));
		return "/modify/freeBoard2Modify";
	}
	
	@RequestMapping("/modify2")
	public String modify(Model model, @ModelAttribute BoardDto2 boardDto) {
		logger.info("modify2()");
		boardServiceImpl.modifyService(boardDto);
		return "redirect:freeBoard2";
	}
	
	@RequestMapping("/delete2")
	public String delete(Model model, String no) {
		logger.info("delete2()_no :"+Integer.parseInt(no));
		boardServiceImpl.deleteService(Integer.parseInt(no));
		return "redirect:freeBoard2";
	}
	
}
