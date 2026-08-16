/*
LEVEL-1
create a hash map storing students name and marks=3
add all the students
print marks of b
print total no. of students 
*/

/*
LEVEL-2

create a hash map of student roll numbers and name 
remove the student whose roll number is 105
print the updated hashmap
 */

import java.util.HashMap;

public class HAshMAp2 {
    public static void main(String[] args) {

HashMap<String, Integer> marks = new HashMap<>();

marks.put("A", 90);
marks.put("B", 85);
marks.put("C", 105);

System.out.println(marks.get("B"));

System.out.println(marks.size());

marks.remove(105);

System.out.println("updated hashmap is: "+marks);
}
}

