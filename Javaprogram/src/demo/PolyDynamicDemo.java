package demo;

interface A1
{
    public int add();	
}
class A2 implements A1 {
	   @Override
	   public int add()
	   {
		   int a=10,b=10,c=a+b;
		   System.out.println(c);
		   return c;
	   }
}

 class A3 extends A2{
   @Override
   public int add()
   {
	   int a=16,b=10,c=a+b;
	   System.out.println(c);
	   return c;
   }
}
class PolyDynamicDemo
{
  public static void main(String[] args) {
	A3 obj = new A3();
	obj.add();
	//obj.add();
	
}	
}
