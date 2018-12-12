package com.mini.board.dto;

import java.sql.Timestamp;

import org.springframework.web.multipart.MultipartFile;

public class BoardDto1 {

	private int no;                  //글번호
	private String title;            //제목
	private String contents;         //내용
	private String writer;           //작성자
	private Timestamp write_date;    //작성날짜
	private int hit;                 //조회수
	private String searchOption;     //검색옵션
	private String keyword;          //검색 키워드
	private MultipartFile uploadFile; //파일업로드
	
	public BoardDto1() {
	}


	public BoardDto1(int no, String title, String contents, String writer, Timestamp write_date, int hit,
			String searchOption, String keyword, MultipartFile uploadFile) {
		super();
		this.no = no;
		this.title = title;
		this.contents = contents;
		this.writer = writer;
		this.write_date = write_date;
		this.hit = hit;
		this.searchOption = searchOption;
		this.keyword = keyword;
		this.uploadFile = uploadFile;
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

	public String getSearchOption() {
		return searchOption;
	}

	public void setSearchOption(String searchOption) {
		this.searchOption = searchOption;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}



	public MultipartFile getUploadFile() {
		return uploadFile;
	}






	public void setUploadFile(MultipartFile uploadFile) {
		this.uploadFile = uploadFile;
	}






	@Override
	public String toString() {
		return "BoardDto [no=" + no + ", title=" + title + ", contents=" + contents + ", writer=" + writer
				+ ", write_date=" + write_date + ", hit=" + hit + ", searchOption=" + searchOption + ", keyword="
				+ keyword + "]";
	}


}
