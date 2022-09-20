package DFS;

import java.util.ArrayList;
import java.util.List;

public class AllSubsetsI {
    public List<String> subSets(String set) {
        // Write your solution here.
        List<String> result = new ArrayList<String>();
        if (set == null) {
            return result;
        }
        char[] arraySet = set.toCharArray();
        StringBuilder sb = new StringBuilder();
        helper(arraySet, sb, 0, result);
        return result;
    }

    private void helper(char [] set, StringBuilder sb, int index, List<String> result) {
        if (index == set.length) {
            result.add(sb.toString());
            return;
        }
        helper(set, sb, index + 1, result);
        sb.append(set[index]);
        helper(set, sb, index + 1, result);
        sb.deleteCharAt(sb.length() - 1);
    }

    public static void main(String[] args) {
        AllSubsetsI ass = new AllSubsetsI();
        System.out.println(ass.subSets("abcd"));
    }
}
