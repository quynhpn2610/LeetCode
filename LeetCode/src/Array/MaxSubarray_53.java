package Array;

import java.util.Scanner;

public class MaxSubarray_53 {
    public static int maxSubarray(int[] nums){
        int curSum = 0;
        int maxSum = nums[0];

        for (int num:
             nums) {
            if (curSum < 0) curSum = 0;
            curSum += num;
            maxSum = Math.max(curSum, maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(maxSubarray(nums));
    }
}
