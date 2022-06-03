package NearestValidPoint_1779;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    // method to find the nearest point
    public int nearestValidPoint(int x, int y, int[][] points) {
        Map<Integer, int[]> myQualifiedPoints = filter1(x, y, points);
        double minDistance = Double.MAX_VALUE;
        int minIndex = -1;
        int[] curPoint = new int[]{x, y};

        for (Integer i:
                myQualifiedPoints.keySet()) {
            double thisDistance = calculateDistance(curPoint, myQualifiedPoints.get(i));
            if(thisDistance < minDistance){
                minDistance = thisDistance;
                minIndex = i;
            }
        }
        return minIndex;

    }

    // method to return a map whose keys = indexes of point in points, values = point in points
    private Map<Integer, int[]> filter1(int x, int y, int[][] points){
        Map<Integer, int[]> qualifiedPoints = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            if (x == points[i][0] || y == points[i][1]){
                qualifiedPoints.put(i, points[i]);
            }
        }
        return qualifiedPoints;
    }

    // method to calculate distance between 2 points
    private double calculateDistance(int[] point1, int[] point2){
        int x1 = point1[0];
        int y1 = point1[1];
        int x2 = point2[0];
        int y2 = point2[1];
        return Math.abs(x1-x2) + Math.abs(y1-y2);
    }
}
