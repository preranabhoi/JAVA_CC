/*Create a linked list string to store 5 students name and perform the following operation
1.add 5 names 
2.display the list 
3.add a new student at index 2
4.remove an element 
5.check whether student A exists
6.display the final size
 */

import java.util.LinkedList;

public class LLSample2 {
    public static void main(String[] args) {
LinkedList<String> students = new LinkedList<>();
students.add("prerana");
students.add("pooja");
students.add("harshala");
students.add("roshani");
students.add("divya");
System.out.println("List: " + students);

students.add(2, "hemangi");
System.out.println("After insertion: " + students);

students.remove(String.valueOf("hemangi"));
System.out.println("After removal: " + students);


System.out.println("Prerana Exists?: " + students.contains("prerana"));

System.out.println("Is empty: " + students.isEmpty());

System.out.println("Size: " + students.size());
}
}
