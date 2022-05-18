package demo;

class Student1{
	String name;
	int age;
	Student1(){
		System.out.println("Non parametrized Consturctor Called.....");
	}
	Student1(String name, int age){
		this.name=name;
		this.age=age;
		System.out.println("parametrized Consturctor Called.....");
		System.out.println("Student name is "+name+ " and age is "+age );
	}
	Student1(Student1 s){
		this.name=s.name;
		this.age=s.age;
		System.out.println("Copy Consturctor Called.....");
		System.out.println("Student name is "+name+ " and age is"+age);
	}
}
public class Stud{

	public static void main(String[] args) {
		Stud obj=new Stud();
		Student1 obj1=new Student1("Vinod", 21);
		Student1 obj2=new Student1(obj1);
	}

}
