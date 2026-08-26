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
        CreateFiles sales = new CreateFiles();
        sales.createFileSale("sales",".csv");
        String[][] y = sales.readFileSale();
        CreateFiles product = new CreateFiles();
        product.createFileSale("product",".csv");
    }
}
