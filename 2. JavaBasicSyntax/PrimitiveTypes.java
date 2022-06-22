public class PrimitiveTypes {
    public static void main(String[] args) {
        System.out.println("true here:");
        System.out.println(booleanExpression(false, false, true, true));
        System.out.println(booleanExpression(false, true, false, true));
        System.out.println(booleanExpression(false, true, true, false));
        System.out.println(booleanExpression(true, false, false, true));
        System.out.println(booleanExpression(true, false, true, false));
        System.out.println(booleanExpression(true, true, false, false));
        System.out.println("false here:");
        System.out.println(booleanExpression(false, false, false, false));
        System.out.println(booleanExpression(false, false, false, true));
        System.out.println(booleanExpression(false, false, true, false));
        System.out.println(booleanExpression(false, true, false, false));
        System.out.println(booleanExpression(false, true, true, true));
        System.out.println(booleanExpression(true, false, false, false));
        System.out.println(booleanExpression(true, false, true, true));
        System.out.println(booleanExpression(true, true, false, true));
        System.out.println(booleanExpression(true, true, true, false));
        System.out.println(booleanExpression(true, true, true, true));
    }
    /**
     * returns true only if 2 variables are true
     */
    public static boolean booleanExpression (boolean a, boolean b, boolean c, boolean d){
        return ((a!=b) && (c!=d)) || ((a!=c) && (b!=d));
    }
}
