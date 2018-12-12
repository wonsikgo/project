package com.mini.board.service;

import java.util.List;

import com.mini.board.dto.BoardDto1;

public interface BoardService1 {

	List<BoardDto1> getAllList(); //db에 모든 게시판값 받아오는 메소드
	void insertContents(BoardDto1 dto); //글쓴거 저장하는 메소드
	void updateContents(BoardDto1 dto); //수정한거 저장하는 메소드
	void deletsContents(int no); //지우는 메소드
	void updateCount(int no); //제목클릭했을떄 조회수 늘어나느메소드
	BoardDto1 getno(int no); //제목클릭했을때  그제목이가지고있는 데이터가지고오는 메소드
	 List<BoardDto1> freeBoardSearch(BoardDto1 dto); //검색하는 메소드
}
