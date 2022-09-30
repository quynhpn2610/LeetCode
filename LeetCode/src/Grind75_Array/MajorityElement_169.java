package Grind75_Array;

import java.util.*;

public class MajorityElement_169 {
    public int majorityElement(int[] nums) {
        int n = nums.length/2;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if (map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i], 1);
            }
        }

        for (int j:
             map.keySet()){
            if (map.get(j) > n){
                return j;
            }
        }

        return -1;
    }
}
