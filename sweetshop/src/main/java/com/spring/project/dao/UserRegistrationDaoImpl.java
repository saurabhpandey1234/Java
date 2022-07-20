package com.spring.project.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import com.spring.poject.entities.UserRegistration;

public class UserRegistrationDaoImpl implements UserRegistrationDao{
	
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int insert(UserRegistration userRegistration) {
		String query="insert into  UserRegistration (userid,username,useremail,userpassword,userconfirpassword) values(?,?,?,?,?)";
        int r=this.jdbcTemplate.update(query,userRegistration.getUserid(),
        		userRegistration.getUsername(),userRegistration.getUseremail(),userRegistration.getUserpassword(),
        		userRegistration.getUserconfirpassword());
		return r;
	}
}
