package Array;

import java.util.Scanner;

public class BestDayToSellStock_121 {
    public static int maxProfit(int[] prices) {
        int l = 0;
        int r = 1;
        int maxP = 0;
        int len = prices.length;

        while (r < len){
            if (prices[r] > prices[l]){
                int profit = prices[r]-prices[l];
                maxP = Math.max(maxP, profit);
            }
            else{
                l = r; //move left one step
            }
            r++;
        }
        return maxP;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(maxProfit(nums));
    }
}
