package com.collection;
import java.util.*;

class Patient{

String name;
int age;
String doctorName;
public Patient(String name, int age, String doctorName) {
this.name = name;
this.age = age;
this.doctorName = doctorName;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public int getAge() {
return age;
}
public String getDoctorName() {
return doctorName;
}
public void setDoctorName(String doctorName) {
this.doctorName = doctorName;
}
public void setAge(int age) {
this.age = age;
}
public String toString() {
return "[Patient name is: "+name+" and age is: "+age+" Doctor Name is: Dr. "+doctorName+"] ";
}
}



public class Hashmap_Hospital {
public static void main(String[] args) {
Map<Integer, Patient> Hospital_map = new HashMap<>();

Scanner sc = new Scanner(System.in);
System.out.println("Enter Numbers of Patient::");
int Count = sc.nextInt();
for(int i=1; i<=Count; i++) {
System.out.println("Enter Detais of "+i+" Patient::");
System.out.println("Name is: ");
String name = sc.next();
System.out.println("Age is: ");
int age = sc.nextInt();
System.out.println("Doctor Name is: ");
String doctorName = sc.next();
Patient obj = new Patient(name,age,doctorName);
Hospital_map.put(i, obj);
}
for(HashMap.Entry<Integer, Patient> entry:Hospital_map.entrySet()) {
System.out.println("Bed id: "+entry.getKey()+", "+entry.getValue());
}

Hospital_map.replace(1, new Patient("Mohit",21,"lala"));

for(HashMap.Entry<Integer, Patient> entry:Hospital_map.entrySet()) {
System.out.println("Bed id: "+entry.getKey()+", "+entry.getValue());
}
}
}