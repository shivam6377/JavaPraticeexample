package com.collection;
import java.util.LinkedList;
import java.util.List;
import java.util.*;

public class Linkedlist_Create {
	public static void main(String[] args) {
		List<String> friendlist = new LinkedList<>();
		friendlist.add("Atul");
		friendlist.add("Aditya");
		friendlist.add("Aditi");
		friendlist.add("Jai");
		friendlist.add("Shivam");
		friendlist.add("Himanshu");
		
		System.out.println("initial linked list" +friendlist);
		
		friendlist.add(2,"Versha");
		System.out.println(friendlist);
		//((LinkedList<String>) friendlist).addFirst("Prateek");
		System.out.println(friendlist);
		
		((LinkedList<String>) friendlist).addLast("Muskan");
		System.out.println(friendlist);
		
		List<String> familylist = new LinkedList<>();
		familylist.add("nisha");
		familylist.add("neha");
		
		friendlist.addAll(familylist);
		System.out.println(friendlist);
friendlist.addAll(familylist);
		System.out.println(friendlist);
		((LinkedList<String>) friendlist).addFirst("Prateek");
		System.out.println(friendlist);
		
		((LinkedList<String>) friendlist).addLast("Muskan");
		System.out.println(friendlist);
	}

}
