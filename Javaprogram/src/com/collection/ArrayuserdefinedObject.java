package com.collection;

import java.util.ArrayList;
import java.util.List;

class Customer{
	private String Name;
	private int age;
	
	public Customer(String Name, int age) {
		this.Name=Name;
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
	
	}


public class ArrayuserdefinedObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Customer> customer =new ArrayList<>();
customer.add(new Customer("Prattek", 21));
customer.add(new Customer("Ayush", 21));

customer.forEach(cust->{
	System.out.println("Names are" + cust.getName()+ "Age" + cust.getAge());
});
	}

}
