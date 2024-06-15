/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semestralniprace;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Program na zadávání čísel a následnému seřazení do vzestupné posloupnosti
 * @author Lukáš Jeníček (M14000032)
 */
public class Main {

    //Vykonávací metoda main
    public static void main(String[] args) 
    {
        List<Integer> list;
        Scanner sc = new Scanner(System.in);
        String decision;
        int count, number;
        do
        {
            list = new ArrayList<Integer>();
            decision = "";
            System.out.print("Zadej pocet vstupnich prvku: ");
            count = sc.nextInt();
            for (int i = 0; i < count; i++)
            {
                System.out.print("Zadej prvek cislo " + (i+1) + ": ");
                list.add(sc.nextInt());
            }
            Collections.sort(list);
            System.out.print("\nVysledna posloupnost: ");
            for (int i = 0; i < list.size(); i++)
                System.out.print(list.get(i) + " ");
            do
            {
                System.out.println("\nZadej dalsi hodnoty (zaporna hodnota danou ulohu ukonci)\n");
                while ((number = sc.nextInt()) >= 0)    //Pokud uživatel zadá číslo menší než 0, úloha zadávání čísel skončí
                {
                    if(isIn(number, list))
                        list.add(number);
                }
                
                Collections.sort(list);
                System.out.print("Finalni posloupnost vypada takto: ");
                for (int i = 0; i < list.size(); i++)
                    System.out.print(list.get(i) + " ");
                
                System.out.println("\nZacit novou ulohu? (a/n)\n");
                decision = sc.next();
            }
            while(!(decision.equals("a") || decision.equals("A") || decision.equals("n") || decision.equals("N")));
            //Pokud uživatel zadá jiný znak, než je obsažený v podmínce, bude opět vyzván k zadání znaku
        }
        while (isEnd(decision));
    }
    
    /**
     * Metoda, která určuje, zda program skončí nebo se bude opakovat (a/n)
     * @param s Textový řetězec zadaný uživatelem
     * @return Na základě hodnoty parametru metodu vrací true (program se bude opakovat) nebo false (program skončí)
     */
    public static boolean isEnd(String s)
    {        
        if (s.equals("a") || s.equals("A"))
            return true;
        else
            return false;        
    }
    
     /**
     * Metoda, která ověřuje, jestli uživatelem zadané číslo již není v listu obsaženo
     * @param number Číslo zadané uživatelem
     * @param list List čísel předávaný do metody
     * @return Vrací true (číslo není v listo obsaženo) nebo false (číslo se v listu již nachází)
     */
    public static boolean isIn(int number, List<Integer> list)
    {
        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i) == number)
            {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Metoda vyhodnotí, jestli se zadané číslo nachází v poli. 
     * Pokud ano, navrátí jeho index. Pokud se číslo v poli nenechází, vrací výjimku
     * @param a Vzestupně setřídně pole čísel
     * @param lowest Nejnižší index, od kterého začne vyhledávání
     * @param highest Nejvyšší index pole
     * @param number Hledané číslo
     * @return Index, na které se nachází hledané číslo
     */
    public static int binarySearch(int[] a, int lowest, int highest, int number)
    {
        if (lowest == highest && a[lowest] != number)
            throw new IllegalArgumentException("Nelze nalézt vhodné umístění (špatné vstupní hodnoty)");
        
        int middle = (highest - lowest) / 2 + lowest; 
        
        if (a[middle] == number)
            return middle;
        else if (a[middle] < number)
            return binarySearch(a, middle + 1, highest, number);
        else if (a[middle] > number)
            return binarySearch(a, lowest, Math.max(lowest, middle - 1), number);   
        else 
            throw new IllegalArgumentException("Zadané číslo se v poli nenachází");
    }
    /**
     * Metoda, která vrací index nejmenšího čísla v poli
     * @param a Zadané pole
     * @return Index s nejnižší hodnotou v poli
     */
    public static int firstMinIndex(int[] a)
    {
        int min = a[0];
        int index = 0;
        for (int i = 1; i < a.length; i++)
        {
            if (min > a[i])
            {
                min = a[i];
                index = i;
            }           
        }
        return index;
    }
    /**
     * Metoda, která seřadí dané pole
     * @param a Vstupní pole
     * @return Vzestupně seřazené pole
     */
    public static int[] sort(int[] a)
    {
        int[] myArray = new int[a.length];
        for (int j = 0; j < a.length; j++)
            myArray[j] = a[j];
        
        int[] sortedArray = new int[myArray.length];
        for (int i = 0; i < myArray.length; i++)
        {
            sortedArray[i] = myArray[firstMinIndex(myArray)];
            myArray[firstMinIndex(myArray)] = Integer.MAX_VALUE;
        }
        return sortedArray;
    }
    
}