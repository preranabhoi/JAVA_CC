import java.util.LinkedList;

public class LLsample {
public static void main(String[] args) {
LinkedList<Integer> numbers = new LinkedList<>();
numbers.add(10);
numbers.add(20);
numbers.add(30);
System.out.println("List: " + numbers);

System.out.println("Element at index 1: " + numbers.get(1));

numbers.add(1, 15);
System.out.println("After insertion: " + numbers);

numbers.remove(Integer.valueOf(20));
System.out.println("After removal: " + numbers);

System.out.println("Size: " + numbers.size());

System.out.println("Contains 30: " + numbers.contains(30));

System.out.println("Is empty: " + numbers.isEmpty());
}
}