// Given a string s, find the first non-repeating character in it and return its index.
// If it does not exist, return -1.
package FirstUniqueChar_387;
import java.util.*;

class MyCharacter implements Comparable<MyCharacter>{
    char myChar;
    int charId;
    int charFreq;

    public MyCharacter(char myChar, int charId, int charFreq) {
        this.myChar = myChar; //characters in string s
        this.charId = charId; //characters' index
        this.charFreq = charFreq; //value of each character key in the hashmap
    }

    @Override
    // Compare freq. If same freq -> compare id
    public int compareTo(MyCharacter c) {
        if(Integer.compare(this.charFreq, c.charFreq) == 0){
            return (Integer.compare(this.charId, c.charId));
        }
        return Integer.compare(this.charFreq, c.charFreq);
    }
}



public class FirstUniqueChar {
    public Map<Character, Integer> countCharacter(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
            else{
                map.put(s.charAt(i), 1);
            }
        }
        return map;
    }

    /**
     * create a list of MyCharacter objects
     * sort list by Collections.sort()
     * the first object has the lowest frequency and id.
     * If the frequency = 1, return its id. Else, return -1
     * @param s input string
     * @return index of first unique character in s
     */
    public int customizedComparable(String s){
        Map<Character, Integer> map = countCharacter(s);

        List<MyCharacter> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char charAtThis = s.charAt(i);
            MyCharacter character = new MyCharacter(charAtThis, i, map.get(charAtThis));
            list.add(character);
        }
        Collections.sort(list);

        if (list.get(0).charFreq == 1){
            return list.get(0).charId;
        }
        else{
            return -1;
        }
    }

    public int usingHashmap(String s) {
        Map<Character, Integer> map = countCharacter(s);

        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
        }
    }

