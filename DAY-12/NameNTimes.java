import java.util.Scanner;

public class NameNTimes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        printName(1,n);
    }
    public static void printName(int i , int n){
        if(i > n ) return;
        System.out.println("Priyansh Sinha");
        printName(i + 1 , n);
    }
}
