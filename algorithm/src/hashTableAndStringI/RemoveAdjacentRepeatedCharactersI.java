package hashTableAndStringI;

public class RemoveAdjacentRepeatedCharactersI {
    public String deDup(String input) {
        if (input == null) {
            return null;
        }
        char[] array = input.toCharArray();
        int end = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0 || array[i] != array[end - 1]) {
                array[end++] = array[i];
            }
        }
        return new String(array, 0 , end);
    }
}
