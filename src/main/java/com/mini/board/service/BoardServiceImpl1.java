package com.mini.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mini.board.dao.BoardDao1;
import com.mini.board.dto.BoardDto1;

@Service("boardService")
public class BoardServiceImpl1 implements BoardService1 {

	@Autowired
	public BoardDao1 boardDao;
	
	@Override
	public List<BoardDto1> getAllList() {
		
	return boardDao.getAllList();
		
	}

	@Override
	public void insertContents(BoardDto1 dto) {

     boardDao.insertContents(dto);
		
	}

	@Override
	public void deletsContents(int no) {
		
		boardDao.deleteContents(no);
		
	}

	@Override
	public BoardDto1 getno(int no) {
		
		return boardDao.getno(no);
	}

	@Override
	public void updateContents(BoardDto1 dto) {
        System.out.println(dto.toString());
		boardDao.updateContents(dto);

		
	}

	@Override
	public void updateCount(int no) {
        boardDao.updateCount(no);
        System.out.println("여까진오니?");
		
	}

	@Override
	public List<BoardDto1> freeBoardSearch(BoardDto1 dto) {
		
		return boardDao.freeBoardSearch(dto);
	}

}
