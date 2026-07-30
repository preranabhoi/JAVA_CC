//write a java code for making an arithmetic calculator using switch case

import java.util.Scanner;

public class ArithmeticCalc {
    public static void main(String[] args){
         try (Scanner SC = new Scanner(System.in)){

            System.out.print("Enter the value of a: ");
            int a = SC.nextInt();

            System.out.print("Enter the value of b: ");
            int b = SC.nextInt();

            System.out.print("Enter the Operator: ");
            char op = SC.next().charAt(0);

            switch(op){
                case '+':
                    System.out.println(a+b);
                    break;
                case '-':
                    System.out.println(a-b);
                    break;
                case '*':
                    System.out.println(a*b);
                    break;
                case '/':
                    System.out.println(a/b);
                    break;
                default:
                    System.out.println("Invalid");
            }


         }

        }
    }

