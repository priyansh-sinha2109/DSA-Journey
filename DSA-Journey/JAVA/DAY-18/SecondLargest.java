import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = input.nextInt();
        }
        System.out.print(secondlargest(arr, n));
    }
    public static int secondlargest(int[] arr , int n){
        int largest = arr[0];
        int sLargest = -1;
        for(int i = 1 ; i < n ; i++){   
            if(arr[i] > largest){
                sLargest = largest;
                largest = arr[i];
            } else if(arr[i] < largest && arr[i] > largest){
                sLargest = arr[i];
            }
        }
        return sLargest;
    }
}
