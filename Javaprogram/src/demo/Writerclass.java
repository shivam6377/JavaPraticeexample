package demo;
import java.io.FileWriter;
import java.io.Writer;

public class Writerclass {

    public static void main(String args[]) {

        String data = "This is the data in the output file";

        try {
            Writer output = new FileWriter("demo.txt");
            output.write(data);

            output.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}

