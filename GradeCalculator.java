//Q. Make a grade calculator of a student using If-Else
//90-100=A,

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
        System.out.print("Enter marks:");
        int marks = sc.nextInt();
        sc.nextLine();
        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade: A");
        } else if (marks >= 75 && marks < 90) {
            System.out.println("Grade: B");
        } else if (marks < 75 && marks >= 35) {
            System.out.println("Grade: C");
        } else if (marks < 35) {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid Marks");
        }
    }
        

    }

}
