package com.mini.board.dao;

import java.util.ArrayList;

import com.mini.board.dto.UserDto;

public interface UserDao {
	
	public ArrayList<UserDto> userList();
	public void signup(UserDto userDto);
	public UserDto viewInfo(int id);
	public boolean login(UserDto userDto);
	public void modify(UserDto userDto);
	public void signout(int id);

}
