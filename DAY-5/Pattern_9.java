import java.util.Scanner;

public class Pattern_9 {
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
            System.out.println("");
        }
        for(int x = 0 ; x < N ; x++){
            // Space
            for (int j = 0; j < x; j++) {
                System.out.print(" ");
            }
            // Star
            for (int k = 0; k < 2 * N - (2 * x + 1); k++) {
                System.out.print("*");
            }
            // space
            for (int j = 0; j < x; j++) {
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
