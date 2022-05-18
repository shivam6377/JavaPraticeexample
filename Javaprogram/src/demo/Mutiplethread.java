package demo;

class Mul extends Thread {
@Override
public void run() {
	System.out.println("Thread is running");
}
}
class Mul2 extends Thread {
@Override
public void run() {
	System.out.println("Thread2 is running");
}
}
public class Mutiplethread{
public static void main(String[] args) {
	Mul m1=new Mul();
	Mul2 m2=new Mul2();
	m1.start();
		m2.start();
	}

}