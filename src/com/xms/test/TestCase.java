package com.xms.test;

import java.util.List;


import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xms.dao.EmpMapper;
import com.xms.entity.Emp;

public class TestCase {

	@Test
	public void testOne() {
		System.out.println("0");
		ClassPathXmlApplicationContext  context= 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		System.out.println("1");
		EmpMapper empMapper = context.getBean("empMapper", EmpMapper.class);
		System.out.println("2");
		
		List<Emp>   emps= empMapper.findAll();
		
		for (Emp emp : emps) {
			System.out.println(emp);
		}
		
		context.close();
		
	}
}
