package com.mini.board.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mini.board.dto.UserDto;

public interface UserService {

	public ArrayList<UserDto> userListService();
	public void signupService(UserDto userDto);
	public UserDto viewInfoService(int id);
	public boolean loginService(String id, String password, String remembid, HttpServletRequest request, HttpServletResponse response);
	public void logoutService(HttpServletRequest request, HttpServletResponse response);
	public void modifyService(UserDto userDto);
	public void signoutService(int id);
	
}
