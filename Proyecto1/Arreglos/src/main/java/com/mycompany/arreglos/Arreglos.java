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
    
    public void viewArray(){
        
        int n = names.length;
        String resultado = "Contenido Arreglo";  
        
        for(int x = 0; x < n ; x++){
          
            if(!names[x].equals("") ){
                resultado = resultado +"\n"+(x+1)+"   "+ names[x];
            }else{
                resultado = resultado +"\n"+" vacio ";
            }
        }
        
        JOptionPane.showMessageDialog(null, resultado);
        
        
    }
    
    public void updateArray(int indice,String name){
        
        names[indice-1] = name;
    }
    
    public void deleteArray(int indice){
        names[indice-1] = "";
    }
    
    
}
