//Day 23
 class Day23{
    public static void main(String[] args){
        String str = "instantiation";
        System.out.println("After removing duplicates: " + removeDuplicates(str));
    }

     static String removeDuplicates(String str){
        String res = "";
        for (int i = 0; i < str.length(); i++){
            char current = str.charAt(i); 
            boolean found = false;

            for (int j = 0; j < res.length(); j++){
                if (res.charAt(j) == current){
                    found = true;
                    break;
                }
            }

            if (!found) {
                res += current;
            }
        }
        return res; 
    }
}
