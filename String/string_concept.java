import java.util.*;

// !Basic String Concept or writen type
// public class string_concept{
// public static void main(String args[]){
// //? string write in three types
// char arr[] = {'a', 'b', 'c', 'd', 'e'};
// String str = "abcd";
// String str2 = new String("njt"); //? new ntring save on new obj other is same
// string only update the data

// //? Strigs for input and output
// Scanner sc = new Scanner(System.in);
// String name;
// name = sc.nextLine();
// System.out.println(name);

// ? in string length is function so we can use length()
// }
// }

// ! (String CharAt Method) Prinnting name using loop

// public class string_concept {
//     public static void printLetters(String str){
//         for (int i = 0; i < str.length(); i++) {
//             System.out.print(str.charAt(i));
//         }
//     }
//     public static void main(String[] args) {
//         String firstName = "Shubham";
//         String lastName = "Gulhane";
//         String fullname = firstName + " " + lastName;

//         printLetters(fullname);
//     }   
// }

//! Check if String is Plaindrome 

// public class string_concept {
//     public static boolean isPalindrome(String str) {
//         for (int i = 0; i <= str.length() / 2; i++) {
//             int n = str.length();
//             if (str.charAt(i) != str.charAt(n - 1 - i)) {
//                 return false;
//             }
//         }  return true;
//     }

//     public static void main(String[] args) {
//         String str = "racecar";
//         System.out.println(isPalindrome(str));;
//     }
// }

//! Shortest path east west north south

// public class string_concept {

//     public static float shortestPath(String path){
//         float x=0;
//         float y=0;
//         for (int i = 0; i<path.length(); i++) {
//             char dir = path.charAt(i);
//             if(dir == 'E'){
//                 x++;
//             }
//             else if(dir == 'W'){
//                 x--;
//             }
//            else if(dir == 'N'){
//                 y++;
//            } 
//            else{
//             y--;
//            }
//         }
//          float X2 = x*x;
//          float Y2 = y*y;
//          return (float)Math.sqrt(Y2 + X2);
//     } 
// public static void main(String[] args) {
//     String path = "WNEENESENNN";
//     System.out.println(shortestPath(path));
// }
// }

//! String Function Compare Item 

// public class string_concept {
//     public static void main(String[] args) {
//         String s1 = "Tony";
//         String s2 = "Tony";
//         String s3 = new String("Tony");

//         if(s1 == s2){
//             System.out.println("Strings are equal");
//         }else{
//             System.out.println("not equal");
//         }
//         if(s1 == s3){
//             System.out.println("Strings are equal");
//         }else{
//             System.out.println("not equal");
//         }
//         if(s1.equals(s3)){
//             System.out.println("Strings are equal");
//         }else{
//             System.out.println("not equal");
//         }
//     }
// }

//! StringFunction (Print SubString)

// public class string_concept{
//     public static String substring(String str, int si, int ei){
//         String subStr = "";
//         for(int i = si; i<ei; i++){
//             subStr += str.charAt(i);
//         }
//         return subStr;
//     }
//     public static void main(String args[]){
//         String str = "HellowWorld";
//         System.out.println(substring(str, 0 , 5));

//         //? using inbuld function in java
//         System.out.println(str.substring(0,5));
//     }
// }

//! StringBuilder use because its convert object  to string for this resion time complexicity is less 

//! For a given String each starting word make capital

// public class string_concept {
//     public static String toUppercase(String str){
//         StringBuilder sb = new StringBuilder("");

//         char ch = Character.toUpperCase(str.charAt(0));
//         sb.append(ch);

//         for(int i=1; i<str.length();i++){
//             if(str.charAt(i) == ' ' && i<str.length()-1){
//                 sb.append(str.charAt(i));
//                 i++;
//                     sb.append(Character.toUpperCase(str.charAt(i)));
//             }else{
//                 sb.append(str.charAt(i));
//             }
//         }
//         return sb.toString();
//     }
// public static void main(String[] args) {
//   String str = "hi, i am shubham";
//   System.out.println(toUppercase(str));
// }
// }

//! String Compression aaa, bbb, cc = 3a, 3b, 2c

public class string_concept {
    public static String Compress(String str){
        String newStr = "";
            for(int i=0; i<str.length(); i++){
                Integer Count = 1;
                while(i<str.length()-1 && str.charAt(i) == str.charAt( i + 1)){
                    Count++;
                    i++;
                }
                newStr += str.charAt(i);
                if(Count>1){
                    newStr += Count.toString();
                }
            }
            return newStr;
    }
    public static void main(String[] args) {
        String str = "aaabbbcccd";
        System.out.println(Compress(str));
    }
}
