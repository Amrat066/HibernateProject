package com.HQLPROJECT.NamedQuery;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.NamedQueries;

@Entity
@Table(name="Student")
@NamedQueries({
    @NamedQuery(
        name = "findStudentByName",
        query = "SELECT e FROM Student e WHERE e.name = :name"
    ),
    @NamedQuery(
        name = "findStudent",
        query = "FROM Student"
    ),
    @NamedQuery(
        name = "DeleteById",
        query = "DELETE from Student WHERE id=:id"
    ),
    @NamedQuery(
        name = "UpdateById",
        query = "UPDATE Student SET name=:name, address=:address, age=:age WHERE id=:id"
    )
})


public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="address")
	private String address;

	@Column(name="age")
	private int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
	
	

}
