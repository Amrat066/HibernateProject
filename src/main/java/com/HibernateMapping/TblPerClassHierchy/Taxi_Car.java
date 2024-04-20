package com.HibernateMapping.TblPerClassHierchy;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("taxicar")
public class Taxi_Car extends Car{
   @Column(name="farePerKm")
   private int farePerKm;

   public int getFarePerKm() {
	return farePerKm;
}
   @Column(name="available")
   private boolean available;

public void setFarePerKm(int farePerKm) {
	this.farePerKm = farePerKm;
}

public boolean isAvailable() {
	return available;
}

public void setAvailable(boolean available) {
	this.available = available;
}


  }