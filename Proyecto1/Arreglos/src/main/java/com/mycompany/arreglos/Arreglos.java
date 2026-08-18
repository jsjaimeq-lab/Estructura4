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
                resultado = resultado +"\n"+(x+1)+" vacio ";
            }
        }
        
        JOptionPane.showMessageDialog(null, resultado);
        
        
    }
    
    public void updateArray(int index,String name){
        
        names[index-1] = name;
    }
    
    public void deleteArray(int index){
        names[index-1] = "";
    }
    
    public boolean verifyIndex(String index){
        int indexEntero = Integer.parseInt(index);
        int n = names.length;
        
        if(indexEntero > n){
            JOptionPane.showMessageDialog(null, " index fuera de rango,vuelve a intentarlo");
            return false;
        }else{
            return true;
        }
    }
}
