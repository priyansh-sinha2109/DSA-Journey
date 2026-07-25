import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        Reverse(arr, 0 , n);
        System.out.print( Arrays.toString(arr));
    }

    public static void Reverse(int[] arr , int left , int n){
        if(left >= n/2){
            return;
        };
       int temp = arr[left];
       arr[left] = arr[n - left - 1];
       arr[n-left - 1] = temp;
         Reverse(arr, left+1 , n);
    }
}
