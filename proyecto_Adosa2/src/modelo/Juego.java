/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pablo
 */
public class Juego {
    
    private List<Figura> barraArriba;
    private List<Figura> barraAbajo;
    private List<Figura> barraIzquiaerda;
    private List<Figura> barraDerecha;
    private Jugador jugador;

    public Juego() {
        this.barraArriba = new ArrayList<>();
        this.barraAbajo = new ArrayList<>();
        this.barraIzquiaerda = new ArrayList<>();
        this.barraDerecha = new ArrayList<>();
        this.jugador = new Jugador();
    }

    public List<Figura> getBarraArriba() {
        return barraArriba;
    }

    public void setBarraArriba(List<Figura> barraArriba) {
        this.barraArriba = barraArriba;
    }

    public List<Figura> getBarraAbajo() {
        return barraAbajo;
    }

    public void setBarraAbajo(List<Figura> barraAbajo) {
        this.barraAbajo = barraAbajo;
    }

    public List<Figura> getBarraIzquiaerda() {
        return barraIzquiaerda;
    }

    public void setBarraIzquiaerda(List<Figura> barraIzquiaerda) {
        this.barraIzquiaerda = barraIzquiaerda;
    }

    public List<Figura> getBarraDerecha() {
        return barraDerecha;
    }

    public void setBarraDerecha(List<Figura> barraDerecha) {
        this.barraDerecha = barraDerecha;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
    
    
    
}
