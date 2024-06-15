/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.tul.fm.alg1_week05;

/**
 *
 * @author marts
 */
public final class DateTimeTools {
    private DateTimeTools(){
    }
    public static double timeToSeconds(int h,int m,int s){
        int sec=h*3600+m*60+s;
        return sec;
    }
    
    
    
    
    public static int daysInMonth(int rok,int mes){
        int out;
        boolean jePrestupny = (rok % 4 == 0 && rok%100!=0) || rok % 400 == 0;
        boolean jeUnor = mes==2;
        boolean ma30Dni = mes==3||mes==4||mes==6||mes==9||mes==11;
        if(ma30Dni){
            out=30;
        }
        else{
            out=31;
        }
        if(jeUnor){
            out=28;
        }
        
        if (jePrestupny) {
            if(jeUnor){
            out=29;
            //unor
            }
        }

        return out;
        
    }
}
