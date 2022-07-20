package Palindrome;

import java.util.Stack;

public class UsingStack2 {
    public static boolean isPalindrome3(String s){
        s = s.replaceAll("\\s+","");
        s = s.replaceAll("[^a-z0-9A-Z]", "");
        s = s.toLowerCase();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length()/2; i++){
            stack.push(s.charAt(i));
        }
        int j = s.length()/2;
        if (s.length()%2 == 1){
            j = (s.length()/2) + 1;
            //stack.pop();
        }
        for (int i = j; i < s.length(); i++){
            if (s.charAt(i) != stack.pop()) return false;
        }
        return true;
    }
}
