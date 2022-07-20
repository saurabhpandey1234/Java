package com.spring.project.dao;

import java.util.List;

import com.spring.poject.entities.Sweet;

public interface SweetDao {
	public int insert(Sweet sweet);
	
	public int delete(int sweetId);
}
