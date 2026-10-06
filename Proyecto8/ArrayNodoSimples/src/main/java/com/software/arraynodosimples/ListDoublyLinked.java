/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.software.arraynodosimples;

import java.util.ArrayList;

/**
 *
 * @author juan
 */
public class ListDoublyLinked {
    
    private Nodo cabeza;
    private Nodo cola;
    
    public boolean isEmpty(){
        return cabeza == null;
    }
    
    public void addFirts(String valor){
        Nodo nuevo = new Nodo(valor);
        if(isEmpty()){
            cabeza = nuevo;
            cola = nuevo;
        }else{
            cabeza.before = nuevo;
            nuevo.after = cabeza;
            cabeza = nuevo;
        }
    }
    
    public void addlast(String valor){
        Nodo nuevo = new Nodo(valor);
        if(isEmpty()){
            cabeza = nuevo;
            cola = nuevo;
        }else{
            cola.after = nuevo;
            nuevo.before = cola;
            cola = nuevo;
        }
    }
    
    public void addAfter(int index,String valor){
        
        if(isEmpty()){
            Nodo nuevo = new Nodo(valor);
            cabeza = nuevo;
            cola = nuevo;
        }else{
            
            Nodo actual = cabeza;
            int counter = 0;
            
            while(actual != null){
                if(counter == index){
                    
                    Nodo nuevo = new Nodo(valor);
                    
                    nuevo.after = actual.after;
                    nuevo.before = actual;
                    
                    if(actual.after == null){
                        cola = nuevo;
                    }else{
                        actual.after.before = nuevo;
                    }
                    
                    actual.after = nuevo;
                    return;
                    
                }
                counter++;
                actual = actual.after;
            }
            
        }
        
    }
    
    public void addBefore(int index,String valor){
        
        if(isEmpty()){
            Nodo nuevo = new Nodo(valor);
            cabeza = nuevo;
            cola = nuevo;
        }else{
            
            Nodo actual = cabeza;
            int counter = 0;
            
            while(actual != null){
                if(counter == index){
                    
                    Nodo nuevo = new Nodo(valor);
                    
                    nuevo.after = actual;
                    nuevo.before = actual.before;
                    
                    if(index == 0){
                        cabeza = nuevo;
                    }else{
                        actual.before.after = nuevo;
                    }
                    
                    actual.before = nuevo;
                    return;
                    
                }
                counter = counter + 1;
                actual = actual.after;
            }
        }
    }
    
    public ArrayList<String> getList(){
        Nodo actual = cabeza;
        ArrayList<String> names = new ArrayList<String>();
        
        while(actual != null){
            
            names.add(actual.valor);
            actual = actual.after;
        }
        return names;
        
    }
    
    
}
