import java.util.Scanner;

public class Pattern_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for (int i = 0; i < N; i++) {
            // Space
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }

            // Character
            char ch = (char) ('A');
            int breakPoint = (2*i+1) / 2;
            for(int j = 1 ; j <= (2*i + 1) ; j++){
                System.out.print(ch);
                if(j <= breakPoint) ch++;
                else ch--;
            }

            // Space
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
