package demo;
class RBI
{
	public void setofrules()
	{
		System.out.println("rules will be followed by all bank");
	}
}
class Bank extends RBI
{
	public int rateofinterest() {
		System.out.println("current rate if interest is 6.5%");
		return 0;
	}
}
class ICICI extends Bank
{
	void statementwithdrwal()
	{
		System.out.println("we mail account statement instantly");
	}
}
public class SBI extends Bank {
	void loanFacility()
	{
		System.out.println("we provide loan based on salary amount");
	}
	void creditcardFacility()
	{
		System.out.println("we provide card to our customer");
	}
	public static void main(String[] args)
	{
		SBI bank=new SBI();
		bank.rateofinterest();
		ICICI ba=new ICICI();
		bank.creditcardFacility();
		bank.loanFacility();
		bank.setofrules();
		ba.statementwithdrwal();
	}

}
