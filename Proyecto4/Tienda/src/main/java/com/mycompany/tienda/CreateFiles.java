/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tienda;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.nio.file.Files;
/**
 *
 * @author juan
 */
public class CreateFiles {
    
    private  String  url;
    
    public String createFileSale(String nameFile,String extension){
        
        url = nameFile+extension;
        File archivo = new File(url);
        if(!(archivo.exists())){
            try{
                 archivo.createNewFile();
            }catch(IOException error){
                System.out.println(" el archivo por crear no fue posible "+error);
            }
        }
        return url;
    }
    
    
    public String[][] readFileSale(){
        
        
        int totalLines = 0;
        final int DAYSWEEK =7;
        
        Path path = Paths.get(MenuOption.urlFileSales);
        try(Stream<String> stream = Files.lines(path)){
            totalLines = (int)(stream.count());
        }catch(IOException e){
            
        }
        
        String[][] salesWeek = new String[totalLines][DAYSWEEK];
        try(BufferedReader fileReader = new BufferedReader(new FileReader(MenuOption.urlFileSales))){
            
            String linea;
            int i = 0;
            while((linea = fileReader.readLine()) != null){
                 
               salesWeek[i] = linea.split(",");
               i++;  
            }
        }catch(IOException error){
            
        }
        return salesWeek;
    }
    
    public Products[] readFileProduct(){
        
        Products product ;
        int totalLines = 0;
        Path path = Paths.get(MenuOption.urlFileProduct);
        try(Stream<String> stream = Files.lines(path)){
            totalLines = (int)(stream.count());
        }catch(IOException e){
            
        }
        
        String[][] line = new String[totalLines][4];
        try(BufferedReader fileReader = new BufferedReader(new FileReader(MenuOption.urlFileProduct))){
            
            String linea;
            int i = 0;
            while((linea = fileReader.readLine()) != null){
                 
               line[i] = linea.split(",");
               i++;  
            }
        }catch(IOException error){
            
        }
        Products[] productsArray = new Products[totalLines];
        int i = 0;
        for(String[] arreglo : line){
            product = new Products(arreglo[0],arreglo[1],arreglo[2],arreglo[3]);
            productsArray[i] = product;
            i++;
        }
        
        return productsArray;
    }
}
