package PairsDivisibleBy60;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PairsDivisibleBy60_1010 {
    static int numPairsDivisibleBy60(int[] time){
        // Luu so du va so lan xuat hien
        Map<Integer, Integer> map = new HashMap<>();
        int n = time.length;
        int count = 0;
        int remainder = 0;

        for (int i = 0; i < n; i++) {
            remainder = time[i] % 60;
            if (remainder == 0){
                if (map.containsKey(0)){
                    count += map.get(0);
                }
            }
            else if (map.containsKey(60-remainder)){
                count += map.get(60-remainder);
            }
            map.put(remainder, map.getOrDefault(remainder, 0)+1);
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] time = new int[n];
        for (int i = 0; i < n; i++) {
            time[i] = Integer.parseInt(sc.next());
        }
        sc.close();
        System.out.println(numPairsDivisibleBy60(time));
    }

}
