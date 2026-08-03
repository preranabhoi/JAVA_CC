//Calling Method Multiple Times

public class method1 {
    static void greet(){
        System.out.println("Good Morning");
        System.out.println("Good Afternoon");
        System.out.println("Good Evening");
    }
    public static void main(String[] args){
        greet();
        greet();
        greet();
}
}