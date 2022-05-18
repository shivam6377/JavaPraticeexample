package demo;
class Demo1 implements Runnable{
	public void run()
	{
		System.out.println("Thread is running...");
	}
}
public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Demo1 d1=new Demo1();
Thread t1=new Thread(d1);
t1.start();
	}

}
