package FileHandling2;

import java.io.FileWriter;
import java.io.IOException;

public class writeFile {
public static void main(String[] args) {
try {
FileWriter writer = new FileWriter("student.txt");
writer.write("Student 1 Information Entered!");
writer.close();
System.out.println("Successfully written to the file.");
} catch (IOException e) {
e.printStackTrace();
}
}
}