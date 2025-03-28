/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import modelo.Booking;
import modelo.PadelCourt;
import modelo.Player;
import persistencia.BookingDB;
import persistencia.PadelManagerDB;
import vista.SessionView;

/**
 *
 * @author joao.pedro.pereira
 */
class SessionController {
    
    private SessionView view;
    private Player sessionPlayer; //Almacena o xogador que iniciou sesión

    public SessionController(Player sessionPlayer) {
        this.view = new SessionView();
        this.sessionPlayer = sessionPlayer;
    }
    
    /**
     * Obten as reservas do xogador
     */
    public void loadSession(){ 
        
    }
    
    /**
     * Permite crear unha nova reserva
     * @param data 
     */
    public void createBooking(Date date){
        
    }
    
    /**
     * Engade o xogador a reserva e a garda
     * @param date
     * @param hour
     * @param court 
     */
    public void completeBooking(Date date, String hour, PadelCourt court){
        
    }
    
    /**
     * Engade o xogador da sesión a unha reserva
     */
    public void addPlayerToBooking(){
        loadSession();
    }
    
    
}
