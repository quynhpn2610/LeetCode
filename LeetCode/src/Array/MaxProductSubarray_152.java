package Array;

import java.util.Scanner;

public class MaxProductSubarray_152 {
    public static int maxProduct(int[] nums) {
        int res = nums[0];
        int curMin = 1, curMax = 1;

        for(int n: nums){
            if (n > res) res = n;
        }

        for (int n:
             nums) {
            int temp = curMax * n;
            curMax = Math.max(curMax*n, curMin*n);
            curMax = Math.max(curMax, n);

            curMin = Math.min(temp, curMin*n);
            curMin = Math.min(curMin, n);
            res = Math.max(res, curMax);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(maxProduct(nums));
    }
}
