import java.util.Scanner;

public class Pattern_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int space =  2 * (N - 1);
        for (int i = 1; i <= N; i++) {
            // pattern
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // space
            for (int k = 1; k < space; k++ ) {
                System.out.print(" ");
            }
            // Reverse Pattern
            for (int z = i; z >= 1; z--) {
                System.out.print(z);
            }
            System.out.println("");
            space -=2;
        }
    }
}
