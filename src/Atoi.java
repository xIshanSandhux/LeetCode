/*
*  LeetCode
*   Question Number:- 8
*   Difficulty:- Medium
 */
public class Atoi {
    public static int myAtoi(String s) {

        if(s.length()==0){
            return 0;
        }

        long number = 0;
        char[] chars = s.toCharArray();
        int i = 0;
        double sign = 1;
        char current = chars[i];


        while(current == ' '){
            i++;
            if(i == s.length()){
                return 0;
            }
            current = chars[i];

        }
        if(chars[i]=='-'){
            sign = -1;
            i++;
        }else if(chars[i]=='+'){
            sign = 1;
            i++;
        }

        for(;i<s.length();i++){
            current = chars[i];
            if(current<'0' || current>'9'){

                break;
            }else{

                number *=10;
                number +=current - '0';

                if(number==23){
                    System.out.println(i);

                }

                if(sign*number<=Integer.MIN_VALUE){
                    return Integer.MIN_VALUE;
                }
                if(sign*number>=Integer.MAX_VALUE){
                    return Integer.MAX_VALUE;
                }
            }
        }
        int r = (int)(number * sign);
        return r;
    }
}
