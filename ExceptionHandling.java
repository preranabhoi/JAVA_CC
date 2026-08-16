public class ExceptionHandling {

public static void main(String[] args) {

try {

// Code that may cause an exception
int result = 10 / 0;

System.out.println(result);

} catch (ArithmeticException e) {

// This executes when division by zero occurs
System.out.println("Cannot divide by zero");
}

// Program continues
System.out.println("Program continues...");
}
}


