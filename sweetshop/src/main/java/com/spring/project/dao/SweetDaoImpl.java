package com.spring.project.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.spring.poject.entities.Sweet;

public class SweetDaoImpl implements SweetDao{
	
	private JdbcTemplate jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int insert(Sweet sweet) {
		String query="insert into  Sweet (sweetId,sweetName,sweetRate,sweetDiscountOffer) values(?,?,?,?)";
        int r=this.jdbcTemplate.update(query,sweet.getSweetId(),
        		sweet.getSweetName(),sweet.getSweetRate(),sweet.getSweetDiscountOffer());
		return r;
	}

	public int delete(int sweetId) {
		
		String query="delete from Sweet where sweetId=?";
		int r=this.jdbcTemplate.update(query,sweetId);
		return r;
	}

	
	
}
