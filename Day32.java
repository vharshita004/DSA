//Day 32 
 class Day32{
    static String longestSubstring(String s){
        int start = 0, maxLength = 0;
        String result = "";
        int[] charIndex = new int[256];
        for(int i = 0; i < 256; i++){
            charIndex[i] = -1; 
        }

        for(int end = 0; end < s.length(); end++){
            char current = s.charAt(end);

            if(charIndex[current] >= start){
                start = charIndex[current] + 1;
            }

            charIndex[current] = end;

            if(end - start + 1 > maxLength){
                maxLength = end - start + 1;
                result = s.substring(start, end + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(longestSubstring("vishwakarma")); 
    }
}

   