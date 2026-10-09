import java.util.Scanner;

public class Count_Digit{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int CountDigit = CountDigit(n);
        System.out.print("Counted Digit : " + CountDigit);
    }

    public static int CountDigit(int n){
        int count = 0;
        while(n > 0){
            count = count + 1;
            n /= 10;
        }
        return count;
    }
}