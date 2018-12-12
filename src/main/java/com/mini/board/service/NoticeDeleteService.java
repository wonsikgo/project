package com.mini.board.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.mini.board.dao.NoticeDao;

public class NoticeDeleteService implements NoticeServiceImpl {

	@Override
	public void execute(Model model) {

		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");

		String no = request.getParameter("no");
		NoticeDao dao = new NoticeDao();
		dao.delete(no);
	}
}
