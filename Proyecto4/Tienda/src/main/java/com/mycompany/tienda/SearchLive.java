package com.mycompany.tienda;

import javax.swing.JTable;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

public class SearchLive {
    
    // Modificamos el constructor para recibir el componente visual real
    public SearchLive(JTable resultado) {
        
        
        MenuOption.textSearch.getDocument().addDocumentListener(new DocumentListener(){
            @Override
            public void insertUpdate(DocumentEvent e) {
                search(MenuOption.textSearch.getText(),resultado);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                search(MenuOption.textSearch.getText(),resultado);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {}
        });
    }
    
    public void search(String text,JTable resultado) {
        
        DefaultTableModel modelTable = (DefaultTableModel) resultado.getModel();
        
        modelTable.setRowCount(0);
        if(text.trim().isEmpty()){
            return;
        }
        
       
        String textoBuscado = text.toLowerCase();
        int x = 0;
        for(Products producto : MenuOption.product){
            modelTable.setRowCount(MenuOption.product.length);
            if(producto.getName().toLowerCase().contains(textoBuscado)){
                modelTable.setRowCount(new Object[]{"yolo",45,2,6});
                x++;
            }
             
        }
    }
}
