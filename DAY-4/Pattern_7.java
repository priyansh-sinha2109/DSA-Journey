import java.util.Scanner;

public class Pattern_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        for (int i = 0; i < N; i++) {
            // Space
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }
            // Star
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print("*");
            }
            // space

            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
