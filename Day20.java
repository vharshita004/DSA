//Day 20
public class Day20{
    public static int maxProduct(int[] arr){
        int maxProduct = arr[0], max = arr[0], min = arr[0];
        
        for (int i = 1; i < arr.length; i++){
            int temp = max;
            
            max = arr[i];

            if (temp * arr[i] > max) 
             max = temp * arr[i];

            if (min * arr[i] > max) 
             max = min * arr[i];
            
            min = arr[i];

            if (temp * arr[i] < min)
              min = temp * arr[i];

            if (min * arr[i] < min)
              min = min * arr[i];
            
            if (max > maxProduct)
             maxProduct = max;
        }
        
        return maxProduct;
    }

    public static void main(String[] args){
        int[] arr = {2, 3, -2, 4, -1};
        System.out.println(maxProduct(arr)); 
    }
}
