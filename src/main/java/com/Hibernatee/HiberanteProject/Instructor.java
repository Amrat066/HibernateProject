package com.Hibernatee.HiberanteProject;

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
@Table(name="instructor")
public class Instructor {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		@OneToMany(cascade=CascadeType.ALL)
		List<Course> course=new ArrayList<Course>();
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		@Column(name="firstname")
		private String firstname;
		@Column(name="lastname")
		private String lastname;
		@Override
		public String toString() {
			return "Instructor [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + "]";
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public List<Course> getCourse() {
			return course;
		}
		public void setCourse(List<Course> course) {
			this.course = course;
		}
		
         
}
