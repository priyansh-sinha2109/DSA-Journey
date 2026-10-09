import java.util.Scanner;
public class ValidPlaindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(isPalindrome(0 , s)){
            System.out.println("String is Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static boolean isPalindrome(int i , String s){
        if(i >= s.length()/2) return true;
        if(s.charAt(i) != s.charAt(s.length() - i - 1)){
            return false;
        }
        return isPalindrome(i+1, s);
    }
}
