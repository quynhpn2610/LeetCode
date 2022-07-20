package Palindrome;

import java.util.Stack;

public class UsingStack {
    public static boolean isPalindrome2(String str){
        str = str.replaceAll("\\s+","");
        str = str.replaceAll("[^a-z0-9A-Z]", "");
        str = str.toLowerCase();
        Stack<Character> stack = new Stack<>();
        String strReversed = "";
        for (int i=0; i<str.length(); i++){
            stack.push(str.charAt(i));
        }
        while(!stack.isEmpty()){
            strReversed += stack.pop();
        }
        if (str.equals(strReversed)){
            return true;
        }
        return false;
    }
}
