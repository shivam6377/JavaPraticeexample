package demo;

//import java.io.IOException;

public class Testexception {

	//public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
	public static void main(String[] args) {
try {
	int a=100;
	int b=0;
	int c=a/b;
	System.out.println(c);
	
}
catch(ArithmeticException ae)
{
	ae.printStackTrace();
	System.out.println(ae.getMessage());
	System.out.println(ae);
}
	}

}
