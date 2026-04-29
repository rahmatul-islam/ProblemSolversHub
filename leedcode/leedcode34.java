public class leedcode34 {
    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target=8;
        int result[]=Solution.searchRange(nums,target);
        System.out.println(result[0]+" "+result[1]);

    }

}

class Solution {
    public static int[] searchRange(int[] nums, int target){
        int fast=Solution.searchRangeFAST(nums, target);
        int last=Solution.searchRangeLAST (nums, target);
        return new int[]{fast,last} ;


    }
public static int searchRangeFAST(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                ans = mid;
                end = mid - 1;

            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return ans;
    }

    public static int searchRangeLAST(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                ans = mid;
                start = mid + 1;

            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return ans;
    }
}
