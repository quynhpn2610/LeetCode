/**
 * Given an array of strings words and an integer k
 * return the k most frequent strings.
 * Return the answer sorted by the frequency from highest to lowest.
 * Sort the words with the same frequency by their lexicographical order.
 */

package TopKFreqWord_692;
import java.util.*;

public class TopKFreqWord {
    public static Map<String, Integer> countString(String[] words){
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (map.containsKey(words[i])){
                map.put(words[i], map.get(words[i]) + 1);
            }
            else{
                map.put(words[i], 1);
            }
        }
        return map;
    }

    public static List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> myMap = countString(words);

        List<MyString> list = new ArrayList<>();

        for (String w: myMap.keySet()
             ) {
            MyString newString = new MyString(w, myMap.get(w));
            list.add(newString);
        }

        Collections.sort(list);

        List<String> result = new ArrayList<>();
        int count = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            result.add(list.get(i).stringVal);
            count++;
            if (count == k) break;
        }
        return result;
    }


    public static void main(String[] args) {
        String[] words = {"the","day","is","sunny","the","the","the","sunny","is","is"};
        int k = 4;
        List<String> result = topKFrequent(words, k);
        for (String s : result) {
            System.out.println(s);
        }

    }
}

class MyString implements Comparable<MyString>{
    String stringVal;
    int stringFreq;

    public MyString(String myString, int stringFreq) {
        this.stringVal = myString;
        this.stringFreq = stringFreq;
    }

    @Override
    // Compare string freq. If same freq, compare lexicographic order.
    public int compareTo(MyString s){
        // this before s: ascending order and vice versa
        if (Integer.compare(this.stringFreq, s.stringFreq) == 0){
            return (s.stringVal.compareTo(stringVal));
        }
        return Integer.compare(this.stringFreq, s.stringFreq);
    }
}


