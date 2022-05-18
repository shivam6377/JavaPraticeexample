package com.collection;

import java.util.HashSet;
import java.util.Set;

class SetuserdefinedObject{

		public static void main(String[] args) {
			
			TeacherClass obj1 =new TeacherClass("Prattek", 21);
			TeacherClass obj2 =new TeacherClass("Prany", 21);
			TeacherClass obj3 =new TeacherClass("Ayush", 21);
			TeacherClass obj4 =new TeacherClass("mukul", 21);
			Set<TeacherClass> TeacherClass =new HashSet<>();
			TeacherClass.add(obj1);
			TeacherClass.add(obj2);
			TeacherClass.add(obj3);
			TeacherClass.add(obj4);
			
			
			
			for (TeacherClass teach : TeacherClass) {
				System.out.println(teach.toString());
			}
		
		}
	}


