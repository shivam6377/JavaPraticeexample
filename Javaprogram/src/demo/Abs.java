package demo;
public class Abs
{
     public static void main (String[]args)
     {
         Ban b;
         b = new SCI ();
         System.out.println ("SBI Rate of Interest is: " + b.getRateOfInterest () + " %");
         b = new PNB ();
         System.out.println ("PNB Rate of Interest is: " + b.getRateOfInterest () +" %");
     }
}

abstract class Ban
{
     abstract int getRateOfInterest ();
}
class SCI extends Ban
{
     int getRateOfInterest ()
     {
         return 7;
     }
}
class PNB extends Ban
{
     int getRateOfInterest ()
     {
        return 8;
     }
}
