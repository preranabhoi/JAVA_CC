//Write  a JAVA program to calculate electricity bill based on the no. of units consumed
//Use the following teriff rate
//100 unit consumed-rs 1.50 rate
//next 100 unit (101-200) consumed-rs 2.50 rate
//next 100 unit (201-300) consumed-rs 4 rate
//above 300 unit consumed-rs 6 rate
//There are some additional conditions:
//add a fixed meter charge of rs 100
//if the total bill exceeds rs 1000 apply a 10% extra charge on the bill amount

import java.util.Scanner;

///Display customer name,consumer id,units consumed,total bill amount

public class Electricity {
    public static void main(String[] args) {
        try(Scanner SC=new Scanner(System.in);){

            

            System.out.print("Enter Name:");
            String name=SC.nextLine();

            System.out.print("Enter Customer id:");
            int customer_id=SC.nextInt();
            SC.nextLine();

            System.out.print("Enter units consumed:");
            int units_consumed=SC.nextInt();
         
            double total_bill = 0;
            float meterCharge=100;

            if(units_consumed<=100){
                total_bill=units_consumed*1.5;
                
            }
            else if(units_consumed>=101 && units_consumed<=200){
                total_bill=units_consumed*2.5;
            }
            else if(units_consumed>=201 && units_consumed<=300){
                total_bill=units_consumed*4;
                
            }
            else if(units_consumed>300){
                total_bill=units_consumed*6;
                
                
            }
             
            total_bill+=meterCharge;
            
            
            if(total_bill>1000){
                total_bill+=(total_bill*10)/100;
               
              
       
        }

        
        System.out.println("total bill is: " + total_bill);

           }

        
    }
}
