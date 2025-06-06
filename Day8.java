//Day8
class Day8{
    public static void main(String[] args){
        int [] arr = {-2,-4,5,1,-3,2};
        System.out.println(MaxSubArray(arr));
    }
    static int MaxSubArray(int[] arr){
        int sum = 0;
        int maxSum=arr[0];
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
            if(sum>maxSum){
                maxSum=sum;
            }
            else if(sum<0){
                sum=0;
            }
        }
        return sum;
    }
}