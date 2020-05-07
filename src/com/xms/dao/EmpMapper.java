package com.xms.dao;

import java.util.List;

import com.xms.annotation.MyAnnotation;
import com.xms.entity.Emp;
import com.xms.entity.MyInterface;

@MyAnnotation
public interface EmpMapper  {

	List<Emp>  findAll();
	
	
}
