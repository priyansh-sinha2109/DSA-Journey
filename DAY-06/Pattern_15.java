import java.util.Scanner;

public class Pattern_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for(int i = 1 ; i <= N ; i++){
            for(char ch = 'A' ; ch < 'A' + (N -i + 1) ; ch++){
                System.out.print(ch);
            }
            System.out.println("");
        }
    }
}
