/*
Q.you are given an array of 5 nums 10,30,20,40,50 
1.start searching from the first element compare each element with 40 
stop when 40 found and print its index
 */

public class binarySearch {
    public static void main(String[] args){
        int [] arr={10,20,30,50};
        int target=40;
        int left=0;
        int right=arr.length-1;
        boolean found = false;
      
        while (left <= right) {
            int mid = (left + right) / 2;

         if (arr[mid] == target) {
                System.out.println("Element 40 found at index: " + mid);
                found = true;
                break;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        if (!found) {
            System.out.println("Element not found in the array.");
        }
    }}
