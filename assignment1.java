//Write a Java program that accepts a number from the user.

// The program should:

// 1. Check whether the number is positive, negative, or zero using if-else.
// 2. If the number is positive, check whether it is even or odd.

import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            if(num>0){
                System.out.println("The Number is Positive");
                if(num%2==0){
                    System.out.println("The number is Even");
                }
                else{
                    System.out.println("The number is Odd");
                }
            }
            else if(num<0){
                System.out.println("The Number is Negative");
            }
            else{
                System.out.println("The number is Zero");
            }
        }
    }
}
