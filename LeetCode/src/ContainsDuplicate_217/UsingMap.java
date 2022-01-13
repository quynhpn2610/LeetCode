package ContainsDuplicate_217;
import java.util.*;
public class hashMap {
    public boolean containsDuplicate(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i: nums){
            if (map.containsKey(i)){
                return true;
            }
            else{
                map.put(i, 1);
            }
        }
        return false;
    }
}
