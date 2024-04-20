package com.MappingSpring.HibernateORM.OneToMany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="StudentOM")
public class Student1 {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="name")
	private String name;
	
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
	@OneToMany(cascade =CascadeType.ALL )
	
	List<Address1> Add=new ArrayList<Address1>();

	public List<Address1> getAdd() {
		return Add;
	}

	public void setAdd(List<Address1> add) {
		Add = add;
	}
	
	
}
