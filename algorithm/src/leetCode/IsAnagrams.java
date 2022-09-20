package leetCode;

import java.util.HashMap;
import java.util.Map;

public class IsAnagrams {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> dict = new HashMap<>();
        for(char c : s.toCharArray()) {
            dict.put(c, dict.getOrDefault(c, 0) + 1);
        }
        for(char c : t.toCharArray()) {
            int count = dict.getOrDefault(c, 0);
            if (count == 0) {
                return false;
            } else {
                dict.put(c, count - 1);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        IsAnagrams test = new IsAnagrams();
        String s = "anagram";
        String t = "naaaaaa";
        Boolean result = test.isAnagram(s, t);
        System.out.println(result);
    }
}
