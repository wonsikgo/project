package com.mini.board.dao;

import java.util.List;

import com.mini.board.dto.BoardDto1;

public interface BoardDao1 {

	List<BoardDto1> getAllList();
	void insertContents(BoardDto1 dto);
	void updateContents(BoardDto1 dto);
	void updateCount(int no);
    void deleteContents(int no);
    BoardDto1 getno(int no);
    List<BoardDto1> freeBoardSearch(BoardDto1 dto);
    
}
