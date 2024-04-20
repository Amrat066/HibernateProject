package com.HQLPROJECT.HQL;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User_master")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	@Column(name="Uname")
	private String Uname;
	
	@Column(name="Address")
	private String Address;
	
	
	@Column(name="Salary")
	private String Salary;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUname() {
		return Uname;
	}


	public void setUname(String uname) {
		Uname = uname;
	}


	public String getAddress() {
		return Address;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", Uname=" + Uname + ", Address=" + Address + ", Salary=" + Salary + "]";
	}


	public void setAddress(String address) {
		Address = address;
	}


	public String getSalary() {
		return Salary;
	}


	public void setSalary(String salary) {
		Salary = salary;
	}
	

}
