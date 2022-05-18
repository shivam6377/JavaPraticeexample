package demo;
class parent1
{
	void display()
	{
		System.out.println("Display");
	}
}
interface parent2
{
	default void show()
	{
		System.out.println("Show");
	}
	//void display();
}
public class Multipleinheritance extends parent1 implements parent2 {
   public static void  main(String[] args) {
	   Multipleinheritance obj=new Multipleinheritance();
	   obj.display();
	  obj.show();
   }
  // @Override
  // public
  // void display()
   //{
	   //System.out.println("Displaying...");
   //}
}
