/*solving any recursion based problem we need to identify
1.what is my base case
2.then we will find what is my smaller problem, can i reduce to n,n-1,n/2,index+1,etc,
3.write a recursive fun to print no from 1 to n*/

public class recursion {
    public static void recur(int n) {
      
        if (n == 0) {
            return;
        }
        recur(n - 1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        recur(5);
    }
}