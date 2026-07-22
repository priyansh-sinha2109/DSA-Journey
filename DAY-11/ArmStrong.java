import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (isArmstrong(n)) {
            System.out.print("Therefore, it is an Armstrong number.");
        } else {
            System.out.print("Therefore, it is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int n) {
        int store = 0;
        int copy = n;
        int count = CountDigit(n);
        while(copy != 0){
            int lastdigit = copy % 10;
            store = (int)(store + Math.pow(lastdigit, count));
            copy = copy / 10;
        }
      return store == n;

    }

    public static int CountDigit(int x) {
        int count = 0;
        if(x == 0){
            return 1;
        }
        while (x != 0) {
            count = count + 1;
            x = x / 10;
        }
        return count;
    }
}
