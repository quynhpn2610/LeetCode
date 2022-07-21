package Palindrome;

public class CountSubstrings_647 {
    public int countSubstrings(String s) {
        int res = 0;
        char[] a = s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            // find odd length substrings
            int l = i;
            int r = i;
            while (l >= 0 && r < a.length && a[l] == a[r]){
                res ++;
                l--;
                r++;
            }

            // find even length substrings
            l = i;
            r = l+1;
            while (l >= 0 && r < a.length && a[l] == a[r]){
                res ++;
                l--;
                r++;
            }
        }
        return res;
    }
}
