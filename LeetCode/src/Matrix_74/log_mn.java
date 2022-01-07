package Matrix_74;

public class log_mn {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) {
            return false;
        }

        int m = matrix.length;
        int n = matrix[0].length - 1;

        int low = 0;
        int high = matrix.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (matrix[mid][0] == target) {
                return true;
            }
            if (matrix[mid][0] < target && matrix[mid][n] >= target && binarySearch(matrix[mid], target)) {
                return true;
            } else if (matrix[mid][0] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    public static boolean binarySearch(int[] nums, int myTarget) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == myTarget) {
                return true;
            } else if (nums[mid] < myTarget) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;

    }
}
