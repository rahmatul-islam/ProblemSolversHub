import java.util.Arrays;

public class leedcode1431 {
    public static void main(String[]args){
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        boolean []ans=new boolean[candies.length];
        ans=Solution.kidsWithCandies(candies, extraCandies);
        System.out.println(Arrays.toString(ans));


    }

}

class Solution {
    public static boolean[] kidsWithCandies(int[] candies, int extraCandies) {

        boolean[] result = new boolean[candies.length];
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        for (int i = 0; i < candies.length; i++) {
            if ((candies[i] + extraCandies) >= max) {
                result[i] = true;

            } else {
                result[i] = false;
            }

        }
        return result;

    }
}
