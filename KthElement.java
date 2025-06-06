//Day 3
import java.util.Scanner;
class KthElement{
    public static void main(String[] args){
     int [] a={5,8,12,7,90,30,4};
     int K=3;
     for(int i=0;i<a.length-1;i++){
      for(int j=i+1;j<a.length;j++){
        if(a[i]<a[j]){
          int temp=a[i];
          a[i]=a[j];
          a[j]=temp;
        }
      }
      if(i==K-1){
      System.out.println("kth largrst element is "+a[i]);
         }
     }
    System.out.println("----------------");
    for(int i=0;i<a.length;i++){
      for(int j=i+1;j<a.length;j++){
        if(a[i]>a[j]){
          int temp=a[i];
          a[i]=a[j];
          a[j]=temp;
        }
      }
      if(i==K-1){
      System.out.println("kth smallest element is "+a[i]);
     }
    }
  }
}
      