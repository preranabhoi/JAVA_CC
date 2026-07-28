//Write a java code for displaying the top performer based on the salary structure which is as follows
//if salary=50000 ===> tax=9% 
//if salary>100000 ===> tax=12% 
//if salary>500000 ===> tax=15% 
//if annual salary<1000000 ===> No Tax
//Based on the above tax slab display who is the top tax payer.

public class Tax {
    public static void main(String[] args){
      
float salary=600000;

        if(salary==50000){
            System.out.println("tax is 9%");
        }
        else if(salary<=100000){
            System.out.println("tax is 12%");
        }
        else if(salary>=500000){
            System.out.println("tax is 15%, Top Tax Player");
        }
        
    }
}
