package Blind75.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum_1 {
//    public static int[] twoSum(int[] nums, int target) {
//        int[] res = new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target){
//                    res[0] = i;
//                    res[1] = j;
//                }
//            }
//        }
//        return res;
//    }

    public static int[] twoSum (int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>(); //key = element, value = index
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)){
                res[0] = i;
                res[1] = map.get(complement);
            }
            map.put(nums[i], i);
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
        int target = sc.nextInt();
        System.out.println(Arrays.toString(twoSum(nums, target)));
        sc.close();
    }
}
