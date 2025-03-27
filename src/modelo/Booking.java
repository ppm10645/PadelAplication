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
public abstract class Booking {

    protected Date date;
    protected String hour;
    protected PadelCourt court;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public PadelCourt getCourt() {
        return court;
    }

    public void setCourt(PadelCourt court) {
        this.court = court;
    }

    public Booking(Date date, String hour, PadelCourt court) {
        this.date = date;
        this.hour = hour;
        this.court = court;
    }

    /**
     * O prezo que ten que pagar cada xogador que se incriba nunha pista
     *
     * @return
     */
    public abstract double getPrice();

    /**
     * Comproba se a reserva xa está completa
     *
     * @return
     */
    public abstract boolean isCompleted();

    /**
     * Indica se un xogador está inscrito na reserva dunha pista
     *
     * @param id id do xogador
     * @return
     */
    public abstract boolean containsPlayer(String id);

    /**
     * Datos da reserva
     *
     * @return
     */
    public String getDescription() {

        String desc = "Reserva pendente: Data: "+ date +" Hora: "+ hour +" Pista: " + court ;

        return desc;
    }
;

}
