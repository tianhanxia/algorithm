package leetCode;

//Write an efficient algorithm that searches for a value target in an m x n integer matrix matrix. This matrix has the following properties:
//Integers in each row are sorted from left to right.
//The first integer of each row is greater than the last integer of the previous row.
//Input: matrix = [[1,3,5,7],
//                  s e m
//                 [10,11,16,20],
//                   e
//                 [23,30,34,60]] , target = 3
//
//Output: true
//Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
//Output: false
public class SearchMatrix {
    // time: O(logN) N is the number of elements in the matrix
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;  // 3
        int column = matrix[0].length; // 4
        int start = 0;
        int end = row * column - 1; // 4

        while(start <= end) {
            int mid = start + (end - start) / 2; // 2
            int number = matrix[mid / column][mid % column]; //[1][1]
            if (number == target) {
                return true;
            } else if (number < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 4;
        System.out.println(searchMatrix(matrix, target));
        int[] array = new int[10];
    }
}
