import java.util.Scanner;

public class Pattern_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        // int i = 0;
        // for(char ch = 'A' ; ch < 'A' + N ; ch++){
        //    for(char cha = 'A' ; cha <= ch ; cha++){
        //     System.out.print(ch);
        //     i = i + 1;
        //    }
        //  System.out.println(" ");
        // }
        for(int i = 0 ; i < N ; i++){
            char ch = (char)('A' + i);
            for(int j = 0 ; j <= i; j++){
                System.out.print(ch);
            }
            System.out.println(" ");
        }
    }
}
