package BitRepresentationAndOperation;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int number) {
        return number > 0 && (number & (number - 1)) == 0;
    }
}
