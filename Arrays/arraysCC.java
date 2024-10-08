import java.util.*;

// ! Basics of Array structure
// public class arraysCC {
// public static void main(String[] args) {
// int marks[] = new int[100];
// Scanner sc = new Scanner(System.in);
// marks[0] = sc.nextInt();
// marks[1] = sc.nextInt();
// marks[2] = sc.nextInt();
// System.out.println("phy : " + marks[0] );
// System.out.println("ch : " + marks[1] );
// System.out.println("mt : " + marks[2] );
// }
// }

// ! Array as an function arguments
// public class arraysCC {
// public static void update(int marks[]) {
// for (int i = 0; i < marks.length; i++) {
// marks[i] = marks[i] + 1;
// }
// }
// public static void main(String[] args) {
// int marks[] = { 100, 20, 21 };
// update(marks);
// for (int i = 0; i < marks.length; i++) {
// System.out.println(marks[i] + "");
// }
// System.out.println();
// }
// }

// ! LINEAR SEARCH
// public class arraysCC {
// public static int findKey(int number[], int key){
// for(int i=0; i<number.length; i++){
// if (number[i] == key ) {
// return i;
// }
// }
// return -1;
// }
// public static void main(String[] args) {
// int number[] = {10, 20, 30, 40, 50, 60};
// int key = 10;
// int index = findKey(number, key);
// if(index == -1){
// System.out.println("key is not found");
// }
// else{
// System.out.println("key is found");
// }
// }
// }

// ! LARGEST And SMALLEST IN ARRAY
// public class arraysCC {
// public static void getLargest(int number[]){
// int largest = Integer.MIN_VALUE; //-Infinity
// int smallest = Integer.MAX_VALUE; //Infinity
// for(int i=0; i<number.length; i++){
// if(number[i] > largest){
// largest = number[i];
// }
// if(number[i] < smallest){
// smallest = number[i];
// }
// }
// System.out.println("The largest number is " + largest);
// System.out.println("The smallest number is " + smallest);
// }
// public static void main(String[] args) {
// int number[] = {10, 20, 2, 60, 40, 50};
// getLargest(number);
// }
// }

// ! BINERY SEARCH
// public class arraysCC {
//     public static int binarySearch(int num[], int key) {
//         int start = 0;
//         int end = num.length - 1;
//         while (start <= end) {
//             int mid = (start + end) / 2;
//             //comparision
//             if(num[mid] == key){
//                 return mid;
//             }if(num[mid] < key){
//                 start = mid+1;
//             }
//             else{
//              end = mid -1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int num[] = { 2, 4, 6, 8, 10, 12, 14 };
//         int key = 0;
//        System.out.println("the key is found on Array index " + binarySearch(num, key));
//     }
// }

//! reverse array
// public class arraysCC {
//     public static void reverseArray(int num[]){
//       int start = 0;
//       int end = num.length - 1;
//       while(start < end){
//         int temp = num[end];
//         num[end] = num[start];
//         num[start] = temp;
//         start ++;
//         end --;
//       } 
//     }
//     public static void main(String[] args) {
//         int num[]= {1,2,3,4,5};
//         reverseArray(num);
//         for (int i = 0; i < num.length; i++) {
//             System.out.print(num[i]);
//         }
//     }
// }

//! Paires in array

// public class arraysCC {
//     public static void printPairs(int num[]) {
//         for (int i = 0; i < num.length; i++) {
//             int curr = num[i];
//             for (int j = i + 1; j < num.length; j++) {
//                 System.out.print("(" + curr + "," + num[j] + ")");
//             }
//             System.out.println();    
//         }
//     }
//     public static void main(String[] args) {
//         int num[] = { 2, 4, 6, 8, 10 };
//         printPairs(num);
//     }
// }

// //! Subarray Print
// public class arraysCC {
//     public static void subArray(int num[]){
//         for(int i=0; i<num.length; i++){
//                     int start=i;
//             for(int j=i; j<num.length; j++){
//                     int end = j;
//                 for(int k=start; k<=end; k++){
//                     System.out.print(num[k]+" ");
//                 }System.out.println();
//             }System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         int num[] = {1 ,2, 3, 4, 5};
//         subArray(num);   
//     }   
// }

//! max SubArray Sum (Prefix Sum)

// public class arraysCC {

//     // Method to calculate the maximum subarray sum using prefix sums
//     public static void PrefixSubarray_Sum(int num[]) {

//         // Array to store prefix sums
//         int prefix[] = new int[num.length];

//         // Variables to store current sum and maximum sum found
//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;

//         // Initialize the first element of prefix array
//         prefix[0] = num[0];

//         // Calculate the prefix sums for the array
//         for (int i = 1; i < prefix.length; i++) {
//             prefix[i] = prefix[i - 1] + num[i];
//         }

