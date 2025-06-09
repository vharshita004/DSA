 //Day 18
 class Day18{
    public static void main(String[] args){
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("Trapped water: " + trapWater(height));
    }

     static int trapWater(int[] height){
        int water = 0, n = height.length;
        for (int i = 1; i < n - 1; i++) {
            int left = 0, right = 0;

         for (int j = i; j >= 0; j--){
                left = Math.max(left, height[j]);
            }

            for (int j = i; j < n; j++){
                right = Math.max(right, height[j]);
            }
 
            water += Math.min(left, right) - height[i];
        }
        return water;
    }
}
