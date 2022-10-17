public class Main {
    public static void main(String[] args){
        Solution solution= new Solution();
        System.out.println( solution.searchInsert(new int[]{1,3,4,5},2));
    }
}
class Solution {
    public int searchInsert(int[] nums, int target) {
        target = 2;
        nums = new int[]{1, 3, 4, 5};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[target])
                return nums[i];
            else {

                return nums[target];
            }
        }
        return nums[target];
    }
}