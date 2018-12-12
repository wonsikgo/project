package com.mini.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginCheck {
	public static String LoginCheckRedirect(HttpServletRequest request, HttpServletResponse response){
		HttpSession session = request.getSession();
		return (String)session.getAttribute("loginid");
	}
}
