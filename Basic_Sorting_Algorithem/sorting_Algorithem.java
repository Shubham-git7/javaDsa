import java.util.*;

//! Bubble sort :- Larger array come to the end of array by swapping with adjacent  elements
// public class sorting_Algorithem {
//     public static void bubbleSort(int num[]) {
//         for (int i = 0; i < num.length - 1; i++) {
//             for (int j = 0; j < num.length - 1 - i; j++) {
//                 if(num[j] > num[j+1]){
//                     int temp = num[j];
//                     num[j] = num[j+1];
//                   num[j+1] = temp;
//                 }
//             }
//         }
//     }
// public static void PrintArray(int num[]){
//     for (int i = 0; i < num.length; i++) {
//             System.out.print(num[i] + " ");
//     }
// }
//     public static void main(String[] args) {
//         int num[] = { 5, 4, 1, 3, 2 };
//         bubbleSort(num);
//         PrintArray(num);
//     }
// }

//! Selection Sort :- Pick the smallest (from unsorted), and put in the begining

// public class sorting_Algorithem {
//     public static void Selection_Sort(int num[]){
//         for(int i=0; i<=num.length - 1; i++ ){
//             int minNum = i;
//             for(int j=i + 1; j< num.length; j++){
//                 if(num[minNum] > num[j]){
//                     minNum = j;
//                 }
//             }
//             int temp = num[i];
//             num[i] = num[minNum];
//             num[minNum] = temp;
//         }
//     }
//     public static void PrintArray(int num[]){
//     for (int i = 0; i < num.length; i++) {
//             System.out.print(num[i] + " ");
//     }}
// public static void main(String[] args) {
//     int num[] = {5, 4, 1, 3, 2};
//     Selection_Sort(num);
//     PrintArray(num);
// }   
// }


// //! Insertion Sort 
// public class sorting_Algorithem {
//     public static void insertionSort(int num[]) {
//         for (int i = 1; i <= num.length -1; i++) {
//             int curr = num[i];
//             int prev = i - 1;
//             // findout correct position of index
//             while(prev >= 0 && num[prev] > curr) {
//                 num[prev + 1] = num[prev]; 
//                 prev --;
//             }
//             num[prev + 1] = curr;
//         }
//     }
//     public static void PrintArray(int num[]){
//             for (int i = 0; i < num.length; i++) {
//                     System.out.print(num[i] + " ");
//             }}
//     public static void main(String[] args) {
//         int num[] = {5, 4 , 3, 2, 1 };
//         insertionSort(num);
//         PrintArray(num);
//     }
// }

//!Counting Sort 
// count[0] = 0 → No changes.
// count[1] = 0 → No changes.
// count[2] = 1 → Place 2 in num at index j = 0 → num = [2, 5, 6, 2, 6] → j++, count[2]--.
// count[3] = 0 → No changes.
// count[4] = 1 → Place 4 in num at index j = 1 → num = [2, 4, 6, 2, 6] → j++, count[4]--.
// count[5] = 1 → Place 5 in num at index j = 2 → num = [2, 4, 5, 2, 6] → j++, count[5]--.
// count[6] = 2 → Place 6 in num at index j = 3 and j = 4 → num = [2, 4, 5, 6, 6] → j++, count[6]-- → num = [2, 4, 5, 6, 6] → j++, count[6]--.
// public class sorting_Algorithem {
//     public static void CountingSort(int num[]) {
//         int largest = Integer.MIN_VALUE;
//         for (int i = 0; i < num.length; i++) {
//             largest = Math.max(largest, num[i]);
//         }
//         int count[] = new int[largest + 1];
//         for (int i = 0; i < num.length; i++) {
//             count[num[i]]++;
//         }
//         // sorting
//         int j = 0;
//         for (int i = 0; i < count.length; i++) {
//             while (count[i] > 0) {
//                 num[j] = i;
//                 j++;
//                 count[i]--;
//             }
//         }
//     }
//     public static void PrintArray(int num[]) { 
//         for (int i = 0; i < num.length; i++) {
//             System.out.print(num[i] + " ");
//         }
//     }
//     public static void main(String[] args) {
//         int num[] = { 4, 5, 6, 2, 6 };
//         CountingSort(num);
//         PrintArray(num);
//     }
// }


// !Inbult sort  :- syntex = Arrays.sort(arr) order of log n
//? for call Array.sort(arr, si, ei);
//! for end (going to the end + 1)
//? fore reverse printing array(Sorting ) uaw Collection/reverseOrder()....



