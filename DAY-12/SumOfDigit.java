import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
       // NumbersSum(n , 0);
      System.out.println(NumbersSum(n));

    }

    // Paremeterized

    // public static void NumbersSum(int i , int sum){
    //     if(i < 1) {
    //         System.out.println(sum);
    //         return;
    //     }
    //      NumbersSum(i - 1, sum + i);
    // }

    // Functional Recursion

    public static int NumbersSum(int n){
        if(n == 0){
            return 0;
        } 
        return n * NumbersSum(n - 1);
    }
}


