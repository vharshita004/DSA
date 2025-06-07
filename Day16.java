//Day 16
class Day16 {
    public static void main(String[] args){
        int[] arr = {4,2,67,4,8,9};

        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate number in array: " + arr[i]);
                    return; 
                }
            }
        }
    }
}


