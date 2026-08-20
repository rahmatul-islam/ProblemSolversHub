import java.util.Arrays;

public class leedcode_912 {
    public static void main(String[] args) {
        int[] nums = { 5, 2, 3, 1 };
        Solution solve = new Solution();
        int[] result = solve.sortArray(nums);

        System.out.println(Arrays.toString(result));

    }
}
//not use bubble sort becuse time complesicty
class Solution {
    public static int[] sortArray(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }

        }

        return nums;

    }
}
