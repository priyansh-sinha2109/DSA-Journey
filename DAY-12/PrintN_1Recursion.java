import java.util.Scanner;

public class PrintN_1Recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        print(1, n);
    }

    public static void print(int i , int n){
        if(n == i){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(i, n-1);
    }
}
