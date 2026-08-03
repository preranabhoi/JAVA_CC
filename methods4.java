//Method returning value

public class methods4 {
    static float add(int a, int b){
        return a+b;
    }
    static float sub(int a, int b){
        return a-b;
    }
    static float mul(int a, int b){
        return a*b;
    };
    static float div(int a, int b){
        return a/b;
    }
    static float mod(int a, int b){
        return a%b;
    }

    public static void main(String[] args){
        float sum=add(5,4);
        System.out.println("ADDITION is: "+sum);

        float diff=sub(5,4);
        System.out.println("SUBTRACTION is: "+diff);

        float multiply=mul(5,4);
        System.out.println("MULTIPLICATION is: "+multiply);

        float division=div(5,4);
        System.out.println("DIVISION is: "+division);

        float modulus=div(5,4);
        System.out.println("Remainder is: "+modulus);
        
    }
}
