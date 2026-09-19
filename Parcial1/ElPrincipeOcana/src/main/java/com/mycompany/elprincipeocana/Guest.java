/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.elprincipeocana;

import java.time.LocalDateTime;
public class Guest {
    
    // Datos que debe contener un huespede
   
    private String name;
    private String lastName;
    private String document;
    private String numberPhone;
    private LocalDateTime entryDate;
    private boolean[][] assignedDayRoom = new boolean[10][7];
    // Creamos el constructor
    
    public Guest(){
        
    }

    public Guest(String name, String lastName, String document, String numberPhone, LocalDateTime entryDate,boolean[][] assignedDayRoom) {
        this.setDocument(document);
        this.setName(name);
        this.setLastName(lastName);
        this.setNumberPhone(numberPhone);
        this.setEntryDate(entryDate);
        this.setAssignedDayRoom(assignedDayRoom);
    }
    
    
    // Metodos gets
    public String getDocument() {
        return document;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
    
    public String getNumberPhone(){
        return numberPhone;
    }

    public LocalDateTime getEntryDate() {
        return entryDate;
    }
    
    // Metodos sets
    public void setDocument(String document) {
        this.document = document;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public void setEntryDate(LocalDateTime entryDate) {
        this.entryDate = entryDate;
    }
   
    public void setAssignedDayRoom(boolean[][] assignedDayRoom){
        this.assignedDayRoom = assignedDayRoom;
    }
    
    public boolean[][] getAssignedDayRoom(){
        return this.assignedDayRoom;
    }
    
}

