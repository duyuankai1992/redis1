package com.yztc.demo.entity;

import java.util.List;

public class Dept {
	
	private Integer id;
	private String name;
	private List<Emp> listEmp;
	
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
	public List<Emp> getListEmp() {
		return listEmp;
	}
	public void setListEmp(List<Emp> listEmp) {
		this.listEmp = listEmp;
	}
	
	

}
