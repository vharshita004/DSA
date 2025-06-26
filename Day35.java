//Day 35
class Day35{
    public static void main(String[] args) {
        String s1 = "math";
        String s2 = "emwrayth";

        System.out.println(isSubsequence(s1, s2));
    }

     static boolean isSubsequence(String s1, String s2) {
        int i = 0, j = 0;

        while (i < s1.length() && j < s2.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == s1.length();
    }
}
