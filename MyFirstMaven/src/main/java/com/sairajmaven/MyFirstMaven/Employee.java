package com.sairajmaven.MyFirstMaven;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int id;
	private String name;
	private double salary;
	private boolean isPermanent;
	private LocalDate empJoinDate;
	public Employee() {
		super();
	}
	public Employee(int id, String name, double salary, boolean isPermanent, LocalDate empJoinDate) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.isPermanent = isPermanent;
		this.empJoinDate = empJoinDate;
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean isPermanent() {
		return isPermanent;
	}
	public void setPermanent(boolean isPermanent) {
		this.isPermanent = isPermanent;
	}
	public LocalDate getEmpJoinDate() {
		return empJoinDate;
	}
	public void setEmpJoinDate(LocalDate empJoinDate) {
		this.empJoinDate = empJoinDate;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", isPermanent=" + isPermanent
				+ ", empJoinDate=" + empJoinDate + "]";
	}
	
	
}
