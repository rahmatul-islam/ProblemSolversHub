import java.util.Arrays;

public class Leedcode136 {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        int result = Solution.singleNumber(nums);
        System.out.println("The single number is: " + result);
    }
}
class Solution {
    static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            int mid = l + (r - l) / 2;

            // Keep mid at even index so we can compare pairs: mid and mid+1.
            if (mid % 2 == 1) {
                mid--;
            }

            if (nums[mid] == nums[mid + 1]) {
                l = mid + 2;
            } else {
                r = mid;
            }
        }

        return nums[l];
        
    }
}