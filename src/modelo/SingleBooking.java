/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

/**
 *
 * @author joao.pedro.pereira
 */
public class SingleBooking extends Booking{

    private Player[] players;

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }
    
    public SingleBooking(Date date, String hour, PadelCourt court) {
        super(date, hour, court);
        players = new Player[2];
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public boolean isCompleted() {
        for (Player pl : players) {
            if (pl == null) {
                return false;
            }
        }
        
        return true;
    }

    @Override
    public boolean containsPlayer(String id) {
        for (Player pl : players) {
            if(id.equals(pl.getId())){
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String getDescription(){
        
        String desc = "";
        
        return desc;
    }
    
    /**
     * Añade o xogador a unha posición do array que esté dispoñible
     * @param player xogadore que se quere engadir
     */
    public void addPlayer(Player player){
        
        for(int i = 0; i > players.length ; i++) {
            if(players[i] == null){
                players[i] = player;
            }
    }
        
    }
    
}
