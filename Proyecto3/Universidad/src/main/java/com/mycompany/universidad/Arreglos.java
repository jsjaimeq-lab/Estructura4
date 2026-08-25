/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universidad;

import javax.swing.JOptionPane;


/**
 *
 * @author juan
 */
public class Arreglos {
   
    private static final int NUMBERDAYWEEK = 6; 
    public static Buses[] arregloBus ;
    public static int[][] arregloDayWeekPeople;
    public static int i ;
    
    public static void createArregloWeek(int f){
        arregloBus = new Buses[f];
        arregloDayWeekPeople = new int[f][NUMBERDAYWEEK];
        i = 0;
    }
    
    public static int[] totalStudentsDay(){
        int[] dayTotal = new int[6]; 
        int x = 0; 
        while(x < 6){
            for(int i = 0; i < Arreglos.arregloDayWeekPeople.length; i++){
                dayTotal[x] = Arreglos.arregloDayWeekPeople[i][x];
            }
            x++;
        }
        return dayTotal;    
    }
}
