package CheckStraightLine_1232;

public class CheckStraightLine {
    private boolean checkStraightLine(int[][] coordinates) {
        int[] nums1 = coordinates[0];
        int[] nums2 = coordinates[1];
        int slope = Slope(nums1, nums2);

        for (int i = 0; i < coordinates.length; i++) {
            int[] nums = coordinates[i];
            if (Slope(nums1, nums) != slope){
                return false;
            }
        }
        return true;

    }

    private int Slope(int[] x1y1, int[] x2y2){
        int x1 = x1y1[0];
        int y1 = x1y1[1];
        int x2 = x2y2[0];
        int y2 = x2y2[1];

        if (x1 == x2){
            return -1;
        }

        if (y1 == y2){
            return 0;
        }

        int slope = (y2-y1)/(x2-x1);
        return slope;
    }


}
