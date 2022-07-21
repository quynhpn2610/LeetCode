package PairsDivisibleBy60;

import java.util.Scanner;

public class PairsDivisibleBy60_1010 {
    static int numPairsDivisibleBy60(int[] time){
        int[] remainders = new int[60];
        int count = 0;

        for (int t:
             time) {
            if (t % 60 == 0){
                count += remainders[0];
            }
            else{
                int target = 60 - t % 60;
                count += remainders[target];
            }
            remainders[t % 60]++;
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
