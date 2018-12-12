package com.mini.board.service;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.mini.board.dao.NoticeDao;
import com.mini.board.dto.NoticeDto;

public class NoticeListService implements NoticeServiceImpl {

	@Override
	public void execute(Model model) {
		
		NoticeDao dao = new NoticeDao();
		ArrayList<NoticeDto>dtos =  dao.list();
		
		model.addAttribute("noticeBoard", dtos);	
	}
}
