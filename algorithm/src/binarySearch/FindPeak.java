package binarySearch;

/*
 * There is an integer array which has the following features:

The numbers in adjacent positions are different.
A[0] < A[1] && A[A.length - 2] > A[A.length - 1].
We define a position P is a peak if:

A[P] > A[P-1] && A[P] > A[P+1]
Find a peak element in this array. Return the index of the peak.

样例
Example 1:
	Input:  [1, 2, 1, 3, 4, 5, 7, 6]
	Output:  1 or 6

	Explanation:
	return the index of peek.


Example 2:
	Input: [1,2,3,4,1]
	Output:  3

挑战
Time complexity O(logN)

注意事项
It's guaranteed the array has at least one peak.
The array may contain multiple peeks, find any of them.
The array has at least 3 numbers in it.
 */

public class FindPeak {
    private int findPeak(int[] A) {
        int left = 0;
        int right = A.length - 1;

        while (left + 1 < right) {
            int mid = left + (right - left) / 2;

            if (A[mid] > A[mid - 1] && A[mid] > A[mid + 1]) {
                return mid;
            }

            if (A[mid] > A[mid - 1]) {
                left = mid;
            } else if (A[mid] < A[mid + 1]) {
                right = mid;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        FindPeak findPeak = new FindPeak();
        int[] array = {1, 2, 3, 1};
        int result = findPeak.findPeak(array);
        System.out.println(result);
    }
}
