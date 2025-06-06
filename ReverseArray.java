//Day 2
import java.util.Scanner;
class ReverseArray{
    public static void main(String[] args){
    int [] arr = new int[5];
     Scanner s = new Scanner(System.in);
     System.out.println("Enter element of an array");
     for(int i=0;i<arr.length;i++){
        arr[i] = s.nextInt(); 
     }
     System.out.print("Original array : ");
     for(int next : arr){
        System.out.print(next + " ");
     }
     System.out.println("");
     System.out.print("Reversed array : ");
     for(int j=arr.length-1;j>=0;j--){
        System.out.print(arr[j] +" ");
     }
    }
}