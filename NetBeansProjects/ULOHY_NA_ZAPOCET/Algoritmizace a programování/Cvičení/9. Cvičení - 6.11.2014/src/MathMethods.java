public final class MathMethods {
    private MathMethods(){}
    
    /**
     * Calculate cos using Taylor series
     * @param angle in radian
     * @param eps precision
     * @return cos
     */
    public static double cos (double angle, double eps){
        double cos = 1;
        double element = -angle*angle/2;
        int i = 2;
        while (Math.abs(element) > eps){
            cos += element;
            element = -element*angle*angle/((i+1)*(i+2));
            i += 2;
        }
        return cos;
    }
}