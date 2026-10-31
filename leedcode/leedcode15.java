
//https://leetcode.com/problems/3sum/description/?envType=problem-list-v2&envId=array


import java.util.*;

public class leedcode15 {
    public static void main(String[] args) {

        int nums[] = { -1, 0, 1, 2, -1, -4 };

        Solution solution = new Solution();
        List<List<Integer>> ans = solution.threeSum(nums);

        System.out.println(ans);

    }

}

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Sorting enables the two-pointer technique
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        // Fix one number and search for two other numbers

        for (int i = 0; i < nums.length; i++) {
            // Skip duplicate first numbers to avoid duplicate triplets
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                // Sum is too large, so move right pointer backward
                if (sum > 0) {
                    k--;
                }
                // Sum is too small, so move left pointer forward
                else if (sum < 0) {
                    j++;
                }
                // Found a valid triplet whose sum is zero
                else {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    // Skip duplicate values for the second number
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                    // Skip duplicate values for the third number

                    while (j<k&&nums[k]==nums[k+1]) {
                        k--;
                        
                    }

                }

            }

        }
        return result;
    }
}