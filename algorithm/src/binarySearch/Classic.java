package binarySearch;


public class Classic {
    public static int classicBinarySearch(int[] array, int target){
        if (array == null || array.length == 0){
            return -1;
        }
        
        int left = 0;
        int right = array.length - 1;
        while (left <= right){
            int mid = left + (right - left) / 2;

            if (array[mid] == target){
                return mid;
            }else if (array[mid] < target){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] array = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        int result = classicBinarySearch(array, target);
        System.out.println(result);

    }
}
