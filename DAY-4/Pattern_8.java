import java.util.Scanner;

public class Pattern_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for (int i = 0; i < N; i++) {
            // Star
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Space
            for(int k = 0 ; k < 2*N -(2*i + 1) ; k++ ){
            System.out.print("*");
        }
        // space 
        for(int j = 0 ; j < i ; j++){
            System.out.print(" ");
        }
        System.out.println(" ");
    }
  }
}