//Day 1
import java.util.Scanner;
class MaxMinInArray{
    static void arrayMaxMin(int [] arr){
        int max = arr[0];
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
          if(arr[i]>max){
            max = arr[i];
          }else if(arr[i]<min){
            min = arr[i];
          }
        }  
        System.out.println("Maximum element : " + max);
        System.out.println("Minimum element : " + min);
    }
    public static void main(String[] args){
        
        int [] arr;
        Scanner a = new Scanner(System.in);
        System.out.println("Enter no. of elements: ");
        int n = a.nextInt();
        if(n<=0){
            System.out.println("Array is empty");
        }
        arr = new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++){
          arr[i] = a.nextInt();
        }
        arrayMaxMin(arr);
    }
}