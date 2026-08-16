package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class writeFile {
public static void main(String[] args) {
try {
FileWriter writer = new FileWriter("sample.txt");
writer.write("Hello, Java File Handling!");
writer.close();
System.out.println("Successfully written to the file.");
} catch (IOException e) {
e.printStackTrace();
}
}
}