package semestralniprace;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    
    public MainTest() {
    }
/*
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Main.main(args);
    }*/
    
    @Test
    public void testIsEnd1() {
        System.out.println("isEnd");
        String s = " ";
        boolean expResult = false;
        boolean result = Main.isEnd(s);
        assertEquals(expResult, result);
    }
    @Test
    public void testIsEnd2() {
        System.out.println("isEnd");
        String s = "a";
        boolean expResult = true;
        boolean result = Main.isEnd(s);
        assertEquals(expResult, result);
    }
    @Test
    public void testIsEnd3() {
        System.out.println("isEnd");
        String s = "A";
        boolean expResult = true;
        boolean result = Main.isEnd(s);
        assertEquals(expResult, result);
    }
    @Test
    public void testSort1() {
        System.out.println("sort");
        int[] a = {4,3,2,1,0};
        int[] expResult = {0,1,2,3,4};
        int[] result = Main.sort(a);
        assertArrayEquals(expResult, result);
    }
    @Test
    public void testSort2() {
        System.out.println("sort");
        int[] a = {0,1,2,3,4};
        int[] expResult = {0,1,2,3,4};
        int[] result = Main.sort(a);
        assertArrayEquals(expResult, result);
    }
    @Test
    public void testSort3() {
        System.out.println("sort");
        int[] a = {1005,3,45,2,-254};
        int[] expResult = {-254,2,3,45,1005};
        int[] result = Main.sort(a);
        assertArrayEquals(expResult, result);
    }
    @Test
    public void testFirstMinIndex1() {
        System.out.println("firstMinIndex");
        int[] a = {1005,3,-4191,45,2,254};;
        int expResult = 2;
        int result = Main.firstMinIndex(a);
        assertEquals(expResult, result);
    }
    @Test
    public void testFirstMinIndex2() {
        System.out.println("firstMinIndex");
        int[] a = {0,1,2,3,4};
        int expResult = 0;
        int result = Main.firstMinIndex(a);
        assertEquals(expResult, result);
    }
    @Test
    public void testFirstMinIndex3() {
        System.out.println("firstMinIndex");
        int[] a = {4,3,2,1,0};
        int expResult = 4;
        int result = Main.firstMinIndex(a);
        assertEquals(expResult, result);
    }
    @Test
    public void testIsIn1() {
        System.out.println("isIn");
        int number = 0;
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        boolean expResult = true;
        boolean result = Main.isIn(number, list);
        assertEquals(expResult, result);
    }
    @Test
    public void testIsIn2() {
        System.out.println("isIn");
        int number = -5;
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        boolean expResult = true;
        boolean result = Main.isIn(number, list);
        assertEquals(expResult, result);
    }
    @Test
    public void testIsIn3() {
        System.out.println("isIn");
        int number = 2;
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        boolean expResult = false;
        boolean result = Main.isIn(number, list);
        assertEquals(expResult, result);
    }
    @Test
    public void testBinarySearch1() {
        System.out.println("binarySearch");
        int[] a = {-89, -74, -1, 0, 1, 15, 96, 489};
        int lowest = 0;
        int highest = a.length;
        int number = 0;
        int expResult = 3;
        int result = Main.binarySearch(a, lowest, highest, number);
        assertEquals(expResult, result);
    }
    @Test
    public void testBinarySearch2() {
        System.out.println("binarySearch");
        int[] a = {-89, -74, -1, 0, 1, 15, 96, 489};
        int lowest = 0;
        int highest = a.length;
        int number = -89;
        int expResult = 0;
        int result = Main.binarySearch(a, lowest, highest, number);
        assertEquals(expResult, result);
    }
    //Ocekavany vystup je vyjimka - OK
    /*@Test
    public void testBinarySearch3() {
        System.out.println("binarySearch");
        int[] a = {-89, -74, -1, 0, 1, 15, 96, 489};
        int lowest = 0;
        int highest = a.length;
        int number = 5;
        int expResult = 0;
        int result = Main.binarySearch(a, lowest, highest, number);
        assertEquals(expResult, result);
    }*/
    //Ocekavany vystup je vyjimka
    /*@Test
    public void testBinarySearch4() {
        System.out.println("binarySearch");
        int[] a = {-89, -74, -1, 0, 1, 15, 96, 489};
        int lowest = 7;
        int highest = a.length;
        int number = 5;
        int expResult = 0;
        int result = Main.binarySearch(a, lowest, highest, number);
        assertEquals(expResult, result);
    }*/
    //Ocekavany vystup je vyjimka
    @Test
    public void testBinarySearch5() {
        System.out.println("binarySearch");
        int[] a = {-89, -74, -1, 0, 1, 15, 96, 489};
        int lowest = 12;
        int highest = 0;
        int number = 5;
        int expResult = 0;
        int result = Main.binarySearch(a, lowest, highest, number);
        assertEquals(expResult, result);
    }
    @Test
    public void testBinarySearch6() {
        System.out.println("binarySearch");
        int[] a = {255, -575, 2, -40, 20};
        int lowest = 0;
        int highest = a.length;
        int number = 255;
        int expResult = 0;
        int result = Main.binarySearch(a, lowest, highest, number);
        assertEquals(expResult, result);
    }
}