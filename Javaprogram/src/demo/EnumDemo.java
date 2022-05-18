package demo;
enum Fruit
{
   // Apple (p:10, w:200), Mango (p:9, w:500), Pineapple (p:12, w:600), Banana (p:15, w:543), Orange (p:8, w:876);
	 Apple(10), Mango(9), Pineapple(12), Banana(15), Orange(8);
	private int price;
//private int weight;
  
   // Fruit (int p, int w)
	 Fruit (int p)
    {
        price = p;
        //weight=w;
    }
	int getPrice ()
    {
        return price;
    }
   // int getweight ()
  //  {
   //     return weight;
    }
//}

public class EnumDemo
{
    public static void main (String[]args)
    {
        Fruit fr;
        // Display price of Mango
        System.out.println ("Mango costs: " + Fruit.Mango.getPrice () + "cents. \n");

        //Display all fruits and prices
        System.out.println ("All fruits prices:");
        for (Fruit f:Fruit.values ())
            System.out.println (f + " costs " + f.getPrice () + " cents. ");
    }
}