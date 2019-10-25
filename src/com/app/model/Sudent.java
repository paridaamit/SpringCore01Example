package com.app.model;

public class Sudent 

{

	private String name;
	
	private int id;
	private String scl;
	public Sudent() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Sudent [name=" + name + ", id=" + id + "]";
	}
	
}
