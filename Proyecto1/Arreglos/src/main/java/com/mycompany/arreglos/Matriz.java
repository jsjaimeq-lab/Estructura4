/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arreglos;

import javax.swing.JOptionPane;

/**
 *
 * @author juan
 */
public class Matriz {
    
    int[][] datos ;
    
    public void crearMatriz(int f,int c){
    
        datos = new int[f][c];
        for(int i = 0; i<f; i++){
            for(int j = 0; j < c; j++){
                datos[i][j] = Integer.parseInt(JOptionPane.showInputDialog("diga el valor posicion : "+"Fila: "+i+" Col: "+j));
            }
        }
        JOptionPane.showMessageDialog(null, "Matriz full");
        
        // tarea consultar matriz , eliminar posicion, actualizar 
    }
}
