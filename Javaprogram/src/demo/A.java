package demo;
 class Class1 {
    public static int Method1(){
          return 0;
    }
}
 class Class2 extends Class1 {
    public static int Method1(){
          return 1;
    }

}
public  class A {
    public static void main(String[] args){
    	Class1 a= new Class2();
    	a.Method1();
    }
}

