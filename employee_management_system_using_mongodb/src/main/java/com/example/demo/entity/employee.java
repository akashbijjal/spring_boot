package com.example.demo.entity;

import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection="employee")
public class employee {

	private int id;
	private String name;
	private int salary;
	public employee() {
		super();
	}
	
	public employee(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
}
