/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.util.ArrayList;
import modelo.PadelCourt;

/**
 *
 * @author joao.pedro.pereira
 */
public class PadelCourtDB {
    
    /**
     * Devolve a lista de todas as pistas da DB
     * @return 
     */
    public static ArrayList<PadelCourt> getAllCourts(){
        
        return PadelManagerDB.getCourts();
       
    }
}
