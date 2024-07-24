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

