package StringII;

import java.util.HashSet;
import java.util.Set;

//Given a string s, find the length of the longest substring
//without repeating characters.
//Input: s = "abcabcbb"
//        Output: 3
//        Explanation: The answer is "abc", with the length of 3.
public class LogestSubstringWithOnlyUniqueChar {
    public int longestSubstring(String input) {
        // use a sliding window of (slow, fast)
        // the distinct set contains all distinct character
        Set<Character> distinct = new HashSet<>();
        int slow = 0;
        int fast = 0;
        int longest = 0;
        while (fast < input.length()) {
            if (distinct.contains(input.charAt(fast))) {
                // if there is duplicate character, we need to move slow
                distinct.remove(input.charAt(slow++));
            }else {
                // of no duplicate, we can slide fast and we have a new
                // window (slow, fast) contains all distinct characters
                distinct.add(input.charAt(fast++));
                longest = Math.max(longest, fast - slow);
            }
        }
        return longest;
    }
}
