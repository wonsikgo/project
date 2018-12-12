package com.mini.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.PreparedStatementSetter;

import com.mini.board.dto.NoticeDto;
import com.mini.board.util.Constant;

public class NoticeDao { // ±‚¡∏ BoardDao

	DataSource dataSource;
	JdbcTemplate template = null;
	
	public NoticeDao() {
		template = Constant.template;
	}
	
	public NoticeDto contentView(String strID) {
		upHit(strID);
		String query = "select * from notice_board where no = " + strID;
		return template.queryForObject(query, new BeanPropertyRowMapper<NoticeDto>(NoticeDto.class));
	}
	
	public void write(final String writer, final String title, final String contents){
		template.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(Connection con)
					throws SQLException {
				String query = "insert into notice_board (no, writer, title, contents, hit) values (notice_board_seq.nextval, ?, ?, ?, 0)";
				PreparedStatement pstmt = con.prepareStatement(query);
				pstmt.setString(1, writer);
				pstmt.setString(2, title);
				pstmt.setString(3, contents);
			
				return pstmt;
			}
		});
	}
	
	
	public ArrayList<NoticeDto> list() {
		String query = "select no, writer, title, contents, write_date, hit from notice_board order by no desc";
		return (ArrayList<NoticeDto>) template.query(query, new BeanPropertyRowMapper<NoticeDto>(NoticeDto.class));
	}
	
	public void modify(final String no, final String  writer, final String  title, final String  contents) {
		
		String query = "update notice_board set writer = ?, title = ?, contents = ? where no = ?";
		template.update(query, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, writer);
				ps.setString(2, title);
				ps.setString(3, contents);
				ps.setInt(4, Integer.parseInt(no));
			}
		});
	}
	
	public void delete(final String strID) {
		
		String query = "delete from notice_board where no = ?";
		template.update(query, new PreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setString(1, strID);
			}
		});	
	}
	
	public NoticeDto reply_view(String strID) {
		
		String query = "select * from notice_board where no = " + strID;
		return template.queryForObject(query, new BeanPropertyRowMapper<NoticeDto>(NoticeDto.class));
	}
	
	public void reply(final String no, final String writer, final String title, final String contents, final String bgroup, final String bstep, final String bindent) {
		
		String query = "insert into notice_board (no, writer, title, contents) values (notice_board_seq.nextval, ?, ?, ?)";
		
		template.update(query, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				// TODO Auto-generated method stub
				ps.setString(1, writer);
				ps.setString(2, title);
				ps.setString(3, contents);
				ps.setInt(4, Integer.parseInt(bgroup));
				ps.setInt(5, Integer.parseInt(bstep) + 1);
				ps.setInt(6, Integer.parseInt(bindent) + 1);
			}
		});
	}
	
	private void replyShape( final String strGroup, final String strStep) {
		
		String query = "update notice_board set bstep = bstep + 1 where bgroup = ? and bstep > ?";
		template.update(query, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, Integer.parseInt(strGroup));
				ps.setInt(2, Integer.parseInt(strStep));
			}
		});
	}
	
	private void upHit( final String No) {
		String query = "update notice_board set hit = hit + 1 where no = ?";
		template.update(query, new PreparedStatementSetter() {
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				ps.setInt(1, Integer.parseInt(No));
			}
		});
	}
	
}
