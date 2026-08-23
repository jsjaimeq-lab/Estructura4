/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universidad;


/**
 *
 * @author juan
 */
public class Arreglos {
   
    Buses bus = new Buses("juan","ctg","7 am",18);
    private final int NUMBERDAYWEEK = 7; 
    public Buses[] arregloBus = new Buses[0];
    public int[][] arregloDayWeek = new int[0][0];
    int i ;
    
    public void createArregloWeek(int f){
        this.arregloBus = new Buses[f];
        this.arregloBus[0] = bus;
        this.arregloDayWeek = new int[f][NUMBERDAYWEEK];
        this.i = 0;
    }
    
    public int longArregloBus(){
        return arregloBus.length;
    }
}
