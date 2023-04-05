public class Main {

    public static void leetcode_8(String s){
        int atoi = Atoi.myAtoi(s);
        System.out.println(atoi);
    }

    public static void leetcode_2042(String s){
        boolean ascending = AreNumbersAscending.areNumbersAscending(s);
        System.out.println(ascending);
    }

    public static void leetcode_33(int[] nums, int target){

        int  index = SearchInSortedArray.search(nums,target);
        System.out.println(index);
    }

    public static void main(String[] args) {
        leetcode_8("4193 with words");

        leetcode_2042("sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s");

        int[] num = {4,5,6,7,0,1,2};
        int target = 3;

        leetcode_33(num, target);

    }
}