package com.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Creation_hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> months =new HashSet<>();
		months.add("January");
		months.add("Febuary");
		months.add("January");
		months.add("April");
		months.add("March");
		months.add("May");
		
		System.out.println(months);
		
		Set<String> month =new TreeSet<>();
		month.add("January");
		month.add("Febuary");
		month.add("January");
		month.add("April");
		month.add("March");
		month.add("May");
		
		System.out.println(month);
		
		Set<Integer> days =new HashSet<>();
		days.add(1);
		days.add(6);
		days.add(2);
		days.add(4);
		days.add(3);
		days.add(5);
		
		System.out.println(days);	

	}

}
