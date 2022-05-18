package com.collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.PriorityQueue;
class Employee1 implements Comparable < Employee1 >{
	    private String name;
	    private double salary;
	 public Employee1 (String name, double salary)
	    {
	        this.name = name;
	        this.salary = salary;
	    }
	 
	 
public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}


@Override
	public String toString() {
		return "Employee1 [name=" + name + ", salary=" + salary + "]";
}
@Override
public int compareTo (Employee1 employee)
{
    if (this.getSalary () > employee.getSalary ())
    {
        return 1;
    }
    else if (this.getSalary () < employee.getSalary ())
    {
        return -1;
    }
    else
    {
        return 0;
    }
}

public class PriorityQueueexam {
	public static void main (String[]args)
    {
        // Create a PriorityQueue
        PriorityQueue < Employee1 > employeePriorityQueue = new PriorityQueue <> ();
        // Add items to the Priority Queue
        employeePriorityQueue.add (new Employee1 ("Rajeev", 100000.00));
        employeePriorityQueue.add (new Employee1 ("Chris", 145000.00));
        employeePriorityQueue.add (new Employee1 ("Andrea", 115000.00));
        employeePriorityQueue.add (new Employee1 ("Jack", 167000.00));
        /*
            The compareTo() method implemented in the Employee class is used to determine
            in what order the objects should be dequeued.
        */
        while (!employeePriorityQueue.isEmpty ())
        {
            System.out.println (employeePriorityQueue.remove ());
        }
//       Iterator<Employee1> itr =employeePriorityQueue.iterator ();
//        while (itr.hasNext ())
//        {
//            System.out.println (itr.next ());
//        }
//        employeePriorityQueue.remove();
//        employeePriorityQueue.poll();
//        System.out.println ("After removing two elements:");
//       
//        Iterator<Employee1> itr2 = employeePriorityQueue.iterator ();
//        while (itr2.hasNext ())
//        {
//            System.out.println (itr2.next ());
//        }
}
	

}
}
