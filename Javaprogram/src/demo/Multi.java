package demo;

 class Mult extends Thread {
@Override
public void run() {
	System.out.println("Thread is running");
}
 }
public class Multi{
public static void main(String[] args) {
	Mult m1=new Mult();
	m1.start();
		
	}
}
 
