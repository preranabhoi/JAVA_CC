package FileHandling;
/*
File handling is the process of crating,reading,writing ,updating and deleating files using javas built in classes
Its done mainly from java.io and java.nio.file packages
Some of the common file handlling operations are:
there are usually 5 main operations:
1.create,
2.read from a file,
3.write to a file,
4.append data to a file, and
5.delete a file */

import java.io.File;
import java.io.IOException;

public class createFile {
public static void main(String[] args) {
try {
File file = new File("sample.txt");
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

/*
steps to create a file:
1.we create a file by using createNewFile() method
2.first we import a file by using import java.io.file
3.now we will create a file object by using command ----------> File file=new File("data.txt")
4.now we will create the actual file by using the following command -------> file.createNewFile()
Note-- since create new file can cause an IOexception so we are using try and catch block.
 */