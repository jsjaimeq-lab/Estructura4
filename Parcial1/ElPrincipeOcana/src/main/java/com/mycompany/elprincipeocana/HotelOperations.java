
package com.mycompany.elprincipeocana;


import java.util.LinkedList;
import javax.swing.JOptionPane;



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
        
        String[] roomsGuests = new String[10]; 
        
        for(Guest guest:HotelOperations.guests){
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
    
    public void modify(int document,String name,String phone){
        
        for(Guest guest : guests){
            if(Integer.parseInt(guest.getDocument().trim())== document){
                guest.setName(name);
                guest.setNumberPhone(phone);
            }else{
                
            }
        }
    }
    
    public void changeRoom(int document,int roomOld,int roomNew,int[] day){
        
        boolean verify = false;
        for(Guest guest: guests){
            if((Integer.parseInt(guest.getDocument().trim())) == document){
                verify = true;
               for(int j: day){
                    if(HotelOperations.rooms[roomNew][day[j]] != true){
                        HotelOperations.rooms[roomNew][day[j]] = true;
                        guest.getAssignedDayRoom()[roomNew][day[j]] = true;
                        for(int x = 0; x < 7; x++){
                            if(HotelOperations.rooms[roomOld][j]){
                                HotelOperations.rooms[roomOld][j] = false;
                                guest.getAssignedDayRoom()[roomOld][j] = true;
                            }
                        }
                    }else{
                        break;
                    }
                }  
            }
           
        }
        if(!verify){
            JOptionPane.showMessageDialog(null, " exit not user ");
        }
        
        
    }
    
    
}
