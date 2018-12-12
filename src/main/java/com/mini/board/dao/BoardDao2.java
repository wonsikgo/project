package com.mini.board.dao;

import java.sql.Date;
import java.util.ArrayList;

import com.mini.board.dto.BoardDto2;


public interface BoardDao2 {
	
	public ArrayList<BoardDto2> freeBoard2List();
//	public void write(String title, String contents, String writer);
	public void write(BoardDto2 boardDto);
	public BoardDto2 view(int bNo); 
	public void modify(BoardDto2 boardDto);
	public void delete(int bNo);
	public void upload(String id, int bNo);
	public void hitUp(int bNo);
	public int getSeq();
}
