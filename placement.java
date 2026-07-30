import java.util.Scanner;

public class placement {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){

        System.out.println("Enter your CGPA");           
        float cgpa =sc.nextFloat();
        
        System.out.println("Enter your backlogs(0/more)");           
        int backlogs=sc.nextInt();

        System.out.println("Enter your Attendance");           
        float attendance=sc.nextFloat();
       
        System.out.println("Enter your aptitudeScore");           
        float aptitudeScore=sc.nextFloat();
        

        if(cgpa >=7.0){
            if(backlogs==0){
                if(attendance>=75){
                    if(aptitudeScore>=60){
                        System.out.println("Student Eligible for Placement");
                    }
                    else{
                        System.out.println("Student Not Eligible for Placement, Aptitude Score is Less than 60");
                    }}
                    else{
                        System.out.println("Student Not Eligible for Placement, Attendance is Less than 75");
                    }}
                    else{
                        System.out.println("Student Not Eligible for Placement, because of BackLogs");

                    }}
                    else{
                        System.out.println("Student Not Eligible for Placement, CGPA is less than 7.0");
                    }
                }
    }
}
    

