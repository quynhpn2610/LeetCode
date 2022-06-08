package NextGreaterElement_496;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Onm {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // create a hashmap to keep elements & indexes of nums1
        Map<Integer, Integer> myMap = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            myMap.put(nums1[i], i);
        }
        // Create a result array and instantiate all element to -1
        int[] res = new int[nums1.length];
        Arrays.fill(res, -1);

        // Loop qua nums2: If nums2.element KO trong map (tuc la trong nums1) thi continue.
        // Else, loop qua phan con lai cua nums 2: Neu nums2[j] > nums2[i], tim index cua nums2[i] trong map
        // va add nums2[j] vao index do trong array moi.
        for (int i = 0; i < nums2.length; i++) {
            if (!myMap.containsKey(nums2[i])) continue;
            for (int j = i+1; j < nums2.length; j++) {
                if (nums2[j] > nums2[i]){
                    int Index = myMap.get(nums2[i]);
                    res[Index] = nums2[j];
                    break;
                }
            }
        }
        return res;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] nums1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] nums2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }
}
