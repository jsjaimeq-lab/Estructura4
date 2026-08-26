/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tienda;

/**
 *
 * @author juan
 */
public class Tienda {

    public static void main(String[] args) {
        CreateFiles archivo = new CreateFiles();
        archivo.createFileSale("sales",".csv");
        String[][] y = archivo.readFileSale();
    }
}
