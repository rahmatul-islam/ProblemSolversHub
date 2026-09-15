//268. Missing Number
//https://leetcode.com/problems/missing-number/description/

import java.util.Arrays;

public class leedcode268 {

    public static void main(String[] args) {
        int[]nums={3,0,1};
       int result= missingNumber(nums);
       System.out.println(result);
        
    }


    public static int missingNumber(int []nums){
        int i=0;
        while (i<nums.length) {
            int correct=nums[i];

            if (nums[i]>=0&&nums[i]<nums.length&&nums[i]!=nums[correct]) {

                swap(nums, i, correct);
                
            }else{
                i++;
            }
            
        }
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index){
                return index;
            }
        }

        return nums.length;
    }

    public static  void swap(int []arr,int i,int j){

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
}
