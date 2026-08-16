 /*
LEVEL-3 
for hash map looping we are going to use entrySet() , keySet() iterations
*/

import java.util.HashMap;
import java.util.Map;

public class HAshMAp3 {
public static void main(String[] args) {

HashMap<Integer, String> students = new HashMap<>();

students.put(101, "A");
students.put(102, "R");
students.put(103, "Kans");
students.put(104, "Nia");

for (Map.Entry<Integer, String> entry : students.entrySet()) {
System.out.println(entry.getKey() + " : " + entry.getValue());
}
}
} 
    

