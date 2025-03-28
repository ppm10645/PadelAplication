/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import modelo.Booking;
import modelo.PadelCourt;
import controlador.SessionController;

/**
 *
 * @author joao.pedro.pereira
 */
public class SessionView {
    
    private SessionController controller;
    private Scanner scanner;

    public SessionView(SessionController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }
    
    
    
    
    public void showSessionMenu(ArrayList<Booking> booking){
        
        System.out.println("Benbido a la aplicación de reserva de pistas de padel " + controller.getSessionPlayer().getName());
        System.out.println("Saldo actual: " + controller.getSessionPlayer().getBalance());
        System.out.println("Reservas recibidas: " );
    }
    
    public void selectCourtAndHour(Date date, ArrayList<PadelCourt> courts, ArrayList<Booking> booking){      
        
    }
}
