package MajorityElement_169;

import java.util.*;

public class Hashmap {
    public int majorityElement (int[] nums){
        int n = nums.length/2;
        Map<Integer, Integer> myMap = new HashMap<>();
        for (int i: nums) {
            if (myMap.containsKey(i)){
                myMap.put(i, myMap.get(i) + 1);
            }
            else{
                myMap.put(i, 1);
            }
        }

        for (int key: myMap.keySet()) {
            if (myMap.get(key) > 1) {
                return key;
            }
        }
        return -1;

    }
}
