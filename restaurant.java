
import java.util.Scanner;

// Smart restaurant billing system

// our restaurant offer the following menu

// choice    item        price
// 1         pizza       250
// 2         burger      120
// 3         sandwich    150
// 4         cold drink  50
// 5         pasta       180

//write a java program that
// 1.displays the menu
// 2.takes the users choice
// 3.takes the quantity
// 4.use switch-case to determine item prize
// 5.calculate total bill
// 6.if the total bill is greater than 1000 then give a 10% discount

//e.g enter choice 1
//enter quantity 5
//output-item-pizza
//prize-250
//quantity-5
//total bill-1250
//dicount 125
//final bill-1125


public class restaurant {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String item = "";
        int price = 0;
        int choice, quantity;
        double totalBill, discount = 0, finalBill;

        // Menu
        System.out.println("===== RESTAURANT MENU =====");
        System.out.println("1. Pizza      - Rs.250");
        System.out.println("2. Burger     - Rs.120");
        System.out.println("3. Sandwich   - Rs.150");
        System.out.println("4. Cold Drink - Rs.50");
        System.out.println("5. Pasta      - Rs.180");

        System.out.print("\nEnter your choice: ");
        choice = sc.nextInt();

        System.out.print("Enter quantity: ");
        quantity = sc.nextInt();

        switch (choice) {
            case 1:
                item = "Pizza";
                price = 250;
                break;

            case 2:
                item = "Burger";
                price = 120;
                break;

            case 3:
                item = "Sandwich";
                price = 150;
                break;

            case 4:
                item = "Cold Drink";
                price = 50;
                break;

            case 5:
                item = "Pasta";
                price = 180;
                break;

            default:
                System.out.println("Invalid Choice!");
                sc.close();
                return;
        }

        totalBill = price * quantity;

        if (totalBill > 1000) {
            discount = totalBill * 0.10;
        }

        finalBill = totalBill - discount;

        System.out.println("\n===== BILL =====");
        System.out.println("Item      : " + item);
        System.out.println("Price     : Rs." + price);
        System.out.println("Quantity  : " + quantity);
        System.out.println("Total Bill: Rs." + totalBill);
        System.out.println("Discount  : Rs." + discount);
        System.out.println("Final Bill: Rs." + finalBill);

        sc.close();
    }
}