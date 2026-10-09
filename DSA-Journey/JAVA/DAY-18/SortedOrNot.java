import java.util.Scanner;

public class SortedOrNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = input.nextInt();
        }
        if(isSorted(arr, n)){
            System.out.print("Array is Sorted");
        } else {
            System.out.print("Array is not Sorted");
        }
    }
    public static Boolean isSorted(int[] arr , int n){
        int smallest = arr[0];
        for(int i = 1 ; i < n ; i++){
            if(arr[i] >= smallest){
                smallest = arr[i];
            } else {
                return false;
            }
        }
        return true;
    }
}
