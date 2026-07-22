import java.util.Scanner;

public class Pattern_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 0 ; i < n ; i++){
            for(int j = n - i ; j <= n ; j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
