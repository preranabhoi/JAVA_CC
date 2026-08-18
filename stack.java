/*
There are 6 operations of stack
write a java program to reverse a string using stack
*/
import java.util.Stack;
public class stack{
    public static void main(String[] args){
        String original = "Hello";

        Stack<Character> stack=new Stack<>();

        for (int i = 0; i < original.length(); i++) {
            stack.push(original.charAt(i));
        }


        String reversed="";
        while(!stack.isEmpty()){
        reversed=reversed+stack.pop();
        }

        System.out.println("original : " +original);
        System.out.println("Reversed : " +reversed);

    }
}