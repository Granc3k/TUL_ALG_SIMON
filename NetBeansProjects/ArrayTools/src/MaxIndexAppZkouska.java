/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marts
 */
public class MaxIndexAppZkouska {
    public static int firstIndexEnteredValue(int value,int[] a){
        int firstIndexOfEnteredValue = 0;
        
        for (int i=0; i<a.length ;i++){
            if (a[i]==value){
                firstIndexOfEnteredValue=i;
                break;
            }
        }
        return firstIndexOfEnteredValue;
    
    
    }
    
    public static boolean isAscending(int a[]){
        boolean isAscending=false;
        for (int i =0; i<a.length-2;i++){
            if (a[i]<a[i+1]){
                isAscending=true;
            }
            else{
                isAscending=false;
                    break;
                    
            }
        return isAscending;
        }
        
        
    }
}
