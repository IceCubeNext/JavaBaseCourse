public class CharExpression {
    /**
     * 
     * @param a any number
     * @return symbol from UNICODE table from '\' on distance a
     */
    public static char charExpression(int a) {
        return (char)('\\' + a);
    }
}
