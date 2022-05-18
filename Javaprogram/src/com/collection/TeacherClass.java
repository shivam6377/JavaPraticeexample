package com.collection;

public class TeacherClass {

	private String Name;
	private int age;
	
	 
	public TeacherClass(String name, int age) {
		// TODO Auto-generated constructor stub
		this.Name=name;
		this.age=age;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "TeacherClass [Name=" + Name + ", age=" + age + "]";
	}
	
	}

