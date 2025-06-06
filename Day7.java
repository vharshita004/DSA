//Day7
import java.util.Scanner; 
class Day7{
    public static void main(String[] args){
        int [] arr = new int[7];
       Scanner s = new Scanner(System.in);
       System.out.println("Enter elements:");
       for(int i=0;i<arr.length;i++){
        arr[i]=s.nextInt();
       }
       System.out.println("Array:");
       for(int next:arr)
       System.out.print(next+" ");
       int x = arr[arr.length-1];

    //Cyclically rotated array by one   
    for(int i=arr.length-1;i>0;i--){
        arr[i]=arr[i-1];
    }
    arr[0] = x;
    System.out.println();
    System.out.println("Cyclically rotated array:");
    for(int a:arr)
    System.out.print(a + " ");
    }
    
}