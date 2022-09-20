package recursionIAndSortingAlgorithms;

public class AToThePowerOfB {
    public long power(int a, int b) {
        // Write your solution here
        if (b == 0) {
            return 1;
        }
        if (a == 0) {
            return 0;
        }
        long n = power(a, b / 2);
        if (b % 2 == 0){
            return n * n;
        } else {
            return n * n * a;
        }
    }

    public static void main(String[] args) {

    }
}
