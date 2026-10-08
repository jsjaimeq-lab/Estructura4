/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.software.listasenlazadas;

/**
 *
 * @author juan
 */
public class Nodo {
   
    private int age;
    private String name;
    private Nodo after;
    
    public Nodo(int edad,String name){
        this.age = edad;
        this.name = name;
        this.after = null;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Nodo getAfter() {
        return after;
    }

    public void setAfter(Nodo after) {
        this.after = after;
    }
    
    
}
