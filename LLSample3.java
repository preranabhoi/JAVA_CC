/*
create a linked list representing a shopinng cart 
1.add laptop mouse Keyboard
2.add headphones at index 1
3.display the items at index 2
4.remove mouse
5.check whether laptop is present
6.display the final cart
challenge-print the final cart using for each loop
 */

import java.util.LinkedList;

public class LLSample3 {
     public static void main(String[] args) {
LinkedList<String> shopping = new LinkedList<>();
shopping.add("laptop");
shopping.add("mouse");
shopping.add("keyboard");

System.out.println("List: " + shopping);

shopping.add(1, "headphones");
System.out.println("After insertion: " + shopping);

System.out.println("Number at index 2:" +shopping.get(2));

shopping.remove(String.valueOf("mouse"));
System.out.println("After removal: " + shopping);

System.out.println("Laptop Exists?: " + shopping.contains("laptop"));


System.out.println("Final Cart: " + shopping);

System.out.print("Final cart using for each loop is: " );
for(String cart:shopping){
    System.out.print(cart+ " ");
}
}
}
