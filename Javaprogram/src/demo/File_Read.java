package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class File_Read {
	  public static void main(String[] args) {
	    try {
	      // Creating the File Object for reading the Data
	      File fileObj = new File("demo.txt");
	      Scanner readingObj = new Scanner(fileObj);
	      while (readingObj.hasNextLine()) {
	        String data = readingObj.nextLine();
	        System.out.println(data);
	      }
	      readingObj.close();
	    }
	    
	 catch(FileNotFoundException e) {
	      System.out.println("The Given File does not Exist");
	      e.printStackTrace();
	    }
	  }
	}

