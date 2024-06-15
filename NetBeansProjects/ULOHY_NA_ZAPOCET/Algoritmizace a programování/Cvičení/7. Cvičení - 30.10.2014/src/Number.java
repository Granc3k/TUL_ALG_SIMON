public class Number {
    public static void main(String[] args) {}
    
    /**
     * Generate random int from interval &ltmin,max&gt 
     * @param min
     * @param max
     * @return 
     */
    public static int generateNumber(int min, int max) {
        return (int) (Math.random()*(max-min+1)+min);
    }
}
