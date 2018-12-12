package com.mini.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mini.board.dao.IDao;
import com.mini.board.service.NoticeModifyService;
import com.mini.board.service.NoticeContentService;
import com.mini.board.service.NoticeDeleteService;
import com.mini.board.service.NoticeServiceImpl;
import com.mini.board.service.NoticeWriteService;
import com.mini.board.util.Constant;

@Controller
public class NoticeController {
	NoticeServiceImpl command;
	public JdbcTemplate template;
	
	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
		Constant.template = this.template;
	}
	
	@Autowired
	private SqlSession sqlsession;
	
	@RequestMapping("/noticeBoard") // �Խ��� list
	public String noticeBoard(Model model, HttpServletRequest request, HttpServletResponse response) {
		if(LoginCheck.LoginCheckRedirect(request, response) == null) {
			return "redirect:loginForm";
		} else {
			IDao dao = sqlsession.getMapper(IDao.class); // DB����
			model.addAttribute("list", dao.list());
			
			return "noticeBoard";
		}
	}
	
	@RequestMapping("/notice_write")
	public String write(Model model,HttpSession session) {
		System.out.println("write()");
		String writer = (String)session.getAttribute("loginid");

		model.addAttribute("writer",writer);
		return "writer/notice_write";
	}
	
	@RequestMapping("/writego")
	public String writego(HttpServletRequest request, Model model) {
		System.out.println("write()");
		
		model.addAttribute("request", request);
		command = new NoticeWriteService();
		command.execute(model);
		
		return "redirect:noticeBoard";
	}
	
	@RequestMapping("/notice_view")
	public String notice_view(HttpServletRequest request, Model model) {
		System.out.println("noticeView()");
		
		model.addAttribute("request", request);
		command = new NoticeContentService();
		command.execute(model);
		
		return "view/notice_view";
	}
	
	@RequestMapping("/modifygo")
	public String modifyView(HttpServletRequest request, Model model) {
		System.out.println("noticeView()");
		
		model.addAttribute("request", request);
		command = new NoticeContentService();
		command.execute(model);
		
		return "modify/notice_modify";
	}

	@RequestMapping(method=RequestMethod.POST, value = "/modify9")
	public String modify9(HttpServletRequest request, Model model) {
		System.out.println("modify()");
		
		model.addAttribute("request", request);
		command = new NoticeModifyService();
		command.execute(model);
		
		return "redirect:noticeBoard";
	}
	
	@RequestMapping("/delete9")
	public String delete9(HttpServletRequest request, Model model) {
		System.out.println("delete()");
		
		model.addAttribute("request", request);
		command = new NoticeDeleteService();
		command.execute(model);
		
		return "redirect:noticeBoard";
	}
}
