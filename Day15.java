//Day 15
 class Day15{
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7}; 
        int n = arr.length + 1;      

        int totalSum = 0;
        for (int i = 1; i <= n; i++){
            totalSum = totalSum + i;
        }

        int arraySum = 0;
        for (int num : arr){
            arraySum = arraySum + num;
        }

        int missingNumber = totalSum - arraySum;
        System.out.println("Missing number is: " + missingNumber);
    }
}
