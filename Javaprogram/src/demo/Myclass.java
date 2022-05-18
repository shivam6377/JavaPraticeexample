package demo;
class D{
    void x(){
       System.out.println("static method of A base class x");
   }
  static void add(){
       int c,d;
       c=9;
       d=8;
       int sum= c+d;
        System.out.println(" method of A base class y and sum is "+sum);
   }
}
class B extends D {
     void x(){
       System.out.println("static method of B child class x");
   }
  static void add(){
       int c,d;
       c=1;
       d=2;
       int sum= c+d;
        System.out.println(" method of B base class add and sum is "+sum);
   }
   
}
public class Myclass {
   
   public static void main(String args[]) {
    
       D obj = new B();
       obj.add();
       obj.x();
   }
}

