package com.mini.board.dto;

import java.sql.Date;

public class BoardDto4 {

	private int no;
	private String title;
	private String contents;
	private String writer;
	private Date write_Date;
	private int hit;
	private int bGroup;
	private int bStep;
	private int bIndent;
	private String checkoption;   
	private String keyword;     
	
	
	public BoardDto4() {
	}
	
	
	
	
	
	public BoardDto4(int no, String title, String contents, String writer, Date write_Date, int hit, int bGroup,
			int bStep, int bIndent, String checkoption, String keyword) {

		this.no = no;
		this.title = title;
		this.contents = contents;
		this.writer = writer;
		this.write_Date = write_Date;
		this.hit = hit;
		this.bGroup = bGroup;
		this.bStep = bStep;
		this.bIndent = bIndent;
		this.checkoption = checkoption;
		this.keyword = keyword;
	}





	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getWrite_Date() {
		return write_Date;
	}
	public void setWrite_Date(Date write_Date) {
		this.write_Date = write_Date;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public int getbGroup() {
		return bGroup;
	}
	public void setbGroup(int bGroup) {
		this.bGroup = bGroup;
	}
	public int getbStep() {
		return bStep;
	}
	public void setbStep(int bStep) {
		this.bStep = bStep;
	}
	public int getbIndent() {
		return bIndent;
	}
	public void setbIndent(int bIndent) {
		this.bIndent = bIndent;
	}
	public String getCheckoption() {
		return checkoption;
	}
	public void setCheckoption(String checkoption) {
		this.checkoption = checkoption;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	@Override
	public String toString() {
		return "BoardDto4 [no=" + no + ", title=" + title + ", contents=" + contents + ", writer=" + writer
				+ ", write_Date=" + write_Date + ", hit=" + hit + ", bGroup=" + bGroup + ", bStep=" + bStep
				+ ", bIndent=" + bIndent + ", checkoption=" + checkoption + ", keyword=" + keyword + "]";
	}

	
	
	
}
