import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // precompute
        HashMap<Integer , Integer> mpp = new HashMap<>();
        for(int i = 0; i < n ; i++){
            mpp.put(arr[i], mpp.getOrDefault(arr[i], 0)+ 1);
        }

        //iterate in Map
        // for(Map.Entry<Integer , Integer> entry : mpp.entrySet()){
        //     System.out.println(entry.getKey() + "->" + entry.getValue() );
        // }
        int q;
        q = sc.nextInt();
        while (q != 0) {
            int number;
            number = sc.nextInt();
            // fetch
            System.out.println(mpp.getOrDefault(number , 0));
            q--;
        }
    }
}

