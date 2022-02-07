package SumUnique;
import java.util.*;
public class SumUnique {
    public int sumOfUnique(int[] nums){
        int sum = 0;
        if (nums.length == 0){
            return 0;
        }

        else if (nums.length == 1){
            return nums[0];
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int num: nums) {
            if (map.containsKey(num)) {
                map.put(num, (map.get(num) + 1));
            } else {
                map.put(num, 1);
            }
        }

        for (int key: map.keySet()){
            if (map.get(key) == 1){
                sum += key;
            }
        }
        return sum;
    }
}
