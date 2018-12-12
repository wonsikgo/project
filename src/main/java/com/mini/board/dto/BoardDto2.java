package com.mini.board.dto;

import java.sql.Date;

public class BoardDto2 {
	private int no;
	private String title;
	private String contents;
	private String writer;
	private Date write_Date;
	private int hit;
	private String fileName;
	private String filePath;


	public BoardDto2() {	}
	
	BoardDto2(int no, String title, String contents, String writer, Date write_Date, int hit, String fileName) {
		this.no = no;
		this.title = title;
		this.contents = contents;
		this.writer = writer;
		this.write_Date = write_Date;
		this.hit = hit;
		this.fileName = fileName;
		this.filePath = filePath;
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

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	@Override
	public String toString() {
		return "BoardDto2 [no=" + no + ", title=" + title + ", contents=" + contents + ", writer=" + writer
				+ ", write_Date=" + write_Date + ", hit=" + hit + ", fileName=" + fileName + ", filePath=" + filePath
				+ "]";
	}
}	
