import java.util.Scanner;

public class Pattern_18 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      for(int i = 0 ; i <= n ; i++){
        for(char ch =(char) ('E' - i) ; ch <= 'E' ; ch++){
            System.out.print(ch);
        } 
        System.out.println(" ");
      }
    }
}