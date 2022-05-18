package demo;

public class RunnableExample implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Inside: " + Thread.currentThread().getName());
System.out.println("creating Thread...");
Runnable runnable =new RunnableExample();

System.out.println("creating Thread...");
Thread thread=new Thread(runnable);

System.out.println("creating Thread...");
thread.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Inside : " + Thread.currentThread().getName());
	}

}
