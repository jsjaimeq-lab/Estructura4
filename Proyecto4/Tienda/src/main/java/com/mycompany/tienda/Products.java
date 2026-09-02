/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tienda;

/**
 *
 * @author juan
 */
public class Products {
    
    private String barCode;
    private String name;
    private String description;
    private double price;
    
    public Products(String barCode,String name,String description,String price){
       this.setBarCode(barCode);
       this.setName(name);
       this.setDescription(description);
       this.setPrice(price);
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(String price) {
        try{
            this.price = Integer.parseInt(price);
        }catch(NumberFormatException e){
            this.price = 0;
        }
    }
    
    
}
