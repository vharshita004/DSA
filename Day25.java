//Day 25
class Day25{
    public static void main(String[] args){
        String str1 = "namaste";
        String str2 = "mastena";

        if (isAnagram(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }

    static boolean isAnagram(String str1, String str2){
        if (str1.length() != str2.length()){
            return false;
        }

        int[] charCount = new int[26]; 

        for (int i = 0; i < str1.length(); i++){
            charCount[str1.charAt(i) - 'a']++;
            charCount[str2.charAt(i) - 'a']--;
        }

        for (int count : charCount){
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
