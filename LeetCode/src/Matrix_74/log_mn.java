package Matrix_74;

public class log_mn {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) {
            return false;
        }

        int n = matrix[0].length - 1;

        int low = 0; //index of first sub-array
        int high = matrix.length - 1; //index of last sub-array

        while (low <= high) {

            int mid = (low + high) / 2; //find the middle array

            // check if the first element of the mid array is the target
            if (matrix[mid][0] == target) {
                return true;
            }
            // check if the target is in the array and find the exact position of the target
            if (matrix[mid][0] < target && matrix[mid][n] >= target && binarySearch(matrix[mid], target)) {
                return true;
            }
            //
            else if (target > matrix[mid][0]) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return false;
    }

    public static boolean binarySearch(int[] nums, int myTarget) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high){
            int mid = (low+high)/2;
            if (nums[mid] == myTarget){
                return true;
            }
            else if (myTarget < nums[mid]){
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return false;
    }

    /*

     */
}
