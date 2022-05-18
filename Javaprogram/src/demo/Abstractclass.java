package demo;
abstract class Demo  
{   
abstract void display();

}  
public class  Abstractclass  extends Demo  
{    
void display()  
{  
System.out.println("Abstract method called.");  
}  
public static void main(String[] args)  
{    
	 Abstractclass  obj = new  Abstractclass  ();    
obj.display();  
}  
}  

