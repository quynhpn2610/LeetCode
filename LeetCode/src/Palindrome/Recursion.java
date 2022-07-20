package Palindrome;

public class Recursion {
    //client
    public boolean isPalindrome(String s){
        s = s.replaceAll("\\s+","");
        s = s.replaceAll("[^a-z0-9A-Z]", "");
        s = s.toLowerCase();
        return isPalindromeR(s);
    }

    private static boolean isPalindromeR(String s) {
        if (s.length() == 0 || s.length() == 1){
            return true;
        }
        return s.charAt(0) == s.charAt(s.length()-1) && isPalindromeR(s.substring(1, s.length()-1));
    }
}
