package OneStringSwap_1790;

import java.util.Scanner;
import java.util.Stack;

public class OneSwap_1790{
    private static boolean areAlmostEqual (String s1, String s2){
        if (s1.equals(s2)){
            return true;
        }
        if (s1.length() != s2.length()){
            return false;
        }
        Stack <Character> stack = new Stack<>();
        boolean pushed = true;
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)){
                if(pushed){
                    stack.push(s1.charAt(i));
                    stack.push(s2.charAt(i));
                    pushed = false;
                }
                else{
                    if(stack.isEmpty()) return false;
                    else if (stack.pop() != s1.charAt(i) || stack.pop() != s2.charAt(i)){
                        return false;
                    }
                }
            }
        }
        return (stack.isEmpty());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        boolean ans = areAlmostEqual(s1, s2);
        System.out.println(ans);
    }
}
