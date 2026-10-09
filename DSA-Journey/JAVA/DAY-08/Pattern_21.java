import java.util.Scanner;

public class Pattern_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        // int space = 2 * n - 2;
        // for (int i = 1; i <= n; i++) {
        // // Star
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // // Space
        // for (int z = 0; z < space; z++) {
        // System.out.print(" ");
        // }
        // // Star
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // space -= 2;
        // System.out.println("");
        // }
        // space = 2;
        // for (int i = 1; i <= n; i++) {
        // // Star
        // for (int j = 1; j <= n -i; j++) {
        // System.out.print("*");
        // }
        // // Space
        // for (int z = 0; z < space; z++) {
        // System.out.print(" ");
        // }
        // // Star
        // for (int j = 1; j <= n -i; j++) {
        // System.out.print("*");
        // }
        // space += 2;
        // System.out.println("");
        // }

        int space = 2 * n - 2;
        for (int i = 1; i <= 2 * n - 1; i++) {
            int star = i;
            if (i > n)
                star = 2 * n - i;
            // stars
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            // space
            for (int z = 1; z <= space; z++) {
                System.out.print(" ");
            }
            // star
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
            if (i < n)
                space -= 2;
            else
                space += 2;
        }
    }
}
