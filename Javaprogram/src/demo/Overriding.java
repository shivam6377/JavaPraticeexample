package demo;
class parent{
	void print() {
		System.out.println("parent class");
	}
}
class child extends parent{
	@Override
	void print() {
		System.out.println("child class");
	}
}
public class Overriding {
	public static void main(String[] args) {
		
parent obj1=new parent();
child obj2=new child();
obj1.print();
obj2.print();

	}
}
