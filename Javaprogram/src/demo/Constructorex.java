package demo;

//parent class
class ParentClass
{
	// Whenever a child class constructor gets invoked, it implicitly invokes the constructor of parent class. 
	ParentClass()
	{
		System.out.println("Constructor of ParentClass is called");
	}
}

//child class
public class Constructorex extends ParentClass{
	
	// Instance variables
	String name;
	String street;
	String city;

	// Constructor initializes the newly created object.
	// Constructor does not have return type
	// Constructor has same name as class
	// If you do not implement constructor in the class, Java compiler inserts a default constructor.
	// Constructors with no arguments are called no-arg constructors.
	Constructorex() // this is no-arg constructor
	{
		/* Compiler implicitly adds the "super()" keyword here as the first statement which invokes the default constructor of parent class */
		/* Constructor of parent class is invoked when new object is created for child class */
		
		name = "John";
	}
	
	// Constructors with arguments (parameters) are called Parameterized constructors
	Constructorex(String pName) // this is parameterized constructor
	{
		/* Compiler implicitly adds the "super()" keyword here as the first statement which invokes the default constructor of parent class */
		/* Constructor of parent class is invoked when new object is created for child class */
		
		name = pName;
	}
	
	Constructorex(int pId, String pName)
	{
		/* Compiler implicitly adds the "super()" keyword here as the first statement which invokes the default constructor of parent class */
		/* Constructor of parent class is invoked when new object is created for child class */
		
		// When a constructor calls another constructor of the same class, it is called "Constructor Chaining".
		// Constructor call, if used, must be the first statement in a constructor
		this("Street 1", "Coimbatore");
		
		name = pName;
		
		//System.out.println("Street: " + street);
		//System.out.println("City: " + city);
	}
	
	Constructorex(String pStreet, String pCity)
	{
		/* Compiler implicitly adds the "super()" keyword here as the first statement which invokes the default constructor of parent class */
		/* Constructor of parent class is invoked when new object is created for child class */
		
		street = pStreet;
		city = pCity;
	}
	
	// copy constructor
	Constructorex(Constructorex pObj)
	{
		/* Compiler implicitly adds the "super()" keyword here as the first statement which invokes the default constructor of parent class */
		/* Constructor of parent class is invoked when new object is created for child class */
		
		name = pObj.name;
		street = pObj.street;
		city = pObj.city;
	}
	void display()
	{
		System.out.println(name);
		System.out.println(street);
		System.out.println(city);
	}

	
	/* Having more than one constructor with different parameters is known as Constructor Overloading */
	
	public static void main(String[] args) {
		
		// new keyword creates an object of class ConstructorExample and
		// invokes the constructor to initialize the newly created object
		Constructorex obj1 = new Constructorex(); // no-arg constructor is invoked
		
		System.out.println(obj1.name);
		
		// Parameterized constructor with String parameter is invoked
		Constructorex obj2 = new Constructorex("Peter");
		System.out.println(obj2.name);
		
		// Parameterized constructor with two arguments (int, String) is invoked
		Constructorex obj3 = new Constructorex(1, "Kennady");
		System.out.println("\n*** Display obj3 values ***");
		obj3.display();
		
		// Parameterized constructor with object as argument is invoked
		Constructorex obj4 = new Constructorex(obj3);
		System.out.println("\n*** Display obj4 values ***");
		obj4.display();
	}
	
	
}


