package Matrix_74;


public class Binary_mlogn {
    public boolean searchMatrix(int[][] matrix, int target){
        if (matrix.length == 0 || matrix[0].length == 0){
            return false;
        }

        int row = matrix.length;
        int col = matrix[0].length;
// m
        for(int[] record: matrix){
            if (target >= record[0] && target <= record[col -1] && searchRecord(record, target)){
                return true;
            }
        }
        return false;
    }
// log n
    public static boolean searchRecord(int[] record, int target) {
        int start = 0;
        int end = record.length;

        while (start <= end){
            int mid = (start + end)/2;
            if (record[mid] == target){
                return true;
            }
            else if (record[mid] < target){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return false;
    }
}

