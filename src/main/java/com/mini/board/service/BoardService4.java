package com.mini.board.service;

import java.util.ArrayList;

import com.mini.board.dto.BoardDto4;

public interface BoardService4 {
	
	public ArrayList<BoardDto4> listDao();
	
	public void writeDao(BoardDto4 dto4);
	public BoardDto4 viewDao(int no);
	public BoardDto4 modifyView(int no);

	public void updateDao(BoardDto4 dto4);
	public void updateHit(int no);
	public void deleteDao(int no);
	
	public void replyDao(BoardDto4 dto4) ;
	public void replywrite(BoardDto4 dto4);
	public void replyShape(BoardDto4 dto4);
	ArrayList<BoardDto4> searchDao(BoardDto4 dto4);
}
