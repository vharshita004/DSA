//Day 33
import java.util.*;

 class Day33{
    public static void main(String[] args){
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
 
        Arrays.sort(str);

        List<List<String>> result = new ArrayList<>();

        for(String next : str){
            boolean grouped = false;

            for (List<String> group : result) {
                if (areAnagrams(group.get(0), next)){
                    group.add(next);
                    grouped = true;
                    break;
                }
            }

            if(!grouped){
                List<String> newGroup = new ArrayList<>();
                newGroup.add(next);
                result.add(newGroup);
            }
        }
        System.out.println(result);
    }

    private static boolean areAnagrams(String s1, String s2){
        if(s1.length() != s2.length()) return false;

        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1, chars2);
    }
}
