import java.util.ArrayList;
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
         divisor(n1 , n2);
    }

    public static void divisor(int a , int b){
        // Brute Force 

        // for(int i = Math.min(n1, n2) ; i >= 1 ; i--){
        //     if(n1 % i == 0 && n2 % i == 0){
        //         System.out.print(i);
        //         break;
        //     }
        // }

        // Euclidean Algorithm
        while(a > 0 && b > 0){
            if(a > b){
                a = a % b;
            } else {
                b = b % a; 
            }
        }
         if(a == 0){
                System.out.print(b);
            } else {
                System.out.print(a);
            }

    } 
}
