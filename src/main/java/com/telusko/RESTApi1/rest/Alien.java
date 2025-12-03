package com.telusko.RESTApi1.rest;

public class Alien 
{
	
	private Integer id;
	private String name;
	
	private String city;

	public Alien(Integer id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Alien [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	

}
