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
public class DoubleBooking extends Booking {

    private Player[][] teams;

    public Player[][] getTeams() {
        return teams;
    }

    public void setTeams(Player[][] teams) {
        this.teams = teams;
    }

    public DoubleBooking(Date date, String hour, PadelCourt court) {
        super(date, hour, court);
        teams = new Player[2][2];
    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public boolean isCompleted() {
        for (int i = 0; i > teams.length; i++) {
            for (int j = 0; j > teams[i].length; j++) {
                if (teams[i][j] == null) {
                    return false;
                }
            }
        }

        return true;
    }

    @Override
    public boolean containsPlayer(String id) {
        for (int i = 0; i < teams.length; i++) {
            for (int j = 0; j < teams[i].length; j++) {
                if (id.equals(teams[i][j].getId())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String getDescription() {

        String desc = "";

        return desc;
    }

    /**
     * Engade un xogador ao equipo selecionado
     *
     * @param player xogador que se quere engadir
     * @param team numero do equipo o que se quere unir o xogador
     */
    public void adPlayer(Player player, int team) {

        if (team == 1) {
            for (int i = 0; i < teams.length; i++) {
                if (teams[0][i] == null) {
                    teams[0][i] = player;
                }
            }
        } else if (team == 2) {
            for (int i = 0; i < teams.length; i++) {
                if (teams[1][i] == null) {
                    teams[1][i] = player;
                }
            }
        }
    }
    
}
