package Matrix_74;

// m*n
public class BruteForce {
    public boolean searchMatrix (int[][] matrix, int target){
        if (matrix.length == 0){
            return false;
        }
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[m][n] == target){
                    return true;
                }
            }
        }
        return false;
    }
}
