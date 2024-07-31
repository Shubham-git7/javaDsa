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

public class sorting_Algorithem {
    public static void Selection_Sort(int num[]){
        for(int i=0; i<=num.length - 1; i++ ){
            int minNum = i;
            for(int j=i + 1; j< num.length; j++){
                if(num[minNum] > num[j]){
                    minNum = j;
                }
            }
            int temp = num[i];
            num[i] = num[minNum];
            num[minNum] = temp;
        }
    }
    public static void PrintArray(int num[]){
    for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
    }}
public static void main(String[] args) {
    int num[] = {5, 4, 1, 3, 2};
    Selection_Sort(num);
    PrintArray(num);
}   
}
