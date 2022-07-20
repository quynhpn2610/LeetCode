package Palindrome;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Get user input
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your word: ");
        String s = sc.nextLine();

        // string preprocessor
        s = s.replaceAll("\\s+","");
        s = s.replaceAll("[^a-z0-9A-Z]", "");
        s = s.toLowerCase();

        if(Loops.isPalindrome1(s)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        sc.close();
    }
}