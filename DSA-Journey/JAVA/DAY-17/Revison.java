// import java.util.ArrayList;
// import java.util.Scanner;

// public class Merge_Sort {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         mergeSort(arr, 0, n - 1);
//         for(int i = 0 ; i < n ; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }

//     public static void mergeSort(int[] arr, int low, int high) {
//         if (low >= high)
//             return;
//         int mid = (low + high) / 2;
//         mergeSort(arr, low, mid);
//         mergeSort(arr, mid + 1, high);
//         merge(arr, low, mid, high);
//     }

//     public static void merge(int[] arr, int low, int mid, int high) {
//         ArrayList<Integer> list = new ArrayList<>();
//         int left = low;
//         int right = mid + 1;
//         while (left <= mid && right <= high) {
//             if (arr[left] <= arr[right]) {
//                 list.add(arr[left]);
//                 left++;
//             } else {
//                 list.add(arr[right]);
//                 right++;
//             }
//         }
//         while (left <= mid) {
//             list.add(arr[left]);
//             left++;
//         }
//         while (right <= high) {
//             list.add(arr[right]);
//             right++;
//         }

//         for (int i = low; i <= high; i++) {
//           arr[i] = list.get(i - low);
//         }
//     }
// }


//  Quick Sort

import java.util.Scanner;

public class Revison{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = input.nextInt();
        }
        Quick_Sort(arr, 0, n-1);
            for(int i = 0 ; i < n ; i++){
                System.out.print(arr[i]);
            }
    }

    public static void Quick_Sort(int[] arr , int low , int high){
        if(low < high){
            int pIndex = Quick( arr ,  low , high);
            Quick_Sort(arr, low, pIndex - 1);
            Quick_Sort(arr, pIndex + 1, high);
    }
   }
    public static int Quick(int[] arr , int low , int high){
        int pivot = arr[low];
        int i = low;
        int j = high;

        while(i < j){
        while( arr[i] <= pivot && i <= high - 1){
            i++;
        }
        while(arr[j] > pivot && j >= low + 1){
            j--;
        }
        if(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }
}