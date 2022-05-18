package demo;
//enums are always public static final
enum Price
{
ONCE,
TENS,
HUNDERED,
THOUSAND
}

public class Enumex  {

	Price price;
	public Enumex (Price price)
	{
		this.price =  price;
	}
	public void listofcount()
	{
		switch(price)
		{
		case ONCE:
			System.out.println("Once is 1");
		
		break;
		case TENS:
		System.out.println("Tens is 10");
	 
		break;
		
		case THOUSAND:
		System.out.println("Thousand is 90000");
	   break;
	 
default:
		   System.out.println("Nothing...");
		   break;

	}
}
	public static void main(String[] args) {
		String text = "THOUSAND";
		Enumex  t1 = new Enumex (Price.valueOf(text));
		t1.listofcount();
	}
}
