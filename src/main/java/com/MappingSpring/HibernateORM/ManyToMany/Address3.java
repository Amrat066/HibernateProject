package com.MappingSpring.HibernateORM.ManyToMany;

import javax.persistence.*;


@Entity
@Table(name = "addressMM")
public class Address3 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "address")
    private String address;

    @Override
	public String toString() {
		return "Address3 [id=" + id + ", address=" + address + "]";
	}

	public Address3() {
    }

    public Address3(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

  
}
