//Day28
class Day28{
    public static int StringToInteger(String str){
        if(str == null || str.isEmpty()) return 0;

        int i = 0, result = 0, sign = 1;

        while(i < str.length() && str.charAt(i) == ' '){
            i++;
        }

        if(i < str.length() && (str.charAt(i) == '+' || str.charAt(i) == '-')){
            sign = (str.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        while(i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9'){
            int digit = str.charAt(i) - '0';

            if(result > (Integer.MAX_VALUE - digit) / 10){
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }

    public static void main(String[] args){
        System.out.println(StringToInteger("34"));           
        System.out.println(StringToInteger("   -34"));        
        System.out.println(StringToInteger("words and 999"));  
        System.out.println(StringToInteger("-3472332"));    
    }
}
