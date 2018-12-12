package com.mini.board.service;

import java.sql.Date;
import java.util.ArrayList;

import com.mini.board.dto.BoardDto2;

public interface BoardService2 {
	
	public ArrayList<BoardDto2> freeBoard2ListService();
//	public void writeService(String title, String contents, String writer);
	public void writeService(BoardDto2 boardDto);
	public BoardDto2 viewService(int bNo); 
	public void modifyService(BoardDto2 boardDto);
	public void deleteService(int bNo);
	public void uploadService(String id, int bNo);
	public void hitUpService(int bNo);
	public int getSeqService ();
}
