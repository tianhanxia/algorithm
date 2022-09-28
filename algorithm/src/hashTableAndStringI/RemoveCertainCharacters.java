package hashTableAndStringI;

import java.util.HashSet;
import java.util.Set;

// Remove particular chars from a string in place
public class RemoveCertainCharacters {
//    public StringBuilder removeChar(StringBuilder input) {
//        int i = 0;
//        for (int j = 0; j < input.length(); j++) {
//            if (input.charAt(j) != 'u' && input.charAt(j) != 'n') {
//                input.setCharAt(i, input.charAt(j));
//                i++;
//            }
//        }
//        input.delete(i, input.length());
//        return input;
//    }


    public String remove(String input, String t) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        // convert immutable string to char[]
        char[] array = input.toCharArray();
        // Get set of all distinct characters in t so that
        // lookup operation will be efficient
        Set<Character> set = buildSet(t);
        // slow: [0, slow) contains the valid result
        // fast: [fast, array.length) is the area to explore
        int slow = 0;
        for (int fast = 0; fast < array.length; fast++) {
            // the exploring character can only be put into valid
            // area if it is not in the set
            if (!set.contains(array[fast])) {
                array[slow++] = array[fast];
            }
        }
        // Convert the char[] subarray back to String
        return new String(array, 0, slow);
    }

    private Set<Character> buildSet(String t) {
        Set<Character> set = new HashSet<Character>();
        for (int i = 0; i < t.length(); i++) {
            set.add(t.charAt(i));
        }
        return set;
    }

    public static void main(String[] args) {
//        RemoveCertainCharacters test1 = new RemoveCertainCharacters();
        RemoveCertainCharacters test2 = new RemoveCertainCharacters();
//        StringBuilder input = new StringBuilder();
//        input.append("s");
//        input.append("t");
//        input.append("u");
//        input.append("d");
//        input.append("e");
//        input.append("n");
//        input.append("t");
//        System.out.println(test1.removeChar(input));

        String input2 = "abccd";
        String t = "c";
        System.out.println(test2.remove(input2, t));
    }
}
