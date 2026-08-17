/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author juan
 */
public class Arreglos {

    String[] names; 
    
    public void createArray(int valorN){
        int n = valorN;
        names = new String[n];
        for(int i = 0; i < n ; i++){
             names[i] = JOptionPane.showInputDialog(" input names ");
        }
        JOptionPane.showMessageDialog(null, "Array Full ");
    }
}
