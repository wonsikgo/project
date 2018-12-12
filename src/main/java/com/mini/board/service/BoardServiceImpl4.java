package com.mini.board.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mini.board.dao.BoardDao4;
import com.mini.board.dto.BoardDto4;

@Service("boardService4")
public class BoardServiceImpl4 implements BoardService4 {

	@Autowired
	BoardDao4 dao;

	@Override
	public void writeDao(BoardDto4 dto4) {
		// TODO Auto-generated method stub
		dao.writeDao(dto4);

	}

	@Override
	public BoardDto4 viewDao(int no) {
		// TODO Auto-generated method stub
		return dao.viewDao(no);
	}

	@Override
	public BoardDto4 modifyView(int no) {
		// TODO Auto-generated method stub
		return dao.modifyView(no);
	}

	@Override
	public void updateDao(BoardDto4 dto4) {
		// TODO Auto-generated method stub
		dao.updateDao(dto4);
	}

	@Override
	public void updateHit(int no) {
		// TODO Auto-generated method stub
		dao.updateHit(no);
	}

	@Override
	public void deleteDao(int no) {
		// TODO Auto-generated method stub
		dao.deleteDao(no);
	}

	@Override
	public ArrayList<BoardDto4> listDao() {
		// TODO Auto-generated method stub
		return dao.listDao();
	}

	@Override
	public void replyDao(BoardDto4 dto4) {
		// TODO Auto-generated method stub
		dao.replyDao(dto4);
	}

	@Override
	public void replywrite(BoardDto4 dto4) {
		// TODO Auto-generated method stub
		dao.replywrite(dto4);
	}

	@Override
	public void replyShape(BoardDto4 dto4) {
		// TODO Auto-generated method stub
		dao.replyShape(dto4);

	}

	@Override
	public ArrayList<BoardDto4> searchDao(BoardDto4 dto4) {
		// TODO Auto-generated method stub
		return dao.searchDao(dto4);
	}

}
