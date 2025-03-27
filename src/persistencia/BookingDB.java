/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.util.ArrayList;
import java.util.Date;
import modelo.Booking;

/**
 *
 * @author joao.pedro.pereira
 */
public class BookingDB {
    
    public static ArrayList<Booking> findByDate(Date date){
        
        ArrayList<Booking> result = new ArrayList<>();
        
        ArrayList<Booking> allBookings = PadelManagerDB.getBookings();
        
        for (Booking myBooking:allBookings) {
            if (myBooking.getDate().compareTo(date) == 0) {
                result.add(myBooking);
            }
        }
        
        return result;
    }
    
    public static ArrayList<Booking> findByUserAndDate(String id, Date date){
        
        ArrayList<Booking> result = new ArrayList<>();
        
        ArrayList<Booking> allBookings = PadelManagerDB.getBookings();
        
        for (Booking myBooking:allBookings) {
            if(myBooking.getDate().compareTo(date) <= 0 && myBooking.containsPlayer(id)) {
                result.add(myBooking);
            }
        }
        
        return result;
    }
    
    public static void save(Booking reserva){
        
        PadelManagerDB.getBookings().add(reserva);
        
    }
    
}
