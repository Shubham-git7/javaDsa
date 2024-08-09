import java.util.*;

//! Basic print in 2d array 
// public class Matrices {
//     public static boolean search(int matrix[][], int key) {
//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[0].length; j++) {
//                 if (matrix[i][j] == key) {
//                     System.out.println("found at cell " + i + ", " + j);
//                     return true;
//                 }
//             }
//         }
//         System.out.println("Key not found");
//         return false;
//     };

//     public static void largest(int matrix[][]) {
//         int largest = Integer.MIN_VALUE;
//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[0].length; j++) {
//                 if (matrix[i][j] > largest) {
//                     largest = matrix[i][j];
//                 }

//             } 

//         }System.out.println("The largest number is " + largest);

//     };

//     public static void main(String args[]) {
//         int matrix[][] = new int[3][3];
//         int n = matrix.length;
//         int m = matrix[0].length;

//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the elements of the matrix:");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }

//         System.out.println("The matrix is:");
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }

//         System.out.println("Enter the key to search:");
//         int key = sc.nextInt();
//         search(matrix, key);
//         largest(matrix);
//     }
// }

// //!  Spiral matrix 

// public class Matrices {
//     public static void Spiral(int num[][]) {
//         int startRow = 0;
//         int startCol = 0;
//         int endCol = num[0].length - 1;
//         int endRow = num.length - 1;

//         while (startRow <= endRow && startCol <= endCol) {
//             // Top
//             for (int j = startCol; j <= endCol; j++) {
//                 System.out.print(num[startRow][j]);
//             }

//             // Right
//             for (int i = startRow + 1; i <= endRow; i++) {
//                 System.out.print(num[i][endCol]);
//             }
//             ;
//             // Bottom
//             for (int j = endCol - 1; j >= startCol; j--) {
//                 if (startRow == endRow) {
//                     break;
//                 }
//                 System.out.print(num[endRow][j]);
//             }
//             // left
//             for (int i = endRow - 1; i >= startRow + 1; i--) {
//                 if (startCol == endCol) {
//                     break;
//                 }
//                 System.out.print(num[i][startCol]);
//             }

//             startRow++;
//             endCol--; 
//             endRow--;
//             startCol++;

//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int num[][] = { { 1, 2, 3, 4 },
//                 { 5, 6, 7, 8 },
//                 { 9, 10, 11, 12 },
//                 { 14, 15, 16, 17 } };
//         Spiral(num);
//     }
// }

//! Diagonal Matrix sum 

// public class Matrices {
//     public static int DiagonalSum(int num[][]) {
//         int sum = 0;
//         for (int i = 0; i < num.length; i++) {
//             // primary diagonal
//             sum += num[i][i];
//             if (i != num.length - i - 1);
//             // secoundary diagnol
//             sum += num[i][num.length - 1 - i];
//         }
//         System.out.println(sum);
//         return sum;
//     }
//     public static void main(String[] args){
//         int num[][] = { { 1, 2, 3, 4 },
//                 { 5, 6, 7, 8 },
//                 { 9, 10, 11, 12 },
//                 { 13, 14, 15, 16 } };
//         DiagonalSum(num);
//     }
// }

//! Search in sorted matrix

// public class Matrices {
//     public static boolean sortedMatrix(int num[][], int key){
//         int row=0;
//         int col = num[0].length -1;

//         while(row<num.length && col >=0){
//             if(num[row][col] == key){
//                 System.out.println("the key found at index : " + row +","+ col);
//                 return true;
//             }
//             else if(key <= num[row][col]){
//                 col--;
//             }
//             else{
//                 row++;
//             }
//         }
//         System.out.println("key not fouund");
//         return false;
//     }
//     public static void main(String[] args) {
//         int num[][] = { { 1, 2, 3, 4 },
//                 { 5, 6, 7, 8 },
//                 { 9, 10, 11, 12 },
//                 { 13, 14, 15, 16 } };

//         int key = 111;
        
//          sortedMatrix(num, key);
//     }
// }