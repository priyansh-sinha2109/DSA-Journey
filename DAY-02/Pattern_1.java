import java.util.Scanner;

public class Pattern_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= (4); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
