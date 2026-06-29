import java.util.*;

//Approach - 01 (Sorting)
class Solution {
    public boolean isAnagram(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();

        if(sLen != tLen){
            return false;
        }

        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        return Arrays.equals(sChar, tChar);
    }
}


// Approach - 02 (Using HashMap)

class Solution2 {
    public boolean isAnagram(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();

        if(sLen != tLen){
            return false;
        }
    
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for(char c: t.toCharArray()){
            if(!map.containsKey(c))
            return false;

            map.put(c, map.get(c)-1);

            if(map.get(c) == 0)
            map.remove(c);
        }
        return map.isEmpty();
    }
}


//Approach - 03 (using frequency Array)

class Solution3 {
    public boolean isAnagram(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();

        if(sLen != tLen){
            return false;
        }
        int[] count = new int[26];

        for(int i=0; i<sLen; i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }

        for(int x : count){
            if(x != 0){
                return false;
            }
        }
        return true;
    }
}
