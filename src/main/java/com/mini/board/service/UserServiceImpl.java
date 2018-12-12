package com.mini.board.service;

import java.util.ArrayList;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mini.board.dao.UserDao;
import com.mini.board.dto.UserDto;


@Service("UserServiceImpl")
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userDao;

	@Override
	public ArrayList<UserDto> userListService() {
		return userDao.userList();
	}

	@Override
	public void signupService(UserDto userDto) {
		userDao.signup(userDto);
	}

	@Override
	public UserDto viewInfoService(int id) {
		return userDao.viewInfo(id);
	}

	@Override
	public void modifyService(UserDto userDto) {
		userDao.modify(userDto);
	}

	@Override
	public void signoutService(int id) {
		userDao.signout(id);
	}

	@Override
	public boolean loginService(String id, String password, String remembid, HttpServletRequest request, HttpServletResponse response) {
		ArrayList<UserDto> userList = userListService();
//		while(userList.)
		for(UserDto list : userList) {

			if(list.getId().equals(id) && list.getPassword().equals(password)) {
				System.out.println("login_success");
				Cookie cookie = new Cookie("id", id);
				cookie.setMaxAge(60*60*24*30); // 기간 한달
				response.addCookie(cookie);
				System.out.println("serv_rem" + remembid);
				if(remembid == null){
					cookie.setMaxAge(0); // 체크박스값 null일 경우 쿠키 삭제
				}
				
				HttpSession session = request.getSession();
				session.setAttribute("loginid", id);
				
				return true;
			}
		}
		return false;
	}

	@Override
	public void logoutService(HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		session.invalidate(); // 로그인 세션 끝
	}

}
