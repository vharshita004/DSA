//Day 29
class Day29{
    static int strStr(String str1, String str2){
        if(str2.length() == 0){
            return 0;
        }
        
        if(str2.length() > str1.length()){
            return -1;
        }
        
        int i = 0;
        while(i < str1.length()){
            if(i + str2.length() > str1.length()){
                break;
            }
            
            int j = 0;
            while(j < str2.length()){
                if(str2.charAt(j) != str1.charAt(i + j)){
                    break;
                }
                  j += 1;
            }
            
            if(j == str2.length()){
                return i;
            }
            i += 1;
        }
         return -1;
    }
    public static void main(String[] args){
       String str1 = "communication";
       String str2 = "mm"; 

     int result = strStr(str1,str2);
      System.out.println("Index of '" + str2 + "' in '" + str1 + "' is: " + result);
    }
}