public final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    @Override
    public boolean equals(Object anObject){
        if(this == anObject){
            return true;
        }
        if(anObject instanceof ComplexNumber){
            ComplexNumber other = (ComplexNumber)anObject;
            if(re * other.im == im * other.re){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode(){
        return java.lang.Double.hashCode(re / im);
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }
}
