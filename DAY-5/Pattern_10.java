import java.util.Scanner;

public class Pattern_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        // for(int i = 0 ; i < N ; i++){
        // for(int j = 0 ; j <= i ; j++){
        // System.out.print("*");
        // }
        // System.out.println("");
        // }
        // for(int i = 0 ; i < N ; i++){
        // for(int j = 1 ; j < N - i ; j++){
        // System.out.print("*");
        // }
        // System.out.println("");
        // }

        for (int i = 1; i <= 2 * N - 1; i++) {
            int stars = i;
            if (i > N) {
                stars = (2 * N - i);
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
