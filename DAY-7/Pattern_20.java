import java.util.Scanner;

public class Pattern_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            // Star
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            // Space
            for (int s = 1; s <= (2 * i); s++) {
                System.out.print(" ");
            }

            // Reverse Star
            for (int z = n - i; z >= 1; z--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = 1; i <= n; i++) {
            // Star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Space
            for (int s = 1; s <= 2 * (n-i); s++) {
                System.out.print(" ");
            }

            // Reverse Star
            for (int z = i ; z >= 1; z--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
