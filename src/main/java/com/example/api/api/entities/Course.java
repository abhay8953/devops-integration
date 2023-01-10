package com.example.api.api.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	@Id
  private long id;
  private String title;
  private String description;
  private double price;
  
@Override
public String toString() {
	return "Course [id=" + id + ", title=" + title + ", description=" + description + ", price=" + price + "]";
}
public Course(long id, String title, String description, double price) {
	super();
	this.id = id;
	this.title = title;
	this.description = description;
	this.price = price;
}
public Course() {
	super();
	// TODO Auto-generated constructor stub
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
  
}
