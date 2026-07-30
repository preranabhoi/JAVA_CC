
import java.util.Scanner;

// write a java code to design a placement portal for a college where we will define the package of the student and the number of the student
// conditions
// 1.if student score 8.5 CGPA - 15 LPA
// 2.if student score 7.5 CGPA - 10 LPA
// 2.if student score 6.5 CGPA - 7 LPA
// 3.if student score less than 6.5 - NO PLACEMENENT

public class gradeSystem {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
        System.out.print("Enter CGPA:");
        float CGPA = sc.nextFloat();
        sc.nextLine();
        if ( CGPA>= 8.5) {
            System.out.println("15 LPA,10 students");
        } else if (CGPA>=7.5) {
            System.out.println("10 LPA,15 students");
        } else if (CGPA>=6.5) {
            System.out.println("7 LPA,20 students");
        } 
          else {
            System.out.println("NO PLACEMENT,15 students");
        }
    }
}
}
