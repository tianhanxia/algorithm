package hashTableAndStringI;

//remove adjacent repeated character in a string, leave only one
// character for each group of such characters
public class RemoveAdjacentRepeatedCharactersI {
    public String deDup(String input) {
        if (input == null) {
            return null;
        }
        // Convert to char[] and do it in place
        char[] array = input.toCharArray();
        int end = 0;
        for (int i = 0; i < array.length; i++) {
            // repeated characters will be ignored except
            // for the first character in the sequence
            if (i == 0 || array[i] != array[end - 1]) {
                array[end++] = array[i];
            }
        }
        return new String(array, 0 , end);
    }

    public static void main(String[] args) {
        RemoveAdjacentRepeatedCharactersI test = new RemoveAdjacentRepeatedCharactersI();
        String input = "abbaaaaccccaaaaa";
        System.out.println(test.deDup(input));
    }
}
