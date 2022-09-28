package hashTableAndStringI;

public class RemoveSpaces {
    public String removeSpaces(String input) {
       if (input.isEmpty()) {
           return input;
       }
       char[] array = input.toCharArray();
       int end = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == ' ' && (i == 0 || array[i - 1] == ' ')) {
                continue;
            }
            array[end++] = array[i];
        }
        if (end > 0 && array[end - 1] == ' ') {
            end--;
        }
        return new String(array, 0, end);
    }

    public static void main(String[] args) {
        RemoveSpaces test = new RemoveSpaces();
        String input = "   abc  de  ";
        System.out.println(test.removeSpaces(input));
    }
}
