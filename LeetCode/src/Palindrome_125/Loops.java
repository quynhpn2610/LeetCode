package Palindrome_125;

// A program to check whether a string is a palindrome
// Using loops
public class Loops{
    public static boolean isPalindrome1(String str){
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