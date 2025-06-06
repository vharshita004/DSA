//Day 6
class Day6{
    static void Union(int[] arr1, int[] arr2){
        int l1=arr1.length;
        int l2=arr2.length;
        int[] arr = new int[l1+l2];
        for(int i=0; i<arr.length;i++){
            if(i<l1){
                arr[i]=arr1[i];
            }
            else if(i>l1 || i<=l2){
                arr[i]=arr2[i-l1];
            }
        }
        for(int next : arr){
            System.out.print(next +" ");
        }
        System.out.println();
    }
    static void Intersection(int[] arr1, int[] arr2){
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i] +" ");
                }
            }
        }
    }

    public static void main(String[] args){
        int [] arr1={2,4,5,7,8};
        int [] arr2={1,5,6,7,9};
        int[] arr=new int[10];
        
        System.out.println("Union :");
        Union(arr1, arr2);
        System.out.println("Intersection :");
        Intersection(arr1, arr2);

    }
}
    