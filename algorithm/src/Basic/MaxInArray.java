package Basic;

public class MaxInArray {
    public static void main(String[] args) {
        int[] array = {2, 3, 22};
        int max = Integer.MIN_VALUE;
        for (int i: array) {
            max = (max < i) ? max : i;
//            if (max < i) {
//                max = i;
//            }
        }
        System.out.println(max);
    }
}
