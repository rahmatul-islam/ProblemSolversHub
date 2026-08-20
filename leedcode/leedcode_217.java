import java.util.Arrays;

public class leedcode_217 {
    public static void main(String[] args) {
        int [] nums={1,2,3,1};
       boolean result= containsDuplicate(nums);
        System.out.println(result);
        
        
    }

    public static boolean containsDuplicate(int[] nums) {
    Arrays.sort(nums);
    for(int i=0;i<nums.length-1;i++){

        
            if (nums[i]==nums[i+1]) {
                return true;
                
            }

        }
        return false;



    
// এটা তে টাইম complexxelpmoc সিটি অনেক তাই 
    // public static boolean containsDuplicate(int[] nums) {
    // Arrays.sort(nums);
    // for(int i=0;i<nums.length;i++){

    //     for(int j=i+1;j<nums.length;j++)
    //         if (nums[i]==nums[j]) {
    //             return true;
                
    //         }

    //     }
    //     return false;
    // }
    
    }
    

