/*
using recursion find the power of a number
*/
public class recursion2 {
    public static int recur(int a,int n) {
      
        if (n == 0) {
            return 1;
        }
        return a * recur(a, n - 1);
    }
    public static void main(String[] args) {
        int result = recur(2, 5);

        System.out.println(result);
    }
}
