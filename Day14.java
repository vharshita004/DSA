 //Day 14
 class Day14{
    static void rearrange(int[] arr){
        int n = arr.length;
        int[] result = new int[n];
        int pos=0, neg=1;

        
        for(int next : arr){
            if (next >= 0 && pos < n){
                result[pos] = next;
                pos += 2;
            } else if (next < 0 && neg < n){
                result[neg] = next;
                neg += 2;
            }
        }

        int i = 0;
        for(int next : arr){
            if (next >= 0 && pos < n){
                result[pos] = next;
                pos += 2;
            } else if (next < 0 && neg < n){
                result[neg] = next;
                neg += 2;
            }
        }

        System.arraycopy(result, 0, arr, 0, n);
    }

    public static void main(String[] args) {
        int[] arr = {8, 5, -9, -1, 2, -4, -3, 6};
        rearrange(arr);

        System.out.println("Rearranged array:");
        for (int next : arr) {
            System.out.print(next + " ");
        }
    }
}
