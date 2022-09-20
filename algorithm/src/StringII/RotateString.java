package StringII;

public class RotateString {
    public String rotateString(String str, int left, int right) {
        int len = str.length();
        int offset = ((right - left) % len + len) % len;

        if (str.length() <= 1) {
            return str;
        }
        char[] array = str.toCharArray();
        offset %= array.length;
        reverse(array, array.length - offset, array.length - 1);
        reverse(array, 0, array.length - offset - 1);
        reverse(array, 0, array.length - 1);
        return new String(array);
    }

    private void reverse(char[] array, int left, int right) {
        while (left < right) {
            char tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        RotateString rs2 = new RotateString();
        String str = "abcdef";
        int left = 1;
        int right = 2;
        String result = rs2.rotateString(str, left, right);
        System.out.println(result);
    }
}
