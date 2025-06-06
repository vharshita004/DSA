//Day 4
import java.util.Arrays;

public class DutchNationalFlag {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 1, 0, 2, 1, 2, 0};
        sortColors(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    static void sortColors(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:                
                    swap(arr, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr, mid, high);
                    high--;
                    break;
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
