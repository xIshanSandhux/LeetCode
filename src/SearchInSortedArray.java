/*
 *  LeetCode
 *   Question Number:- 33
 *   Difficulty:- Medium
 *   Complexity:- O(log n)
 */
public class SearchInSortedArray {
    public static int search(int[] nums, int target) {
        int index = -1;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                index = i;
                break;
            }
        }

        return index;
    }

}
