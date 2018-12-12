package com.mini.board.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mini.board.dao.BoardDao2;
import com.mini.board.dto.BoardDto2;

//@Service("com.mini.board.service.BoardServiceImpl")
@Service("BoardServiceImpl")
public class BoardServiceImpl2 implements BoardService2 {

	@Autowired
	BoardDao2 bDao;
		
	@Override
	public ArrayList<BoardDto2> freeBoard2ListService() {
		return bDao.freeBoard2List();
	}

	@Override
//	public void writeService(String title, String contents, String writer) {
	public void writeService(BoardDto2 boardDto) {
		bDao.write(boardDto);
	}

	@Override
	public BoardDto2 viewService(int bNo) {
		return bDao.view(bNo);
	}

	@Override
	public void modifyService(BoardDto2 boardDto) {
		System.out.println(boardDto);
		bDao.modify(boardDto);
	}

	@Override
	public void deleteService(int bNo) {
		bDao.delete(bNo);
	}

	@Override
	public void uploadService(String id, int bNo) {
	}

	@Override
	public void hitUpService(int bNo) {
		bDao.hitUp(bNo);
	}

	@Override
	public int getSeqService() {
		return bDao.getSeq()+1;
	}



}
