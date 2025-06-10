//Day19
import java.util.Arrays;
 class Day19{
    public static void main(String[] args){
        int[] arr1 = {1, 3, 5, 7}; 
        int[] arr2 = {2, 4, 6, 8};

        mergedArray(arr1, arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

    static void mergedArray(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length;
        int i = n - 1, j = 0;

        while (i >= 0 && j < m && arr1[i] > arr2[j]) {
            int temp = arr1[i];
            arr1[i] = arr2[j];
            arr2[j] = temp;
            i--;
            j++;
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