//         // Iterate over all possible subarrays
//         for (int i = 0; i < num.length; i++) {
//             int start = i;
//             for (int j = i; j < num.length; j++) {
//                 int end = j;

//                 // Calculate the sum of the current subarray using prefix sums
//                 currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

//                 // Update maxSum if current subarray sum is greater
//                 if (maxSum < currSum) {
//                     maxSum = currSum;
//                 }
//             }
//         }

//         // Print the maximum subarray sum
//         System.out.println("max sum = " + maxSum);
//     }

//     public static void main(String[] args) {
//         // Test array
//         int num[] = { 1, -2, 6, -1, 3 };

//         // Call the method to find the maximum subarray sum
//         PrefixSubarray_Sum(num);
//     }
// }

//! SubArray sum (Kadane's Algorithem)

// public class arraysCC {
//     public static void kadanes(int num[]){
//         int ms = Integer.MIN_VALUE;
//         int cs = 0;

//         for(int i=0; i<num.length; i++){
//             cs = cs + num[i];
//             if(cs < 0){
//                 cs = 0;
//             }
//             ms = Math.max(cs, ms);
//         }
//         System.out.println("Our max SubArray sum is : " + ms);
//     }
// public static void main(String[] args) {
//     int num[] = {-2, -3, 4, -1, -2, 1, 5, -3};
//     kadanes(num);
// }   
// }

//! Trapping Rain water problem

// public class arraysCC {
//     public static int trappedRainWater(int height[]){
//         int n = height.length;
//         //Calculate left max-boundary
//         int leftMax[] = new int[n];
//         leftMax[0] = height[0];
//         for (int i = 1; i < n; i++) {
//             leftMax[i] = Math.max(height[i] , leftMax[i - 1 ]);
//         }
//         //Caluclate rightMax boundary 
//         int rightMax[] = new int[n];
//         rightMax[n - 1] = height[n - 1];
//         for (int i = n - 2; i>=0; i--){
//             rightMax[i] = Math.max(height[i] , rightMax[i+1]);
//         }
//         int trappedWater = 0;
//         //loop
//         for(int i=0; i<n; i++){
//             //min of leftMax and RightMax boundary
//             int waterLevel = Math.min(leftMax[i], rightMax[i]);
//             //Trapped water formula
//             trappedWater += waterLevel - height[i]; 
//         }
//         return trappedWater;
//     }
//     public static void main(String[] args) {
//         int height[] = {4 , 2 , 0, 6, 3, 2, 5};
//       System.out.println(trappedRainWater(height));
//     }
// }

 //! Best time to sell and buy stock

// public class arraysCC {
//     public static int BuyAndSellStocks(int price[]) {
//         int buyPrice = Integer.MAX_VALUE;
//         int maxProfit = 0;
//         for (int i = 0; i < price.length; i++) {
//             if (buyPrice < price[i]) {
//                 int profit = price[i] - buyPrice;
//                 maxProfit = Math.max(maxProfit, profit);
//             } else {
//                 buyPrice = price[i];
//             }
//         }
//         return maxProfit;
//     }
//     public static void main(String[] args) {
//         int price[] = { 7, 1, 5, 3, 6, 4 };
//         System.out.println("max profit is " + BuyAndSellStocks(price));
//     }
// }



//! There is an integer array nums sorted in ascending order (with distinct values).
//! pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], 
//! Prior to being passed to your function, nums is possibly rotated at an unknown 
//! nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For 
//! example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and 
//! become [4,5,6,7,0,1,2].
//! Given the array nums after the possible rotation and an integer target, return the 
//! index of target if it is in nums, or -1 if it is not in nums.
//! You must write an algorithm with O(log n) runtime complexity

// public class arraysCC {
//     public static int roated_Array_Search(int num[], int target){
//         int left = 0; 
//         int right = num.length - 1;
//         while(left <= right){
//             int mid =left + (right - left) / 2; //Prevent overflow

//             if(num[mid] == target){
//                 return mid;
//             }
//             //Determined which part of array is sorted
//             if(num[left] <= num[mid]){//left part is sorted
//                 if(num[left] <= target && target < num[mid]){
//                     right = mid - 1;
//                 }else{
//                     left = left + 1; 
//                 }
//             }else{// right part is sorted   
//                 if(num[mid] < target && target < num[right]){
//                     left = mid + 1; //target  is in the left part
//                 }else{
//                     right = mid - 1; //target is in the right part 
//                 }
//             }
//         } 
//         //if target is not found 
//         return -1;
//     }
// public static void main(String[] args) {
//     int num[] = {4, 5, 6, 7, 0, 1, 2};
//     int target = 0;
//     System.out.println(roated_Array_Search(num, target));
// }
// }