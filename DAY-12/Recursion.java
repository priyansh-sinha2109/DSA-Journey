import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Count(0);
    }

    public static void Count(int count) {
        if (count == 3) {
           System.out.println(count);
           return;
        }
        System.out.println(count);
        Count(count + 1);
    }
}
