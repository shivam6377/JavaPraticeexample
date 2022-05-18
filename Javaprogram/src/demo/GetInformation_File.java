package demo;

import java.io.File;
public class GetInformation_File {
	public static void main(String[] args) {
		File fileObj =new File("demo.txt");
		if (fileObj.exists()) {
		      // Getting the name of the File
		      System.out.println("Name of the File: " + fileObj.getName());
		      // Getting the Path of the File
		      System.out.println("The Path of the File: " + fileObj.getAbsolutePath());
		      // Display the writable permission of the File
		      System.out.println("File Writable: " + fileObj.canWrite());
		      // Display the readable permission of the File
		 System.out.println("File Readable: " + fileObj.canRead());
		      // Getting the Length of the File in Bytes
		      System.out.println("File size in bytes " + fileObj.length());
		    }
		else {
			System.out.println("The Given file is not Exist");
		}
	}
}
