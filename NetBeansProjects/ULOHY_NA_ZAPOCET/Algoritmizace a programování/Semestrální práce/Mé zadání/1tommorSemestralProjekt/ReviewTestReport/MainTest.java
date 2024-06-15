/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lukáš
 */
public class MainTest {
    /*
    public MainTest() {
    }
    */
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Main.main(args);
    }

    /**
     * Test of load_sequence method, of class Main.
     */
    @Test
    @SuppressWarnings("empty-statement")
    public void testLoad_sequence() {
        System.out.println("load_sequence");
        int[] sequence = new int[5];
        int[] expResult = {};
        int[] result = Main.load_sequence(sequence);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of find_longest_subsequence method, of class Main.
     */
    @Test
    public void testFind_longest_subsequence1() {
        System.out.println("find_longest_subsequence");
        int[] sequence = {0, 1, 5, 6, 4, 5, 6, 8, 10, -5, -1};
        int[] data_container = new int[2];
        int[] expResult = {5, 5};
        int[] result = Main.find_longest_subsequence(sequence, data_container);
        assertArrayEquals(expResult, result);
    }
    
    /**
     * The second test of find_longest_subsequence method, of class Main.
     */
    @Test
    public void testFind_longest_subsequence2() {
        System.out.println("find_longest_subsequence");
        int[] sequence = {-1, 0, 1, 0, -5, -100, 20};
        int[] data_container = new int[2];
        int[] expResult = {1, 3};
        int[] result = Main.find_longest_subsequence(sequence, data_container);
        assertArrayEquals(expResult, result);
    }
    
}
