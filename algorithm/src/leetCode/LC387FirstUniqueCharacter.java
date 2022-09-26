package leetCode;

import java.util.HashMap;
import java.util.Map;

public class LC387FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        Map<Character, Integer> hm = new HashMap<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        // find the index
        for (int i = 0; i < n; i++) {
            if(hm.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}
