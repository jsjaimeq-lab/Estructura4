/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arregloobjetosarchivos;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author ufpso.edu.co
 */
public class ArregloObjetosArchivos {

   public static void main(String[] args) {
        String ruta = "productos.csv";
        
        // SOLUCIÓN MODERNA: Leemos el archivo una sola vez y convertimos a Lista
        try (Stream<String> lineas = Files.lines(Paths.get(ruta), StandardCharsets.ISO_8859_1)) {   
            
            // 1. Transformamos cada línea directamente en un objeto estructurado
            List<ArregloObjetos> listaTemporal = lineas.skip(1) 
                .map(linea -> linea.split(";")) 
                .map(datos -> {
                    // Creamos un objeto nuevo por cada FILA del CSV
                    ArregloObjetos producto = new ArregloObjetos();
                    
                    // Asignamos cada columna a su respectivo atributo (según la posición)
                    producto.setIva(Double.parseDouble(datos[0]));
                    producto.setCantidad(Double.parseDouble(datos[1]));
                    producto.setSubtotal(Double.parseDouble(datos[2]));
                    producto.setNombre(datos[3].strip());
                    producto.setPrecio(Double.parseDouble(datos[4].strip()));
                    producto.setMarca(datos[5].strip());
                    
                    return producto;
                })
                .toList(); // Guarda todo en una lista automática (Java 16+)
                //iva = 0.19, cantidad, subtotal
            // 2. Si obligatoriamente necesitas un arreglo tradicional de tamaño fijo:
            ArregloObjetos[] objarray = listaTemporal.toArray(new ArregloObjetos[0]);
            
            // --- ¡Listo! Ya tienes tu arreglo lleno y el tamaño capturado ---
            System.out.println("Tamaño del arreglo creado: " + objarray.length);
            
            // Ejemplo para comprobar que funciona leyendo el primer producto:
            for(ArregloObjetos objeto: objarray){
                
                System.out.println(" producto: "+objeto.getNombre()+"\n"+" Marca: "+objeto.getMarca()+"\n"+" precio: "+objeto.getPrecio()+"\n"+" IVA: "+objeto.getIva()+"\n"+" Cantidad: "+objeto.getCantidad()+"\n"+" Subtotal: "+objeto.getSubtotal());
            }
            

        } catch (IOException e) {
            System.err.println("Error al procesar el archivo CSV: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error: El precio no tiene un formato numérico válido: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Error: Una fila del CSV no tiene las 3 columnas necesarias.");
        }
    }
}
