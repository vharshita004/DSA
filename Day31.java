//Day 31
class Day31{
    public static int compress(char[] letters){
        int index = 0;
        int count = 1; 

        for (int i = 1; i <= letters.length; i++){
            if (i < letters.length && letters[i] == letters[i - 1]){
                count++; 
            }else{
                
                letters[index++] = letters[i - 1];

                if(count > 1){
                    String countStr = Integer.toString(count);
                    for (char c : countStr.toCharArray()){
                        letters[index++] = c;
                    }
                }
                  count = 1; 
            }
        }
         return index; 
    }

     public static void main(String[] args){
        char[] letters = {'a','a','b','b','c','c','a','a'};
        int length1 = compress(letters);
        System.out.println("Compressed length: " + length1); 
        System.out.println("Compressed string: " + new String(letters, 0, length1));
    }
}
