import java.util.Scanner;

public class Pattern_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        // for (int i = 1; i <= N; i++) {
        // for (int j = N; j >= i; j--) {
        // System.out.print("*");
        // }
        // System.out.println("");
        // }
        for (int i = 1; i <= N; i++) {
            for (int j = 0; j < N - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
