public class leedcode_11 {
    public static void main(String[] args) {
        int []height={1,8,6,2,5,4,8,3,7};
        int result=maxArea(height);
        System.out.println(result);

    }

   public static int maxArea(int [] height){
    int maxWater=0;
    int leftpointer=0;
    int rightpointer=height.length-1;
    while (leftpointer<rightpointer) {

        int wi=rightpointer-leftpointer;
        int hi=Math.min(height[leftpointer],height[rightpointer]);
        int area=wi*hi;
        maxWater=Math.max(maxWater, area);

        if (height[leftpointer]<height[rightpointer]) {
            leftpointer++;
        }else{
            rightpointer--;
        }
        
    }
    return maxWater;


   }

    
    // bruteforse approice
    public static int maxArea1(int[] height) {

        int maxWater=0;
        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){

                int wi=j-i;
                int hi=Math.min(height[i], height[j]);

                int area=wi*hi;
                maxWater=Math.max(maxWater, area);
            }


        }
        return maxWater;
        
    }
}