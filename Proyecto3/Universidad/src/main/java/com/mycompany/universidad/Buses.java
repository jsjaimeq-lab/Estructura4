/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universidad;

/**
 *
 * @author juan
 */
public final class Buses {
    
    private String nameDrive;
    private String placa;
    private String hora;
    private int edad;
    
    public Buses(){} 
    
    public Buses(String nameDrive,String placa,String hora,int edad){
        this.setNameDrive(nameDrive);
        this.setPlaca(placa);
        this.setHora(hora);
        this.setEdad(edad);
    }
    
    public void setNameDrive(String nameDrive){
        this.nameDrive = nameDrive;
    }
    
    public String getNameDrive(){
        return nameDrive ;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
