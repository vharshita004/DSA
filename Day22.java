//Day 22
import java.util.Scanner;
class Day22{
  public static void main(String[] arg){

    Scanner s = new Scanner(System.in);

    System.out.println("Enter a string : ");

    String str = s.next(); 
    String reverse = "";

    for(int i = str.length()-1; i >= 0; i--){

       reverse = reverse + str.charAt(i);
    }

       if(str.equals(reverse)){
         System.out.println( str + " is a palindrome");
       }
       else{
         System.out.println(str + " is not a palindrome"); 
     } 
   }
}
