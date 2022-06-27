import java.math.BigInteger;

public class Factorial {
    /**
     * Calculates factorial of given <code>value</code>.
     *
     * @param value positive number
     * @return factorial of <code>value</code>
     */
    public static BigInteger factorial(int value) {
        BigInteger f = BigInteger.valueOf(1);
        for(int i = 1; i <= value; i++){
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }
}
