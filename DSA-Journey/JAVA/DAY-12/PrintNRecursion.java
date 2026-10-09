import java.util.Scanner;

public class PrintNRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        print(1, n);
    }

    public static void print(int count , int n){
        if(count == n) {
            System.out.println(count);
            return;
        }
        System.out.println(count);
        print(count + 1 , n);
    }
}
