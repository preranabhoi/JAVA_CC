//1. Number Series – Natural Numbers
// Problem Statement: Write a Java program to print the first 50 natural numbers using a for loop.

public class assignment2 {
    public static void main(String[] args){
        for(int i=1;i<=50;i++){
            System.out.println(i);
        }
    }
}

// 2. Employee Salary Slip Generator
// Problem Statement: Accept:
// Employee Name
// Basic Salary
// Calculate:
// HRA = 20% of Basic
// DA = 15% of Basic
// PF = 12% of Basic
// Display:
// Gross Salary
// Net Salary (Gross − PF)

public class Employee{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter your Name: ");
            String name = sc.nextLine();
          
            System.out.print("Enter your Basic Salary: ");
            float basicSalary = sc.nextFloat();

            float HRA=(basicSalary*20)/100;
            float DA=(basicSalary*15)/100;
            float PF=(basicSalary*12)/100;

            float grossSalary=basicSalary+HRA+DA;

            float netSalary=grossSalary-PF;

            System.out.println("Employee Name : " + name);

            System.out.println("Basic Salary : " + basicSalary);

            System.out.println("HRA : " + HRA);

            System.out.println("DA : " + DA);

            System.out.println("PF : " + PF);

           System.out.println("Gross Salary is:" +grossSalary);

           System.out.println("Net Salary is:" +netSalary);
        }
    
    }
}

// 3.Palindrome Number Checker
// Problem Statement: Write a Java program to check whether a given number is a palindrome.
// Example:
// Input: 1221
// Output: Palindrome


public class palindrome{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            int originalNumber = number;
            int reverse = 0;
    
            while (number != 0) {
                int digit = number % 10;
                reverse = reverse * 10 + digit;
                number = number / 10;
            }
    
            if (originalNumber == reverse) {
                System.out.println(originalNumber + " is a Palindrome.");
            } else {
                System.out.println(originalNumber + " is Not a Palindrome.");
            }
        }
    }}


    // 4.Armstrong Number Checker
    // Problem Statement: Write a Java program to check whether a given number is an Armstrong number.
    // Example:
    // Input: 153
    // Output: Armstrong Number


public class ArmstrongNumber {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)){

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = number;
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum = sum + (digit * digit * digit);
            number = number / 10;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong Number.");
        } else {
            System.out.println(originalNumber + " is Not an Armstrong Number.");
        }

    }
    }
}


// 5.Pair Sum
// Problem Statement: Given an array of integers and a target value, find two numbers whose sum is equal to the target. Print their indices.
// Example:
// Input:
// Array = [2, 7, 11, 15]
// Target = 9

// Output:
// Indices: 0 1

public class pairSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        pairSum solver = new pairSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        int[] result = solver.twoSum(nums, target);
        
        System.out.println("Indices: " + result[0] + " " + result[1]);
    }
}
    