package com.yztc.demo.entity;

public class Emp {
	
	private Integer id;
	private String name;
	private double sal;
	
	private Dept dept;
	
	
	public static String staticMethod(){
		System.out.println("¾²Ì¬·½·¨");
		return "Hello Ognl!";
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	
	

}
