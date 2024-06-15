import org.junit.Test;
import static org.junit.Assert.*;

public class MatrixPropertiesTest {
    
    public MatrixPropertiesTest() {
    }
    
    /*
    @Test (expected=IllegalArgumentException.class)
    public void testIsUpTriangle1() {
        System.out.println("isUpTriangle");
        int[][] matrix1 = null;
        int[][] matrix2 = null;
        int[][] result = MatrixProperties.isUpTriangle(matrix1, matrix2);
    }*/
    
    @Test
    public void testIsSymetric() {
        System.out.println("isSymetric");
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        boolean expResult = false;
        boolean result = MatrixProperties.isSymetric(matrix);
                      assertEquals(expResult, result);
    }
    
    @Test
    public void testIsSymetric2() {
        System.out.println("isSymetric");
        int[][] matrix = {{1,2,3},{2,4,5},{3,5,8}};
        boolean expResult = true;
        boolean result = MatrixProperties.isSymetric(matrix);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsUpTriangle() {
        System.out.println("isUpTriangle");
        int[][] matrix = {{1,2,3},{0,5,6},{0,0,0}};
        boolean expResult = true;
        boolean result = MatrixProperties.isUpTriangle(matrix);
        assertEquals(expResult, result);
    }
    
}
