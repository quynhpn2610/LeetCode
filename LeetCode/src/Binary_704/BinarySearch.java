package Binary_704;

public class BinarySearch {
    public int search (int[] nums, int target){
        int left_pointer = 0;
        int right_pointer = nums.length - 1;
        while (left_pointer <= right_pointer){
            int mid_pointer = (left_pointer+right_pointer)/2;
            if(target == nums[mid_pointer]){
                return mid_pointer;
            }
            else if (target < nums[mid_pointer]){
                right_pointer = mid_pointer - 1;
            }
            else{
                left_pointer = mid_pointer + 1;
            }
        }
        return -1;
    }
}