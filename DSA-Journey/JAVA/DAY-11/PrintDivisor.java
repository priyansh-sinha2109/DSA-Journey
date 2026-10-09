import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PrintDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
       ArrayList<Integer> newList = new ArrayList<>();
        newList = divisor(n);
        System.out.print(newList);
    }
    // public static void divisor(int x){
    // int i = 1;
    // while(i <= x){
    // if(x % i == 0){
    // System.out.println(i);
    // }
    // i++;
    // }
    // }
    public static ArrayList<Integer> divisor(int x) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i*i <= x; i++) {
           if(x % i == 0){
            list.add(i);
             if (x / i != i) {
                list.add(x/i);
            }
           }
        }
        Collections.sort(list);
        return list;
    }
}
