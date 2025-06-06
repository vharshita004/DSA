public class AlternatePositiveNegative {
    public static void rearrange(int[] arr) {
        int n = arr.length;
        int i = 0, j = 0;

        // Rearrange the array to alternate positive and negative numbers
        while (i < n && j < n) {
            // Find the first out-of-place positive at an odd index
            while (i < n && (arr[i] >= 0 || i % 2 == 0)) i++;
            // Find the first out-of-place negative at an even index
            while (j < n && (arr[j] < 0 || j % 2 != 0)) j++;

            // Swap if valid indices found
            if (i < n && j < n) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -4, -1, 4, -2, -3};
        System.out.println("Original Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        rearrange(arr);

        System.out.println("\nRearranged Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
