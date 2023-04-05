/*
 *  LeetCode
 *   Question Number:- 2042
 *   Difficulty:- Easy
 */
public class AreNumbersAscending {
    public static boolean areNumbersAscending(String s){
        boolean t = false;
        if(s.length()==0){
            return false;
        }
        int n = -1;
        int prev = -1;
        String[] str = s.split(" ");

        for(int i=0;i<str.length;i++){

            if(prev>n){
                t = false;
                break;
            }
            try{
                n = Integer.parseInt(str[i]);
                t = true;

            }catch (Exception e){

            }
        }
        return t;
    }
}
