//Day 26
class Day26{
    public static String countAndSay(int n){
        String result = "1"; 
        for (int i = 1; i < n; i++){
            String temp = "";
            int count = 1;
            for (int j = 1; j < result.length(); j++) {
                if (result.charAt(j) == result.charAt(j - 1)){
                    count++;
                } else{
                    temp += count + "" + result.charAt(j - 1); 
                    count = 1;
                }
            }
            temp += count + "" + result.charAt(result.length() - 1); 
            result = temp;
        }
        return result;
    }

    public static void main(String[] args){
        int n = 10; 
        System.out.println(countAndSay(n)); 
    }
}
