/*
write a java code for maintaining students record using file Handling
1.create a file for students entry
2.write a new entry in it
3.delete the new entry
*/
package FileHandling2;


import java.io.File;
import java.io.IOException;

public class createFile {
public static void main(String[] args) {
try {
File file = new File("student.txt");
if (file.createNewFile()) {
System.out.println("File created: " + file.getName());
} else {
System.out.println("File already exists.");
}
} catch (IOException e) {
System.out.println("An error occurred.");
e.printStackTrace();
}
}
}
