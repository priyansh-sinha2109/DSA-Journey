import java.util.Scanner;

public class ArrayRevision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        // Largest Element

        /*
         * int max = arr[0];
         * for(int i = 0 ; i < n ; i++){
         * if(arr[i] > max){
         * max = arr[i];
         * }
         * }
         * System.out.println(max);
         */

        // Second Largest Element
        int largest = arr[1];
        int Slargest = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];  
            }
        } 
        for(int i = 0 ; i < n ; i++){
            if(arr[i] > Slargest && arr[i] != largest){
                Slargest = arr[i];
            }
        }
        System.out.print(Slargest);
    }
}
