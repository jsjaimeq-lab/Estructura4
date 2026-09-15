/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.verificarvelocidadalecturaarraylist;

import java.util.ArrayList;

/**
 *
 * @author juan
 */
public class VerificarVelocidadaLecturaArrayList {

    public static void main(String[] args) {
       
        String name = "user";
        
        ArrayList<String> names = new ArrayList<String>();
        
        for(int x = 1; x <= 30000000; x++){
            String v = name+x;
            names.add(v);
        }
    }
}
