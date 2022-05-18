package demo;

import java.io.File;
import java.io.IOException;
public class File_creation {
public static void main(String[] args) {
	try {
		File fileObj =new File("demo.txt");
		if(fileObj.createNewFile()) {
			System.out.println("File is created successfully as " + fileObj.getName());
		}
		else {
			System.out.println("File already exists. please change the name.");
		}
	}
	catch(IOException e) {
		System.out.println("Error occured in creating of file.");
		e.printStackTrace();
	}
}
}
