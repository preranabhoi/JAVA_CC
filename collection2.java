/*
Write a java code using ArrayList to perform CRUD operation on students data.
1.It should create a collection /List 
2.Read the student data
3.Update
4.Delete
 */

import java.util.ArrayList;


public class collection2 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("raj");
        names.add("ak");
        names.add("prerana");
        System.out.println("Initial Size: " + names.size());

        for (String student : names) {
            System.out.println("Student Name: " + student);
        }

        System.out.println("Student at index 1: " + names.get(1));

        names.set(1, "akash");
        System.out.println("Updated List: " + names);

        names.remove("raj");

        names.remove(0);

        System.out.println("Final Student List: " + names);
        System.out.println("Final Size: " + names.size());
    }
}
