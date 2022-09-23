package leetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Given two strings s and goal, return true if you can swap two letters in s so the result is equal to goal, otherwise, return false.
//Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping the characters at s[i] and s[j].
//For example, swapping at indices 0 and 2 in "abcd" results in "cbad".

public class LC859BuddyStrings {
    // if A.length != B.length, return false
    // if A == B, need to swap same characters, check if duplicate char
    // if A != B, should be only 2 diffs and swap
    private boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }

        if (A.equals(B)) {
            Set<Character> s = new HashSet<>();
            for (char c : A.toCharArray()) {
                s.add(c);
            }
            return s.size() < A.length();
        }

        List<Integer> dif = new ArrayList<>();
        for (int i = 0; i < A.length(); ++i) {
            if (A.charAt(i) != B.charAt(i)) {
                dif.add(i);
            }
        }

        return dif.size() == 2 && A.charAt(dif.get(0)) == B.charAt(dif.get(1))
                && A.charAt(dif.get(1)) == B.charAt(dif.get(0));
    }
}
