//Day 34
class Day34{
    public static boolean isRotation(String str1, String str2){
    
        if(str1.length() != str2.length() || str1.length() == 0){
            return false;
        }
        String add = str1 + str1;
        return add.contains(str2);
    }

    public static void main(String[] args){
        String str1 = "abcd";
        String str2 = "cdab";

        if (isRotation(str1, str2)){
            System.out.println(str2 + " is a rotation of " + str1);
        } else {
            System.out.println(str2 + " is not a rotation of " + str1);
        }
    }
}
