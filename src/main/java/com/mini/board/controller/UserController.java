package com.mini.board.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

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

import com.mini.board.dto.UserDto;
import com.mini.board.service.UserServiceImpl;

/**
 * Handles requests for the application home page.
 */
@Controller
public class UserController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "d/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping("/loginForm")
	public String loginForm(Model model, HttpServletRequest request, HttpServletResponse response) {
		logger.info("/loginForm");
		
		HttpSession session = request.getSession();

		boolean login = false;
		
		if(session != null) {
			String loginid = (String)session.getAttribute("loginid");
			login = loginid == null ? false : true;
		}
		
		if(login) {
			return "home";
		} else {
			return "/userInfo/login";
		}
	}
	
	
	@RequestMapping("/login")
	public String login(Model model, @ModelAttribute UserDto userDto, String remembid, HttpServletRequest request, HttpServletResponse response) {
		logger.info("/login");
		
		
		System.out.println("cont_id"+userDto.getId());
		System.out.println("cont_pw"+userDto.getPassword());
		
		boolean loginPass = userServiceImpl.loginService(userDto.getId(), userDto.getPassword(), remembid, request, response);
		
//		model.addAttribute("login", userServiceImpl.loginService(userDto);
		if(loginPass) {
			return "home";
		} else {
			return "/userInfo/login";
		}
	}
	
	@RequestMapping("/logout")
	public String logout(Model model, HttpServletRequest request, HttpServletResponse response) {
		userServiceImpl.logoutService(request, response);
		
		return "home";
	}
	
	@RequestMapping("/signupForm")
	public String signupPage(Model model) {
		logger.info("signupForm");
		
		return "/userInfo/signup";
	}
	
	@RequestMapping("/signup")
	public String signup(Model model, @ModelAttribute UserDto userDto) {
		logger.info("signup()");
		userServiceImpl.signupService(userDto);
		
		return "/userInfo/signupDone";
	}
	
}
