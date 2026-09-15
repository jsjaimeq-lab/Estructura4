package com.mycompany.verificarlecturalistanodos;

import java.util.LinkedList;


public class VerificarLecturaListaNodos {

    
    
    //vamos a utilizar linkedlist para utilizar listas enlazadas simples
    public static void main(String[] args) {
        
        LinkedList<String> names = new LinkedList<>();
        
        String name = "user";
        
        for(int x = 1; x < 30000000; x++){
            names.add(name+x);
        }
    }
}
