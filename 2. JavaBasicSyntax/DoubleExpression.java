public class DoubleExpression {
    /**
     * returns true if a + b == c. Epsilon is 0.0001
     */
    public static boolean doubleExpression(double a, double b, double c) {
        double EPSILON = 0.0001;
        return Math.abs((a + b) - c) < EPSILON;
    }
}
