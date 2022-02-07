package KthLargestPosition_215;

import java.util.Arrays;

public class KthLargestPosition {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
