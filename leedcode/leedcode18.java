import java.util.*;

public class leedcode18 {
    public static void main(String[] args) {
        int[] nums = { 1, 0, -1, 0, -2, 2 };
        int target = 0;
        Solution solution = new Solution();
        List<List<Integer>> ans = solution.fourSum(nums, target);
        System.out.println(ans);

    }

}

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length;) {

                int p = j + 1;
                int q = nums.length - 1;

                while (p < q) {

                    long sum = (long) nums[i] + (long) nums[j] + (long) nums[p] + (long) nums[q];
                    if (sum < target) {
                        p++;

                    } else if (sum > target) {
                        q--;
                    } else {
                        result.add(Arrays.asList(nums[i], nums[j], nums[p], nums[q]));
                        p++;
                        q--;
                        while (p < q && nums[p] == nums[p - 1]) {
                            p++;
                        }
                    }

                }
                j++;
                while (j < nums.length && nums[j] == nums[j - 1]) {
                    j++;
                }
            }

        }
        return result;

    }
}
