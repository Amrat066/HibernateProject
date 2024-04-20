package com.HibernateMapping.TblPerClassHierchy;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("sportscar")

public class Sports_Car extends Car{

	
	   @Column(name="mileage")
	   private int mileage;

	   @Column(name="cost")
	   private int cost;

	   public int getMileage() {
	   return mileage;
	
	 }

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}}
