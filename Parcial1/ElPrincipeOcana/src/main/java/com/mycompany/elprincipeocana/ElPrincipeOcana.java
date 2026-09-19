/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.elprincipeocana;
import java.time.LocalDateTime;

/**
 *
 * @author usuario
 */
public class ElPrincipeOcana {

    public static void main(String[] args) {
        //String name, String lastName, String document, String numberPhone, LocalDateTime entryDate,boolean[][] assignedDayRoom
        HotelOperations x = new HotelOperations();
        LocalDateTime z = LocalDateTime.now();
        boolean[][] matriz = new boolean[10][7];
        matriz[0][0] = true;
        matriz[2][1] = true;
        Guest y = new Guest("juan","jaime","13","456",z,matriz);
        x.registeredGuest(y);
        
        
        String[] g = x.consult();
        for(String u : g){
            System.out.println(u);
        }
    }
}
