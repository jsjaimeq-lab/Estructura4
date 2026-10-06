/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.software.arraynodosimples;

/**
 *
 * @author juan
 */
public class Nodo {
    
    String valor;
    Nodo after;
    Nodo before;
    
    public Nodo(String valor){
        this.valor = valor;
        this.after = null;
        this.before = null;
    }
}
