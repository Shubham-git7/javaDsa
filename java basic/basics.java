import java.util.*;
// // import java.util.Scanner;

// public class random {
// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// int number = sc.nextInt();
// System.out.println(number);
// }
// }

import java.util.*;

// //! print greater number

// public class random {
// public static void main(String args[]){
// Scanner sc = new Scanner(System.in);
// int number_1 = sc.nextInt();
// int number_2 = sc.nextInt();
// if(number_1 > number_2){
// System.out.println("number 1 is greater");
// }else{
// System.out.println("number 2 is greater");
// }
// }
// }

// ! print odd even or not greater number
// public class random {
// public static void main(String args[]){
// Scanner sc = new Scanner(System.in);
// int number = sc.nextInt();

// if((number % 2) == 0){

// System.out.println("even number");
// }else{
// System.out.println("odd number");
// }
// }
// }

// ! print odd even or not greater number

// public class random {
// public static void main(String args[]){
// Scanner sc = new Scanner(System.in);
// int number = sc.nextInt();
// if((number % 2) == 0){
// System.out.println("even number");
// }else{
// System.out.println("odd number");
// }
// }
// }

// ! print 1-100 using while loop
// public class random {
// public static void main(String args[]){
// int i = 1;
// while(i <= 100){
// System.out.println(i);
// i++;
// }

// }

// }

// !Question 1 : Write a Java program to get a number from the user and print
// whether it is positive or negative.
// public class random {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int number = sc.nextInt();
// if(number > 0){
// System.err.println("positive number");
// }else{
// System.err.println("negative number");

// }
// }
// }

// ! Write a program that reads a set of integers, and then prints the sum of
// the even and odd integers.
// public class random {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int ev_num = 0;
// int od_num = 0;
// int choice;
// do {
// int number = sc.nextInt();
// System.out.println("write number");
// if (number % 2 == 0) {
// ev_num = ev_num + number;
// } else {
// od_num = od_num + number;
// }
// System.out.println("If want to continue press 1 or no press 0");
// choice = sc.nextInt();
// } while (choice == 1);
// System.out.println("sum of even number" + ev_num);
// System.out.println("sum of odd number" + od_num);
// }
// }

// ! calculate factorial of an number
// public class random {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int num = sc.nextInt();
// int fact = 1;
// for (int i = 1; i <= num; i++) {
// fact = i * num;
// }
// System.out.println(fact);
// }
// }

// ! check prime or not
// public class random {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int num = sc.nextInt();

// if (num <= 1) {
// System.out.println("not a prime num");
// return;
// }else{
// for(int i=2; i<=Math.sqrt(num) ; i++){
// if (num % i == 0){
// System.out.println("not an prime num");
// return ;
// }
// }
// System.out.println("prime num");
// }
// }
// }

// !Reverse last digit number
// public class random {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int num = sc.nextInt();
// int rev = 0;

// while (num > 0) {
// int lastDigit = num % 10;
// rev = (rev * 10) + lastDigit;
// num = num/10;
// }
// System.out.println(rev);
// }
// }
// Example
// Let's go through a quick example with num = 123:

// Initial values: num = 123, rev = 0.

// First iteration:

// lastDigit = num % 10 = 3
// rev = (rev * 10) + lastDigit = (0 * 10) + 3 = 3
// num = num / 10 = 12
// Second iteration:

// lastDigit = num % 10 = 2
// rev = (rev * 10) + lastDigit = (3 * 10) + 2 = 32
// num = num / 10 = 1
// Third iteration:

// lastDigit = num % 10 = 1
// rev = (rev * 10) + lastDigit = (32 * 10) + 1 = 321
// num = num / 10 = 0
// Now, num is 0, so the loop terminates, and rev contains the reversed number,
// which is 321.

// So, rev = (rev * 10) + lastDigit; is the crucial step that builds the
// reversed number one digit at a time.
