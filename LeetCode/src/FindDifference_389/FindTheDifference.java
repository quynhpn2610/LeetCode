package FindDifference_389;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindTheDifference {
    private static char findTheDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }

        for (int i = 0; i < t.length(); i++) {
            if(map.containsKey(t.charAt(i)) && map.get(t.charAt(i)) > 0){
                map.put(t.charAt(i), map.get(t.charAt(i))-1);
            }
            else{
                return t.charAt(i);
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(findTheDifference(s, t));
    }
}
