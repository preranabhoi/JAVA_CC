/*
write a java code using recursion to find the nth fibonacci number
*/
public class fibonacci {
    public static int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        int result=fib(10);
        System.out.println(result);
    }
}

