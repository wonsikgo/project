package com.mini.board.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.mini.board.dao.NoticeDao;

public class NoticeWriteService implements NoticeServiceImpl {

	@Override
	public void execute(Model model) {

		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String writer = request.getParameter("writer");
		String title = request.getParameter("title");
		String contents = request.getParameter("contents");
		
		NoticeDao dao = new NoticeDao();
		dao.write(writer, title, contents);
	}
}
