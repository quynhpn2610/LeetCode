package Matrix_74;

public class mPlusN {
    public boolean searchMatrix (int[][] matrix, int target){
        if (matrix.length == 0){
            return false;
        }

        int m = matrix.length;
        int n = matrix[0].length;

        int row = 0;
        int col = n - 1;

        while (col >= 0 && row < n){
            if (matrix[row][col] == target){
                return true;
            }
            else if (matrix[row][col] > target){
                col--;
            }
            else{
                row++;
            }
        }
        return false;
    }
}
