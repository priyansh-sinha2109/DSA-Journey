import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println(Reverse(arr ,0, n));
    }

    public static int[] Reverse(int[] arr , int i , int n){
        return Reverse(arr, i + 1 , n);
    }
}
