package com.mini.board.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.mini.board.dao.NoticeDao;
import com.mini.board.dto.NoticeDto;

public class NoticeContentService implements NoticeServiceImpl {

	@Override
	public void execute(Model model) {

		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		String no = request.getParameter("no");

		NoticeDao dao = new NoticeDao();
		NoticeDto dto = dao.contentView(no);

		model.addAttribute("noticeView", dto);
	}
}
