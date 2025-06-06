//Day 9
class Day9{
 static boolean SortedAndRotated(int[] arr) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                count++;
            }
        }
    
        if (arr[arr.length - 1] > arr[0]) {
            count++;
        }
        return count == 1;
    }

    public static void main(String[] args) {
        int[] arr = {6,1,2,3,4,5};  
        System.out.println(" Is Array sorted and rotated: " + SortedAndRotated(arr));
    }
}
 
