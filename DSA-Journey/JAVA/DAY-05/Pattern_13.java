import java.util.Scanner;

public class Pattern_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int num = 1;
        for(int i = 1 ; i < N ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(num);
                num = num + 1;
            }
            System.out.println("");
        }
    }
}
