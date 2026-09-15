//287. Find the Duplicate Number

//https://leetcode.com/problems/find-the-duplicate-number/description/

public class leedcode287 {
    public static void main(String [] args){
    int nums[]={1,3,4,2,2};
    int result=findDuplicate(nums);
    System.out.println(result);
}




    public static int findDuplicate(int[] nums) {
        int i=0;
        // cycle sort use find write index
        while (i<nums.length) {
            int correct=nums[i]-1;

            // present index or right index are not same place 
            if (nums[i]!=nums[correct]) {


                swap(nums, i, correct);
                
            }
            //present index or right index are same place 
            else{
                // index or correct index are not same so find duplocate valu return vale
            if (i!=correct) {
                
                return nums[i];
            }
            
                i++;
            }
        }
        
            
        
        return -1;

    }
    private  static void  swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
        


    }

