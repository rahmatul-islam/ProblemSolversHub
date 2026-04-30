public class leedcode1512 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1, 1, 3 };
        Solution s = new Solution();
        int result = s.numIdenticalPairs(nums);
        System.out.println(result);
    }
}

class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;

    }
}
