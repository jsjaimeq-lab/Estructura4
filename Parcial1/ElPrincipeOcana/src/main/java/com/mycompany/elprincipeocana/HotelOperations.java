
package com.mycompany.elprincipeocana;


import java.util.LinkedList;
import java.util.ArrayList;


public class HotelOperations {
    
    // Lista de tipo Guest
    public static LinkedList<Guest> guests = new LinkedList<>();
    
    // Matriz para las habitaciones, 10 habitaciones en todo los 7 dias de la semana
    public static boolean[][] rooms = new boolean[10][7];
    
    //Metodo para registrar cada huesped nuevo
    public void registeredGuest(Guest guest){
        guests.add(guest);
        boolean[][] assignedDayRoomRead = guest.getAssignedDayRoom();

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 7; j++){
                if(HotelOperations.rooms[i][j] == false && assignedDayRoomRead[i][j] == true){
                    HotelOperations.rooms[i][j] = true;
                }
            }
        }
        

    }
    
    public String[] consult(){
        
        ArrayList<Guest> arrayGuest = new ArrayList<>(HotelOperations.guests);
        String[] roomsGuests = new String[10]; 
        
        for(Guest guest:arrayGuest){
            boolean[][] rooms = guest.getAssignedDayRoom();
            for(int i = 0; i < 10; i++){
                for(int j = 0; j < 7; j++){
                    if(rooms[i][j]){
                        roomsGuests[i] = guest.getName()+" "+guest.getLastName();
                        break;
                    }
                }
            }
        }
        return roomsGuests;
    }
    
    public void modify(){
        
    }
    
}
