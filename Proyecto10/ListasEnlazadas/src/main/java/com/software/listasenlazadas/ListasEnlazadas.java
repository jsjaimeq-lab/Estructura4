/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.software.listasenlazadas;

import javax.swing.JOptionPane;

/**
 *
 * @author juan
 */
public class ListasEnlazadas {

    Nodo cabeza = null;
    
    
    public void addFirts(int age,String name){
    
        Nodo nuevo = new Nodo(age,name);
        
        if(cabeza == null){
            cabeza = nuevo;
            return;
        }
        
        nuevo.setAfter(cabeza);
        cabeza = nuevo;
        
        
    }
    
    public void addLast(int age,String name){
        
        
        Nodo nuevo = new Nodo(age,name);
        
        Nodo temporal = cabeza;
        if(cabeza == null){
            cabeza = nuevo;
            return;
        }
        while(temporal.getAfter() != null){
            temporal = temporal.getAfter();
        }
        temporal.setAfter(nuevo);
       
        
    }
    
    public void addAfter(int index,int age,String name){
        
        Nodo nuevo = new Nodo(age,name);
        if(cabeza == null){
            cabeza = nuevo;
            return;
        }
        
        Nodo temporal = cabeza;
        int bus = 0;
        while(temporal != null){
            if(bus == index){
                nuevo.setAfter(temporal.getAfter());
                temporal.setAfter(nuevo);
                return;
            }
            bus++;
            temporal = temporal.getAfter();
        }
        
    }
    
    public void addBefore(int index,int age,String name){
        
        Nodo nuevo = new Nodo(age,name);
        if(cabeza == null){
            cabeza = nuevo;
            return;
        }
        
        if(index == 0){
            addFirts(age,name);
            return;
        }
        addAfter((index-1),age,name);
        
    }
    
    public void imprimir(){
        Nodo temporal = cabeza;
        if(temporal == null){
            JOptionPane.showMessageDialog(null,"vacia");
            
        }else{
            while(temporal != null){
                JOptionPane.showMessageDialog(null, temporal.getName());
                temporal = temporal.getAfter();
            }
            
        }
    }
   
}



