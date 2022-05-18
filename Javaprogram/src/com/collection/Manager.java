package com.collection;


import java.util.HashMap;
import java.util.Map;

public class Manager{

	private Integer id;
	private String name;
	private String address;
	
	public Manager(Integer id, String name, String address) {
		super();
		this.id=id;
		this.name=name;
		this.address=address;	
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Manager [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

public class HashMapEmp{
	public static void main(String[] args) {
		Map<Integer, Manager> mang= new HashMap<>();
		mang.put(101, new Manager(101,"Shivam", "Jaipur"));
		mang.put(102, new Manager(102,"Mohit", "Jaipur"));
		
System.out.println(mang);
	}
}
}

