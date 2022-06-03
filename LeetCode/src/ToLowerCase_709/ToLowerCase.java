package ToLowerCase_709;

import java.util.Scanner;

public class ToLowerCase {
    private static String toLowerCase(String s){
        char[] lowerString = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            int a = (int) s.charAt(i);
            if(a >= 65 && a <= 90){
                a += 32;
                lowerString[i] = (char) a;
            }
            else{
                lowerString[i] = s.charAt(i);
            }
        }
        return new String(lowerString);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(toLowerCase(s));

    }
}
