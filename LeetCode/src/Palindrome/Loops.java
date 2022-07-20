package Palindrome;

import java.util.Locale;

// A program to check whether a string is a palindrome
// Using loops
public class Loops{
    public static boolean isPalindrome1(String str){
        str = str.replaceAll("\\s+", "");
        str = str.replaceAll("[^a-z0-9A-Z]", "");
        str = str.toLowerCase();
        int i = 0;
        int j = str.length()-1;
        while (i<j){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}