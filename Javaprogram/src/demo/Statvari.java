package demo;

class Counter {
    static int count = 0;
    Counter(){
        count ++;
    }
    public void getCount() {
        System.out.printf("Value of counter: %d \n", count);
    }
    public static void main( String args[] ) {
        Counter c1 = new Counter(); 
        c1.getCount();
        Counter c2 = new Counter(); 
        c2.getCount();
        Counter c3 = new Counter(); 
        c3.getCount();
    }
}
