import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (isPrime(n)) {
            System.out.print("This number is Prime!!");
        } else {
            System.out.print("This number is not prime!!");
        }
    }

    public static boolean isPrime(int x) {
        int count = 0;
        for (int i = 1; i * i <= x; i++) {
            if (x % i == 0) {
                count = count + 1;
                if ((x / i) != i) {
                    count = count + 1;
                }
            }
        }
        if (count == 2) {
            return true;
        }
        return false;
    }
}
