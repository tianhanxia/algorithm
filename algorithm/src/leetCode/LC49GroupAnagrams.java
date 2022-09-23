package leetCode;

import java.util.*;

public class LC49GroupAnagrams {
//    Input: strs = ["eat","tea","tan","ate","nat","bat"]
//    Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            // keyStr stores sorted string for the key of HashMap
            String keyStr = String.valueOf(ca);
            if (!map.containsKey(keyStr)) {
                map.put(keyStr, new ArrayList<>());
            }
            map.get(keyStr).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        LC49GroupAnagrams test = new LC49GroupAnagrams();
        String[] input = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(test.groupAnagrams(input));
    }
}
