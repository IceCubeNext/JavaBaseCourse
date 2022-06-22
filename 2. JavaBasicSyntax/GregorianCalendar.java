
public class GregorianCalendar {
    /**
     * returns the number of leap years in range of 1 to year
     */
    public static int leapYearCount(int year){
        return (year / 400) + (year / 4) - (year / 100);
    }
}
