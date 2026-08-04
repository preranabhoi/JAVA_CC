// 1)Find the largest element using a method.
// 2)Count even and odd numbers using a method.
// 3)Calculate the average of array elements.
// 4)Search for an element in an array using a method.
// 5)Reverse an array using a method.

public class assignment3 {

    static int findLargest(int[] arr) {
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    static void countEvenOdd(int[] arr) {
        int even = 0;
        int odd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even Numbers = " + even);
        System.out.println("Odd Numbers = " + odd);
    }

    static double findAverage(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return (double) sum / arr.length;
    }

    static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {12, 45, 7, 89, 23};

        System.out.println("Largest Element = " + findLargest(arr));

        countEvenOdd(arr);

        System.out.println("Average = " + findAverage(arr));

        int key = 89;
        int index = search(arr, key);

        if (index != -1)
            System.out.println("Element found at index " + index);
        else
            System.out.println("Element not found");

        reverse(arr);

        System.out.print("Reversed Array = ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
