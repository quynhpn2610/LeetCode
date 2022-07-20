package Palindrome;

public class BreakPalindrome {
    public String breakPalindrome(String palindrome){
        int n = palindrome.length();
        if (n <= 1) return "";

        char[] p = palindrome.toCharArray();

        for (int i = 0; i < n; i++) {
            int j = n-1-i;
            if (i==j){
                continue;
            }
            if (p[i] != 'a'){
                p[i] = 'a';
                return String.valueOf(p);
            }
        }
        p[n-1] = 'b';
        return String.valueOf(p);
    }
}
