package SingleNum_136;
import java.util.*;
public class SingleNumber {
    public int singleNum(int[] nums){
        if (nums.length == 0){
            return 0;
        }
        if (nums.length == 1){
            return nums[0];
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int num: nums) {
            if (map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }
            else {
                map.put(num, 1);
            }
        }

        for (Integer key: map.keySet()){
            if(map.get(key) == 1){
                return key;
            }
        }
        return -1;
    }
}
