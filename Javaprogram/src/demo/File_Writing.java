package demo;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class File_Writing {
public static void main(String[] args) {
	try {
		FileWriter writerObj =new FileWriter("demo.txt");
		writerObj.write("good morning \n");
		writerObj.write("good afternoon \n");
		writerObj.write("good evening \n");
		
		writerObj.close();
		System.out.println("Succesfully the content is written");
	}
	catch(IOException e) {
		System.out.println("Error occured given file not exist.");
		e.printStackTrace();
	}
	/*try {
		Scanner ob=new Scanner(System.in);
		String str=ob.next();
		FileWriter Obj =new FileWriter("demo.txt");
		Obj.write(str);
		System.out.println("write the file");
		Obj.close();
	}
	catch(IOException e) {
		System.out.println(e);
}*/
}
}


