// import java.util.ArrayList;
// import java.util.Scanner;

// public class Merge {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         int m = input.nextInt();
//         int n = input.nextInt();
//         int[] nums1 = new int[m + n];
//         int[] nums2 = new int[n];
//         for (int i = 0; i < m; i++) {
//             nums1[i] = input.nextInt();
//         }
//         for (int j = 0; j < n; j++) {
//             nums2[j] = input.nextInt();
//         }
//         merge(nums1, m, nums2, n);
//     }

//     public static void merge(int[] nums1, int m, int[] nums2, int n) {
//         ArrayList<Integer> list = new ArrayList<>();
//         int left = 0;
//         int right = 0;
//       while(left < m && right < n){
//         if(nums1[left] < nums2[right]){
//             list.add(nums1[left]);
//             left++;
//         } else{
//             list.add(nums2[right]);
//             right++;
//         }
//       }
//       while(left < m){
//         list.add(nums1[left]);
//         left++;
//       }
//       while(right < n){
//         list.add(nums2[right]);
//         right++;
//       }
//       for(int i = 0 ; i < m+n ; i++){
//         nums1[i] = list.get(i - 0);
//         System.out.print(nums1[i]);
//       }
//     }
// }






// Quick Sort 

// class Solution {

//     public static int  partition(int[] nums , int low , int high){
//         int pivot = nums[low];
//         int i = low ;
//         int j = high ;
//         while(i < j){
//             while(nums[i] <= pivot && i <= high -1){
//                 i++;
//             }
//             while(nums[j] > pivot && j >= low +1){
//                 j--;
//             }
//             if(i < j){
//                 int temp = nums[i];
//                 nums[i] = nums[j];
//                 nums[j] = temp;
//             }
//         }
//         int rev = nums[low];
//         nums[low] = nums[j];
//         nums[j] = rev;
//         return j;
//     }
//     public static void qs(int[] nums , int low , int high){
//         if(low < high){
//             int pIndex = partition(nums , low , high);
//             qs(nums ,low , pIndex -1);
//             qs(nums , pIndex+1 , high);
//         }
//     }
//     public int[] quickSort(int[] nums) {
//         qs(nums , 0 , nums.length-1);
//         return nums;
//     }
// }