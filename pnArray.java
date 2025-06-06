//Day 5
import java.util.Scanner;
class pnArray{
 public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      System.out.println("Enter elements:");
      int [] arr = new int[7];
      for(int i=0;i<arr.length;i++){
        arr[i] = s.nextInt();
      }
      System.out.println("Array elements:");
      for(int next:arr){
        System.out.print(next + " ");
      }
      System.out.println();
      System.out.println("Sorted array: ");
      int i=0, j=arr.length-1;
      while(i<j){
        if(arr[i]<0){
            i++;
        }else if(arr[j]>0){
            j--;
        }else{
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
      }
      for(int x:arr)
      System.out.print(x+" ");
    }
}