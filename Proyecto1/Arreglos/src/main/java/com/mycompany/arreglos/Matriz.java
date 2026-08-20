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
    int valorFilaMatriz;
    int valorColumnaMatriz;
    
    public void crearMatriz(String f,String c){
    
        if(verificarInput(f) && verificarInput(c)){
            valorFilaMatriz = Integer.parseInt(f);
            valorColumnaMatriz = Integer.parseInt(c);
            datos = new int[valorFilaMatriz][valorColumnaMatriz];
            for(int i = 0; i<valorFilaMatriz; i++){
                for(int j = 0; j < valorColumnaMatriz; j++){
                    datos[i][j] = Integer.parseInt(JOptionPane.showInputDialog("diga el valor posicion : "+"Fila: "+i+" Col: "+j));
                }
            }
            JOptionPane.showMessageDialog(null, "Matriz full");
        }
        
        
        
        // tarea consultar matriz , eliminar posicion, actualizar 
    }
    
    public boolean verificarInput(String text){
       
        try{
            int en = Integer.parseInt(text);
            return true;
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null," ¡valor incorrecto! ingrese un entero");
            return false;
        }
        
    }
    
   public boolean verificarRangoPosicion(int f, int c){
       
       
       if( !(f <= valorFilaMatriz && c <= valorColumnaMatriz)){
           
           JOptionPane.showMessageDialog(null," valores de fila o columna fuera de rango");
           return false;
       }
       return true;
   }
    
    public void actualizarMatriz(String f, String c, String valor){
        
        boolean respuestaFila = verificarInput(f);
        boolean respuestaColumna = verificarInput(c);
        boolean respuestaValor = verificarInput(valor);
        
        
        if(respuestaFila && respuestaColumna && respuestaValor ){
            int fila = Integer.parseInt(f);
            int colu = Integer.parseInt(c);
            
            if(verificarRangoPosicion(fila,colu)){
               datos[fila][colu] = Integer.parseInt(valor);
            }
           
        }
        
    }
    
    public void consultarMatriz(String info){
        
        if(verificarInput(info)){
            for(int i = 0; i < valorFilaMatriz; i++){
                for(int j = 0; j < valorColumnaMatriz; j++){
                    if(datos[i][j] == Integer.parseInt(info)){
                        String respuesta = " el valor ingresado: "+info+"\n"+" se encuentra en la fila: "+i+" columna: "+j;
                        JOptionPane.showMessageDialog(null, respuesta);
                    }
                }
            }
        }
        
    }
    
    public void eliminarPosicion(String f, String c){
        
        
        if(verificarInput(f) && verificarInput(c)){
            int fila = Integer.parseInt(f);
            int colu = Integer.parseInt(c);
            
            if(verificarRangoPosicion(fila,colu)){
                
                for(int i = 0; i < valorFilaMatriz; i++){

                    for(int j = 0; j < valorColumnaMatriz; j++){
                        if(i == fila && j == colu){
                            datos[i][j] = 0;
                        }
                    }
                    
                }
                
            }
        }
    }
    
}
