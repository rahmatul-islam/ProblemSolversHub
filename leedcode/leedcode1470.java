import java.util.Arrays;

public class leedcode1470{
public static void main(String[]args){
int [] nums = {2,5,1,3,4,7};
int n=3;
int ans[]=shuffle(nums, n);
System.out.println(Arrays.toString(ans));

}



    public  static int[] shuffle(int[] nums, int n) {
        int result[]=new int[n*2];
        int k=0;
        for(int i=0;i<n;i++){
            result[k++]=nums[i];
            result[k++]=nums[i+n];

        }
        return result;
    }
}