//Day 13
import java.util.Scanner;

public class Day13 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = s.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }

        System.out.print("Enter the sum: ");
        int sum = s.nextInt();

        SubarrayWithGivenSum(arr, sum);
    }

    public static void SubarrayWithGivenSum(int[] arr, int sum){
        int start = 0, currentSum = 0, count = 0;

        for (int i=0; i< arr.length; i++){
            currentSum += arr[i];

            while (currentSum > sum && start <= i){
                currentSum -= arr[start];
                start++;
            }

            
            if (currentSum == sum){
                count++;

                System.out.print("Subarray from index " + start + " to " + i + " with elements: ");
                for (int j=start; j<= i; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }
        }

        if (count == 0){
            System.out.println("No subarray with the given sum.");
        }
    }
}

