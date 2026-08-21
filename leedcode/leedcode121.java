public class leedcode121 {
    public static void main(String[] args) {

        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int a = best_Buy(prices);
        System.out.println(a);

    }

    static int best_Buy(int[] prices) {
        // প্রথম দিনের দামকে শুরুতে "সর্বনিম্ন" ধরে নিলাম
        int minPrice = prices[0];
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {

            profit = Math.max(profit, prices[i] - minPrice);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return profit;

    }

    // এই ভাবে কাজ করবে না ।
    // static int best_Buy(int []arr){

    // int a=getminIndex(arr, 0,arr.length-1);
    // int minvalue=arr[a];

    // int profit=0;

    // for(int i=a;i<arr.length;i++){
    // profit=Math.max(profit, arr[i]-minvalue);

    // }
    // return profit;
    // }

    // static int getminIndex(int[]arr, int start,int end){

    // int min=start;
    // for(int i=start;i<=end;i++){
    // if(arr[i]<arr[min]){
    // min=i;
    // }
    // }
    // return min;
    // }
}