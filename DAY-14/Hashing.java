import java.util.Scanner;

public class Hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        // precompute

        int[] hashing = new int[100000000];
        for(int i = 0; i< n ; i++){
            hashing[arr[i]] += 1;
        }
        int q;
        q = sc.nextInt();
        while(q != 0){
            int number;
            number = sc.nextInt();
            // fetch
            System.out.println(hashing[number]);
            q--;
        } 
    }
}
