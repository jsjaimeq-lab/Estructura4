/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tienda;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author juan
 */
public class Answers {
    
    public void answer1(){
        Answer1 answer = new Answer1();
        DefaultTableModel modelTable = (DefaultTableModel) answer.SalesWeek.getModel();
        int numberRow = MenuOption.product.length;
        
        modelTable.setRowCount(numberRow);
        double value;
        for(int i = 0; i < numberRow; i++){
            modelTable.setValueAt(MenuOption.product[i].getName(), i, 0);
            for(int j = 1; j < 8; j++){
                try{
                     value = Double.parseDouble(MenuOption.salesWeek[i][j-1])*MenuOption.product[i].getPrice();
                }catch(ArrayIndexOutOfBoundsException | NumberFormatException e){
                    value = 0;
                }
                modelTable.setValueAt(value, i, j);
                
            }
        }
        
        answer.setVisible(true);
    }
    
    public void answer2(){
        
        String answer = "";
        double suma = 0;
        for(int i = 0; i < MenuOption.product.length; i++){
            answer = answer+MenuOption.product[i].getName();
            for(int j = 1; j < 8; j++){
                try{
                     suma = suma +(Double.parseDouble(MenuOption.salesWeek[i][j-1])*MenuOption.product[i].getPrice());
                }catch(NumberFormatException | ArrayIndexOutOfBoundsException e){
                    suma = suma + 0;
                }
            }
            answer = answer+": "+suma+"\n";
        }
        JOptionPane.showMessageDialog(null,answer);
        
    }
    
    public void answer3(){
        String answer = "";
        int val = 1;
        double sale ;
        
        while(val < 8){
            int indexProduct = 0;
            int indexDay = 0;
            double maximo = Integer.MIN_VALUE;
            for(int i = 0; i < MenuOption.product.length; i++){
                for(int j = val; j < (val+1); j++){
                    try{
                        sale = (Double.parseDouble(MenuOption.salesWeek[i][j-1])*MenuOption.product[i].getPrice());
                    }catch(ArrayIndexOutOfBoundsException | NumberFormatException e){
                        sale = 0;
                    }
                    if(sale > maximo){
                        maximo = sale;
                        indexProduct = i;
                        indexDay = j;
                    }
                }
            }
            if(maximo == 0){
                indexDay = 7;
            }
            val++;
            switch(indexDay){
                case 0 -> answer = answer+"Monday: "+MenuOption.product[indexProduct].getName()+"\n";
                case 1 -> answer = answer+"Tuesday: "+MenuOption.product[indexProduct].getName()+"\n";
                case 2 -> answer = answer+"Wendnesday: "+MenuOption.product[indexProduct].getName()+"\n";
                case 3 -> answer = answer+"Thursday: "+MenuOption.product[indexProduct].getName()+"\n";
                case 4 -> answer = answer+"Friday: "+MenuOption.product[indexProduct].getName()+"\n";
                case 5 -> answer = answer+"Saturday: "+MenuOption.product[indexProduct].getName()+"\n";
                case 6 -> answer = answer+"Sunday: "+MenuOption.product[indexProduct].getName()+"\n";
                default -> answer = answer+"";
            }
        }
        
        JOptionPane.showMessageDialog(null,answer);
    }
    
    public void answer4(){
        
        double sumaTotal = 0;
        double promedio = 0;
        for(int i = 0; i < MenuOption.salesWeek.length; i++){
            for(int j = 0; j < 7 ; j++){
                try{
                    sumaTotal = sumaTotal+ (Double.parseDouble(MenuOption.salesWeek[i][j])*MenuOption.product[i].getPrice());
                }catch(ArrayIndexOutOfBoundsException | NumberFormatException e){
                    sumaTotal = sumaTotal +0;
                }
            }
        }
        promedio = sumaTotal/7;
        JOptionPane.showMessageDialog(null, " total average for the week: "+String.format("%.2f", promedio));
        
    }
    
    public void answer5(){
        
        String[] days = new String[MenuOption.product.length];
        int[] indexDay = new int[7];
        double valor ;
        for(int i = 0; i < MenuOption.salesWeek.length; i++){
            int x = 0;
            int indexCantidad = 0;
            String text = "";
            for(int j = 0; j < 7; j++){
                try{
                    valor = (Double.parseDouble(MenuOption.salesWeek[i][j])*MenuOption.product[i].getPrice()); 
                }catch(NumberFormatException | ArrayIndexOutOfBoundsException e){
                    valor = 0;
                }
                
                if(valor == 0 ){
                    indexDay[x] = j;
                    indexCantidad++;
                    x++;
                }
            }
            
            for(int y = 0; y < indexCantidad; y++){
               switch(indexDay[y]){
                    case 0 -> text = text+"Monday"+",";
                    case 1 -> text = text+"Tuesday"+",";
                    case 2 -> text = text+"Wendnesday"+",";
                    case 3 -> text = text+"Thursday"+",";
                    case 4 -> text = text+"Friday"+",";
                    case 5 -> text = text+"Saturday"+",";
                    case 6 -> text = text+"Sunday"+",";
                }
          
            }
            days[i] =text;
            
        }
        String answer = "";
        for(int h = 0; h < days.length; h++){
            answer = answer+MenuOption.product[h].getName()+" : "+days[h]+"\n";
        }
        JOptionPane.showMessageDialog(null,answer);
        
    }
    
    
}
