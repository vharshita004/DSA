//Day 24 
public class Day24{
    public static void main(String[] args){
        String str = "TEA";
        permute(str.toCharArray(), 0);
    }

    public static void permute(char[] str, int index){
        if (index == str.length - 1){
            System.out.println(String.valueOf(str));
            return;
        }
        for (int i = index; i < str.length; i++){
            swap(str, index, i);
            permute(str, index + 1);
            swap(str, index, i); 
        }
    }

    public static void swap(char[] str, int i, int j){
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
}
