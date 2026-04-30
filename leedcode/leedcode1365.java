import java.util.Arrays;

public class leedcode1365 {
    public static void main(String[] args) {
        int nums[]={6,5,4,8};
        Solution s=new Solution();
        int [] result=s.smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(result));
    }
    
}
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] newarr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    count++;
                }
                newarr[i]=count;

            }
        }
        return newarr;
        
    }
}
