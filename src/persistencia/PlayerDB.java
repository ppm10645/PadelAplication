/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import modelo.Player;

/**
 *
 * @author joao.pedro.pereira
 */
public class PlayerDB {
    
    /**
     * Busca os xogadores almacenados en PadelManagerDB
     * @param id
     * @param password 
     * @return  
     */
    public static Player findByIdAndPassword(String id, String password) {
        
        Player player = PadelManagerDB.getPlayers().get(id);
        
        if(player != null && player.getPassword().equals(password)) {
            return player;
        }
        return null;
    }
    
}
