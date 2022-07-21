package Palindrome;

public class LongestSubstring_5{
    public String longestPalindrome(String s) {
        String res = "";
        int resLen = 0;
        char[] a = s.toCharArray();

        for (int i = 0; i < a.length; i++) {
            // odd length
            int l = i;
            int r = i;
            while (l>=0 && r<s.length() && a[l] == a[r]){
                if ((r-l+1) > resLen){
                    res = s.substring(l, r+1);
                    resLen = r-l+1;
                }
                l--;
                r++;
            }

            // even length
            l = i;
            r = l+1;
            while (l>=0 && r<s.length() && a[l] == a[r]){
                if ((r-l+1) > resLen){
                    res = s.substring(l, r+1);
                    resLen = r-l+1;
                }
                l--;
                r++;
            }
        }

        return res;
    }
}
