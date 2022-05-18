package com.collection;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Hashsetwithlinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> days = new LinkedList<>();
		days.add(6);
		days.add(3);
		days.add(5);
		days.add(3);
		
		System.out.println(days);
		
		List<Integer> months = new LinkedList<>();
		months.add(1);
		months.add(3);
		months.add(2);
		months.add(3);
		
		System.out.println(months);
		
		Set<Integer> weeks =new HashSet<>(days);
		weeks.addAll(months);
		months.remove(1);
		System.out.println(months);
		System.out.println(weeks);
		weeks.remove(2);
		System.out.println(weeks);
	}

}
