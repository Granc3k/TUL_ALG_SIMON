import org.junit.Test;
import static org.junit.Assert.*;
public class PiskvorkyTest {
    
    public PiskvorkyTest() {
    }

    @Test
    public void testKontrolaRadku() {
        System.out.println("KontrolaRadku");
        char[][] matice = {{' ', ' ', ' '},{'x', 'x', 'x'},{' ', ' ', ' '}};
        int pocetZnaku = 3;
        int aktualniRadek = 1;
        int aktualniSloupec = 1;
        boolean expResult = true;
        boolean result = Piskvorky.KontrolaRadku(matice, pocetZnaku, aktualniRadek, aktualniSloupec);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testKontrolaSloupce() {
        System.out.println("KontrolaSloupce");
        char[][] matice = {{' ', 'x', ' '},{' ', 'x', ' '},{' ', 'x', ' '}};
        int pocetZnaku = 3;
        int aktualniRadek = 1;
        int aktualniSloupec = 1;
        boolean expResult = true;
        boolean result = Piskvorky.KontrolaSloupce(matice, pocetZnaku, aktualniRadek, aktualniSloupec);
        assertEquals(expResult, result);
    }
    /**
     * Test of KontrolaHlavniDiagonay method, of class Pexeso.
     */
    @Test
    public void testKontrolaHlavniDiagonay() {
        System.out.println("KontrolaHlavniDiagonay");
        char[][] matice = {{'x', ' ', ' '},{' ', 'x', ' '},{' ', ' ', 'x'}};
        int pocetZnaku = 3;
        int aktualniRadek = 1;
        int aktualniSloupec = 1;
        boolean expResult = true;
        boolean result = Piskvorky.KontrolaHlavniDiagonay(matice, pocetZnaku, aktualniRadek, aktualniSloupec);
        assertEquals(expResult, result);
    }

    /**
     * Test of KontrolaVedlejsiDiagonay method, of class Pexeso.
     */
    @Test
    public void testKontrolaVedlejsiDiagonay() {
        System.out.println("KontrolaVedlejsiDiagonay");
        char[][] matice = {{' ', ' ', 'x'},{' ', 'x', ' '},{'x', ' ', ' '}};
        int pocetZnaku = 3;
        int aktualniRadek = 1;
        int aktualniSloupec = 1;
        boolean expResult = true;
        boolean result = Piskvorky.KontrolaVedlejsiDiagonay(matice, pocetZnaku, aktualniRadek, aktualniSloupec);
        assertEquals(expResult, result);
    }
}
