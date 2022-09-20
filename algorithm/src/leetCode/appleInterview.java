package leetCode;

import linkedList.ListNode;

import java.util.*;

public class appleInterview {
    // string   char
    // a b c d a b b c a s c
    //                      i
    // map<char, int><a, 2>
    // map.contains()
    // a3b3c3d1s1


    // a5b4c3d2s1



    public static String countCharacter(String input) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : input.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<Map.Entry<Character, Integer>>(map.entrySet());

        //Collections.sort(list, (o1, o2) -> o2.getValue() - o1.getValue());
        list.sort((o1,o2) -> {
            if (o1.getValue() == o2.getValue()) {
                return o1.getKey().compareTo(o2.getKey());
            } else {
                return o2.getValue() - o1.getValue();
            }
        });

        StringBuilder result = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : list) {
            result.append(entry.getKey());
            result.append(entry.getValue());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String res = countCharacter("");
        System.out.println(res);

    }


}
