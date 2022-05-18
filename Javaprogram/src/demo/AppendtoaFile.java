package demo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
class AppendtoaFile {
public static void appendStrToFile(String fileName,String str)
{
try {
BufferedWriter out = new BufferedWriter(
new FileWriter(fileName, true));
out.write(str);
out.close();
}
catch (IOException e) {
System.out.println("exception occurred" + e);
}
}
public static void main(String[] args) throws Exception
{
String fileName = "Demo.txt";
String str = "This is a file";
appendStrToFile(fileName, str);
try {
FileReader obj1 = new FileReader("Demo.txt");
BufferedReader in = new BufferedReader(obj1);
String mystring;
while ((mystring = in.readLine()) != null) {
System.out.println(mystring);
}
}
catch (IOException e) {
System.out.println("Exception Occurred" + e);
}
}
}
