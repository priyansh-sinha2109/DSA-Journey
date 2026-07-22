import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(CheckPalindrome(n)){
            System.out.println("Number is Palindrome");
        } else {
            System.out.println("Number is not palindrome");
        }
    }
    public static boolean CheckPalindrome(int x){
        int store = 0 ;
        int copy = x;
        if(x < 0){
            return false;
        }
        while(copy != 0 ){
            int lastDigit = copy % 10;
            store = store * 10 + lastDigit;
            copy = copy / 10;
        }
        if(store == x){
            return true;
        }
        return false;
    }
}
