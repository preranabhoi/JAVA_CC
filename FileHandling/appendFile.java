package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class appendFile {
public static void main(String[] args) {
try {
FileWriter writer = new FileWriter("sample.txt", true);
writer.write("\nThis is appended text.");
writer.close();
System.out.println("Data appended successfully.");
} catch (IOException e) {
e.printStackTrace();
}
}
}