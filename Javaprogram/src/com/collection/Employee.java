package com.collection;

import java.util.*;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class Employee implements Comparable<Employee> {
	//private static final String Employee = null;
	private int eid;
	private String name;
	

	public  Employee(int eid, String name) {
		super();
		this.eid=eid;
		this.name=name;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public int compareTo(Employee emp) {
		
		return this.getEid() - emp.getEid();
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + "]";
	}
	

	public static void main(String[] args) {
		SortedSet<Employee> emp = new TreeSet<>();
		
		emp.add(new Employee(101,"Prateek"));
		emp.add(new Employee(105,"Prathmesh"));
		emp.add(new Employee(103,"Shashank"));
		emp.add(new Employee(107,"Rahul"));
		
		
		System.out.println(emp);
		//custome comparator
		
		emp= new TreeSet<>(Comparator.comparing(Employee::getName));
		emp.add(new Employee(101,"Prateek"));
		emp.add(new Employee(102,"Prateek"));
		
		
		System.out.println(emp);
	}
	}
	
//		  NavigableSet<Employee> emp = new TreeSet<>();
//		  emp.add(new Employee(101,"Prateek"));
//			emp.add(new Employee(105,"Prathmesh"));
//			emp.add(new Employee(103,"Shashank"));
//		emp.add(new Employee(107,"Rahul"));
//		System.out.println(emp);
//		
//				
//		Employee firstElement = emp.first();
//        System.out.println("First Employee: " + firstElement);
//        
//        Employee lastElement = emp.last();
//        System.out.println("last Employee: " + lastElement);
//        
//        Employee emp1 = emp.pollFirst();
//        System.out.println("Remove first Employee: " + emp1);
//        System.out.println(emp);
//       
//	}
//}
