package com.MappingSpring.HibernateORM.ManyToMany;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "studentMM")
public class Student3 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
        name = "student_address",
        joinColumns = @JoinColumn(name = "student_id"),
        inverseJoinColumns = @JoinColumn(name = "address_id")
    )
    private List<Address3> address = new ArrayList<Address3>();

	@Override
	public String toString() {
		return "Student3 [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	public List<Address3> getAddress() {
		return address;
	}

	public void setAddress(List<Address3> address) {
		this.address = address;
	}

	public Student3() {
    }

    public Student3(String name) {
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

    
}
