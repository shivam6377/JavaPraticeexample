package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Array_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	List<Integer> list=new ArrayList();
		list.add(8);
		list.add(3);
		list.add(13);
System.out.println(list);
Collections.sort(list);
System.out.println(list);
list.remove(0);
System.out.println(list);
	}

}
*/
	/*	List<String> names = new ArrayList();
		names.add("Mohit");
		names.add("Vinod");
		names.add("Shivam");
		names.add("Anushka");
		System.out.println("Does name array contain \"Vinod\"?:" +names.contains("Vinod"));
		System.out.println("indexof \"Shivam\":" + names.indexOf("Shivam"));
		System.out.println("lastindexof \"Anushka\":" + names.lastIndexOf("Anushka"));
		
	}
}
*/
		
		ArrayList<String> tvshows = new ArrayList();
		tvshows.add("Games of throne");
		tvshows.add("Friends");
		tvshows.add("Breaking bad");
		tvshows.add("Friends forever");
		
		System.out.println(tvshows);
		
		tvshows.forEach(tvshow ->{
			System.out.println(tvshow);
		}); 

	/*	Iterator<String> tvshowiterator =tvshows.iterator();
		while(tvshowiterator.hasNext()) {
			String tvshow1 =tvshowiterator.next();
			System.out.println(tvshow1);
			} */
	}
}
		