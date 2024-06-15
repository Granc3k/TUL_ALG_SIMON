//@author marts
public class experiments {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a=9;
        int b=2;
        double aa=9.7;
        double bb=2.0;
        
        System.out.println(a/b);//out 4
        System.out.println(aa/bb);//out 4.5
        double c=a/b;
        System.out.println(c);//out 4.0
        System.out.println((double)a/b);//out 4.5
        
        long d=a; //implicitni konverze
        int e=(int)aa;//explicitni konverze
        System.out.println(e);
    }
    
}
