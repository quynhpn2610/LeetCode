package Grind75_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ProductOfArrayExceptSelf_238 {
    public static int[] productExceptSelf(int[] nums){
        int[] res = new int[nums.length];
        int prefix = 1;
        int postfix = 1;

        for (int i = 0; i < nums.length; i++) {
            res[i] = prefix;
            prefix *= nums[i];
        }

        for (int i = nums.length-1; i >= 0; i--) {
            res[i] *= postfix;
            postfix *= nums[i];
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
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
