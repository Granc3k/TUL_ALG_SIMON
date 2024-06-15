import org.junit.Test;
import static org.junit.Assert.*;

public class PexesoTest {
    
    public PexesoTest() {
    }
    
    @Test
    public void testArrayToMatrix() {
        System.out.println("ArrayToMatrix");
        int[] array = {1,8,5,3,1,2};
        int row = 2;
        int column = 3;
        int[][] expResult = {{1,8,5},{3,1,2}};
        int[][] result = Pexeso.ArrayToMatrix(array, row, column);
        assertArrayEquals(expResult, result);
    }
    @Test
    public void testArrayToMatrix2() {
        System.out.println("ArrayToMatrix");
        int[] array = {1,8,5,3,1,2};
        int row = 3;
        int column = 3;
        int[][] expResult = {{1,8,5},{3,1,2}};
        int[][] result = Pexeso.ArrayToMatrix(array, row, column);
        assertArrayEquals(expResult, result);
    }
}
