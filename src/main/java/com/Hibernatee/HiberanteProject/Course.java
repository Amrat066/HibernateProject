package com.Hibernatee.HiberanteProject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="title")
	private String title;
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public Course() {
		super();
	}
	public void setTitle(String title) {
		this.title = title;
	}
	

	
}
