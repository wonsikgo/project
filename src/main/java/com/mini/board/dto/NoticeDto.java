package com.mini.board.dto;

import java.sql.Timestamp;

public class NoticeDto {

	int no; // bId --> no 글번호
	String writer; // bName --> writer 작성자
	String title; // bTitle --> title 제목
	String contents; // bContent --> contents 내용
	Timestamp write_date; // bDate --> writingDate 작성일
	int hit; // bHit --> hit 조회수
	
	public NoticeDto() {
		
	}

	public NoticeDto(int no, String writer, String title, String contents, Timestamp write_date, int hit) {
		super();
		this.no = no;
		this.writer = writer;
		this.title = title;
		this.contents = contents;
		this.write_date = write_date;
		this.hit = hit;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
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

	public Timestamp getWrite_date() {
		return write_date;
	}

	public void setWrite_date(Timestamp write_date) {
		this.write_date = write_date;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}
}

