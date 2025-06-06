//Day10
class Day10{
    static void Leader(int [] arr, int size){
        int maxRight = arr[size-1];
        System.out.println(maxRight);
        for(int i=size-2;i>=0;i--){
         if(arr[i]>maxRight){
           maxRight=arr[i];
           System.out.println(maxRight);
         }
        }
    }
    public static void main(String[] args){
        int [] arr = {18,19,3,5,6,2};
        int n = arr.length;
        Leader(arr,n);
    }
}