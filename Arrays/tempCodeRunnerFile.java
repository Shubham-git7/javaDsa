public class arraysCC {
    public static void getLargest(int number[]){
     int largest = Integer.MIN_VALUE; //-Infinity
     int smallest = Integer.MAX_VALUE; //Infinity

     for(int i=0; i<number.length; i++){
        if(number[i] > largest){
            largest = number[i];
        }
        if(number[i] < smallest){
            smallest = number[i];
        }
     } 
     System.out.println("The largest number is " + largest);
     System.out.println("The largest number is " + smallest);

    }
public static void main(String[] args) {
    int number[] = {10, 20, 2, 60, 40, 50};
    getLargest(number);
}   
}