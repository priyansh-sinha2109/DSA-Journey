import java.util.Scanner;

public class Character_Hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // precompute
        int[] hashing = new int[26];
        for(int i = 0 ; i < s.length() ; i++){
            hashing[s.charAt(i)  - 'a']++;
        }
        int q;
        q = sc.nextInt();
        while(q!=0){
            char ch;
            ch = sc.next().charAt(0);
            //fetch
            System.out.println(hashing[ch - 'a']);
            q--;
        }
    }
}
