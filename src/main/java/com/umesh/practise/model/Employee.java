package com.umesh.practise.model;

public class Employee {
	
	private String empName;
	private String addrees;
	private long id;
	
	public Employee(String empName, String address, long id) {
		this.empName = empName;
		this.addrees = address;
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getAddrees() {
		return addrees;
	}

	public void setAddrees(String addrees) {
		this.addrees = addrees;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	

}
