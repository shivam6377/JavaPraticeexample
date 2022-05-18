package demo;

class UnderAge extends Exception{
	UnderAge()
	{
		super("You are under  age");
	}
	UnderAge(String message)
	{
		super(message);
	}

}

public class Voting
{
  public static void main(String[] args) {
	int age = 20;
	try {
	if(age< 18)
	{
		throw new UnderAge("You can not vote as your age is below 18");
	}
	else
	{
		System.out.println("you can vote now...");
	}
	}
	catch(UnderAge e)
	{
		e.printStackTrace();
	}
}	
}
