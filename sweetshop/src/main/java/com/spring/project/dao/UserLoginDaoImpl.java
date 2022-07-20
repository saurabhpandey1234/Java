package com.spring.project.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.poject.entities.UserLogin;



public class UserLoginDaoImpl implements UserLoginDao{
	
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int insert(UserLogin useradmin) {
		String query="insert into  UserLogin (userid,username,userpassword) values(?,?,?)";
        int r=this.jdbcTemplate.update(query,useradmin.getUserid(),
        		useradmin.getUsername(),useradmin.getUserpassword());
		return r;
	}
}
