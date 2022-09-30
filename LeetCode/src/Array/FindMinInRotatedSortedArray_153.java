package Array;

import java.util.Scanner;

public class FindMinInRotatedSortedArray_153 {
    public static int findMin(int[] nums){
        int min = nums[0]; // in case nums is increasing already
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] > nums[i+1]){
                min = nums[i+1];
                break;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(findMin(nums));
    }
}
