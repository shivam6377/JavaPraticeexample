class Student
{
	int rollNumber;
	String name;
	static String collegename="DCIT";
	
	public Student(int rollNumber, String name) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
	}
   
	void display()
	{
		System.out.println(rollNumber + "" + name + "" + collegename);
	}
	
}
public class StaticDemo
{
	public static void main(String[] args) {
		Student s1 = new Student( 11, "dev");
		Student s2 = new Student( 02, "raj");
		
		s1.display();
		s2.display();
}
}
