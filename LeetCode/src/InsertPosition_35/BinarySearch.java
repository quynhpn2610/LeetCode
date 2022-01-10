// Given a sorted array of distinct integers and a target value, return the index if the target is found.
// If not, return the index where it would be if it were inserted in order.

package InsertPosition_35;

public class BinarySearch {
    public static int searchPos(int[] nums, int target){
        int low = 0, high = nums.length - 1;
        while (low <= high){
            int mid = (low+high)/2;
            if (nums[mid] == target){
                return mid;
            }
            else if (nums[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        
    }
}
