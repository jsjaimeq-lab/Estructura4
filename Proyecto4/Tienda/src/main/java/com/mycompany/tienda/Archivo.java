/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tienda;

import java.io.File;
import java.io.IOException;
/**
 *
 * @author juan
 */
public class Archivo {
    
    
    public void createFileSale(String nameFile,String extension){
        
        String  URL = "java.csv";
        File archivo = new File(URL);
        if(!(archivo.exists())){
            try{
                 archivo.createNewFile();
            }catch(IOException error){
                System.out.println(" el archivo por crear no fue posible "+error);
            }
        }
    }
    
    
    public void readFileSale(){
        
    }
}
