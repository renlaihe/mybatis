package com.xms.entity;

import java.sql.Date;

public class Emp {
	//显示客户信息
	private Integer empno;
	private String ename;
	private Double salary;
	private Double bonus;
	private Date hiredate;
	private Integer deptno;
	public Integer getEmpno() {
		return empno;
	}
	//getset方法
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Double getBonus() {
		return bonus;
	}
	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public Integer getDeptno() {
		return deptno;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", salary=" + salary + ", bonus=" + bonus + ", hiredate="
				+ hiredate + ", deptno=" + deptno + "]";
	}
	
	

}
