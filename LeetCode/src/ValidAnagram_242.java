import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram_242 {
    public static String sortString(String inputString){
        // convert input string to array
        char[] temp = inputString.toCharArray();

        // sort
        Arrays.sort(temp);

        // return
        return new String(temp);

    }
    public boolean isAnagram(String s, String t) {
        return sortString(s).equals(sortString(t));
    }
}