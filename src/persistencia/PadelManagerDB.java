/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.util.ArrayList;
import java.util.HashMap;
import modelo.Booking;
import modelo.PadelCourt;
import modelo.Player;

/**
 *
 * @author joao.pedro.pereira
 */
public class PadelManagerDB {
    
    private static HashMap<String, Player> players = new HashMap<>();
    private static ArrayList<PadelCourt> courts = new ArrayList<>();
    private static ArrayList<Booking> bookings = new ArrayList<>();

    public static HashMap<String, Player> getPlayers() {
        return players;
    }

    public static ArrayList<PadelCourt> getCourts() {
        return courts;
    }

    public static ArrayList<Booking> getBookings() {
        return bookings;
    }
    
}
