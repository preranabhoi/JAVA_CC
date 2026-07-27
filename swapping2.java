
public class swapping2 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        
        System.out.println("Value of a before swapping is:" +a);
        System.out.println("Value of b before swapping is:" +b);

        a=a+b;
        b=a-b;
        a=a-b;
        
        System.out.println("Value of a after swapping is:" +a);
        System.out.println("Value of b after swapping is:" +b);
    }
}
