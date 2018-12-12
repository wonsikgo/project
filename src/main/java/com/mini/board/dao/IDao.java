package com.mini.board.dao;

import java.util.ArrayList;

import com.mini.board.dto.NoticeDto;

public interface IDao {
	public ArrayList<NoticeDto> list();
}
