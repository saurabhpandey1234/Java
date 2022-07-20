package com.spring.project.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.poject.entities.Admin;





public class AdminDaoImpl implements AdminDao{
	private JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int insert(Admin admin) {
		// TODO Auto-generated method stub
		 String query="insert into  Admin (adminid,adminname,adminpassword) values(?,?,?)";
	        int r=this.jdbcTemplate.update(query,admin.getAdminid(),
	        		admin.getAdminname(),admin.getAdminpassword());
			return r;
		
	}
}
