//Day 17
class Day17{
    public static void main(String[] args){
        int[] arr1 = {33,45,55,61,89}; 
        int[] arr2 = {45,50,61,72,89};

        int i = 0, j = 0;
        System.out.print("Intersection of arrays: ");

        while (i < arr1.length && j < arr2.length){
            if(arr1[i] == arr2[j]){
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }else if (arr1[i] < arr2[j]){
                i++;
            } else {
                j++;
            }
        }
    }
}
