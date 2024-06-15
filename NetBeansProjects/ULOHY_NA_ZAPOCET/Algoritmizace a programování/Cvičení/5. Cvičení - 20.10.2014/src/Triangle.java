import java.util.Scanner;
public class Triangle {
    enum Ttype{rovnostranny, rovnoramenny, pravouhly, rovnoramenny_pravouhly, obecny, neexistuje};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a,b,c;
        final float PRESNOST = 0.00001f;
        Ttype type = Ttype.obecny;
        
        System.out.print("Zadej strany strojuhelniku (A, B, C): ");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        
        boolean canMake = (a+b > c) && (Math.abs(a-b)<c);
        
        float aa,bb,cc; // min, middle, max
        aa = Math.min(a, Math.min(b, c));
        bb = middle(a, b, c);
        cc = Math.max(a, Math.min(b, c));
        
        if (canMake){
            if (Math.abs(a-b) < PRESNOST && Math.abs(b-c) < PRESNOST){type = Ttype.rovnostranny;}
            else{
                if (Math.abs(a-b) < PRESNOST || Math.abs(b-c) < PRESNOST){type = Ttype.rovnoramenny;}
                if (Math.abs(aa*aa + bb*bb - cc*cc) < PRESNOST){
                    if (type == Ttype.rovnoramenny){type = Ttype.rovnoramenny_pravouhly;}
                    else type = Ttype.pravouhly;
                }
            }
        }
        else {type = Ttype.neexistuje;}
        
        switch(type){
            case rovnostranny:System.out.println("Trojuhelnik je rovnostranny"); break;
            case rovnoramenny:System.out.println("Trojuhelnik je rovnoramnenny"); break;
            case pravouhly:System.out.println("Trojuhelnik je pravouhly"); break;
            case rovnoramenny_pravouhly:System.out.println("Trojuhelnik je rovnoramnenny pravouhly"); break;
            case obecny:System.out.println("Trojuhelnik je obecny"); break;
            case neexistuje:System.out.println("Trojuhelnik neexistuje"); break;
        }
    }  
    public static float middle(float a, float b, float c){
        if (a<b){
            if(b<c){return b;}
            else if (a<c){return c;}
            else {return a;}
        }
        else {
            if(a<b){return a;}
            else if (c<b){return b;}
            else {return c;}
        }
    }
}