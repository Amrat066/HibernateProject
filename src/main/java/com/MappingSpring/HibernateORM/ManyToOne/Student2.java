package com.MappingSpring.HibernateORM.ManyToOne;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name="StudentMO")
public class Student2 {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="name")
	private String name;
	
	
	@ManyToOne
	@Cascade(CascadeType.ALL)
	private Address2 address;


	@Override
	public String toString() {
		return "Student2 [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	public Student2(String name) {
		super();
		this.name = name;
		
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

	public Address2 getAddress() {
		return address;
	}

	public void setAddress(Address2 address) {
		this.address = address;
	}

	
	
	
	
	
	

}
