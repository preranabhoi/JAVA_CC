/*
Q.you are given an array of 5 nums 10,30,20,40,50 
1.start searching from the first element compare each element with 40 
stop when 40 found and print its index
 */
public class linearSearch{
public static void main(String[] args){
    int target=40;
    int[] arr={10,30,20,40,50};
    for(int i=0;i<arr.length;i++){
    if(arr[i]==target){
    System.out.println("Element 40 found at index: " + i);
    break;
}
    }
}
}