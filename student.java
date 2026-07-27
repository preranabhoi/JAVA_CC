
import java.util.Scanner;

public class student {
    public static void main(String [] args){
        try (Scanner SC = new Scanner(System.in)){
            System.out.print("Enter Name: ");
        String name=SC.nextLine();
        System.out.print("Enter Roll: ");
        int Roll= SC.nextInt();
        SC.nextLine();
        System.out.print("Enter Branch: ");
        String Branch=SC.nextLine();
        System.out.print("Enter College: ");
        String college=SC.nextLine();
        System.out.print("Enter City: ");
        String city=SC.nextLine();

        System.out.println("Name:" + name);
        System.out.println("Roll:" + Roll);
        System.out.println("Branch:" + Branch);
        System.out.println("College:" + college);
        System.out.println("City:" + city);

        }
    }
}
