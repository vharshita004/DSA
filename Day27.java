//Day 27
class Day27{
    public static String longestCommonPrefix(String[] str){
        if(str == null || str.length == 0)
         return ""; 
        String prefix = str[0]; 
        for(int i = 1; i < str.length; i++){
            while(!str[i].startsWith(prefix)){ 
                prefix = prefix.substring(0, prefix.length() - 1); 
                if(prefix.isEmpty())
                 return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args){
        String[] str = {"apple", "ape", "april"}; 
        System.out.println("Longest Common Prefix: " + longestCommonPrefix(str));
    }
}
