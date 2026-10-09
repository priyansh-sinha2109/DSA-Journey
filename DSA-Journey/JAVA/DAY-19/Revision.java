import java.util.ArrayList;
import java.util.Scanner;

public class Revision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = input.nextInt(); 
        }
        merge_Sort(arr, 0, n-1);
        for(int i = 0 ; i < n ; i++){       
            System.out.print(arr[i] + " ");
        }
    }
    public static void merge_Sort(int[] arr , int low , int high){
        if(low >= high ) return;
        int mid = (low + high) / 2;
        merge_Sort(arr, low, mid);
        merge_Sort(arr, mid+1, high);
        merge(arr, low, mid , high);
    }

    public static void merge(int[] arr , int low , int high , int mid){
        ArrayList<Integer> list = new ArrayList<>();
        int left = low ;
        int right = mid + 1;
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                list.add(arr[left]);
                left++;
            }
            else {
                list.add(arr[right]);
                right++;
            }
        }
        while(left <= mid){
            list.add(arr[left]);
            left++;
        }
        while(right <= high){
            list.add(arr[right]);
            right++;
        }
        for(int i = low ; i <= high ; i++){
            arr[i] = list.get(i-low);
        }
    }
}
