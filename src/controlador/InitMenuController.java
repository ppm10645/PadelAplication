/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.PadelCourt;
import modelo.Player;
import persistencia.PadelManagerDB;
import persistencia.PlayerDB;
import vista.InitMenuView;

/**
 *
 * @author joao.pedro.pereira
 */
public class InitMenuController {

    private InitMenuView view;
    private SessionController sessionController;


    public InitMenuController() {
        this.view = new InitMenuView();
        sessionController = sessionController;
    }

    /**
     * Inicio da aplicación
     */
    public void initApp() {
        while (!view.showLoginMenu()) {
            view.showLoginMenu();
        }
    }

    /**
     * Fai login a un xogador
     *
     * @param id
     * @param password
     */
    public void login(String id, String password) {
        Player player = PlayerDB.findByIdAndPassword(id, password);

        if (player == null) {
            view.showInvalidUser();
        } else {
            sessionController.loadSession();
        }
    }

    public static void main(String[] args) {
        // Creamos os datos de partida
        Player player1 = new Player("luisf", "abc", "Luis Fdez", 2.5, 25.90);
        Player player2 = new Player("maria", "abc", "Maria Insua", 2.83, 70);
        PadelCourt court1 = new PadelCourt(1, PadelCourt.DOUBLE, new String[]{"9:00", "11:00", "13:00", "16:00"});
        PadelCourt court2 = new PadelCourt(2, PadelCourt.SINGLE, new String[]{"9:00", "11:00", "13:00", "16:00"});
        PadelCourt court3 = new PadelCourt(3, PadelCourt.DOUBLE, new String[]{"9:00", "11:00"});
        // Engadimos os datos á base de datos
        PadelManagerDB.getPlayers().put(player1.getId(), player1);
        PadelManagerDB.getPlayers().put(player2.getId(), player2);
        PadelManagerDB.getCourts().add(court1);
        PadelManagerDB.getCourts().add(court2);
        PadelManagerDB.getCourts().add(court3);
        // Creamos un obxecto InitMenuController para iniciar a aplicacion
        InitMenuController imc = new InitMenuController();
        imc.initApp();
    }

}
