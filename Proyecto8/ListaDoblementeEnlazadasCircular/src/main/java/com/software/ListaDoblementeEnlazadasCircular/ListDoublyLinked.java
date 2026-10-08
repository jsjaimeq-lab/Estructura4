/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.software.ListaDoblementeEnlazadasCircular;

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
            cabeza.before = cabeza;
            cabeza.after = cabeza;
            return;
        }
        
        nuevo.after = cabeza;
        nuevo.before = cola;
        
        cabeza.before = nuevo;
        cola.after = nuevo;
        cabeza = nuevo;
    }
    
    public void addlast(String valor){
        Nodo nuevo = new Nodo(valor);
        if(isEmpty()){
            cabeza = nuevo;
            cola = nuevo;
            cola.before = cabeza;
            cola.after = cabeza;
        }else{
            
            
            nuevo.after = cabeza;
            nuevo.before = cola;
            
            cola.after = nuevo;
            cabeza.before = nuevo;
            cola = nuevo;
            
        }
    }
    
    public void addAfter(int index,String valor){
        
        if(isEmpty()){
            addFirts(valor);
            
        }else{
            
            Nodo actual = cabeza;
            int counter = 0;
            
            while(actual != null){
                if(counter == index){
                    
                    Nodo nuevo = new Nodo(valor);
                    
                    nuevo.after = actual.after;
                    nuevo.before = actual;
                    actual.after.before = nuevo;
                    actual.after = nuevo;
                    
                    if(cola == actual){
                        cabeza.before = nuevo;
                    }
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
                    actual.before.after = nuevo;
                    actual.before = nuevo;
                    
                    if(cabeza == actual){
                        cola.after = nuevo;
                    }
                    return;
                    
                }
                counter = counter + 1;
                actual = actual.after;
            }
        }
    }
    
    public ArrayList<String> getList(){
        
        ArrayList<String> names = new ArrayList<>();
        int x = 0;
        if(isEmpty()){
            return names;
        }
        Nodo actual = cabeza;
        if(actual.after != null && actual.before != null){
            do{
                x++;
                System.out.println(" en proceso"+x);
                names.add(actual.valor);
                actual = actual.after;
            }while(actual != cabeza);
            return names;
        }
        return names;
        
        
        
    }
    
    public void addBig(String[] names){
        
        for(String name:names){
            addFirts(name);
        }
    }
    
}
