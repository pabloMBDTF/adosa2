/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author pablo
 */
public class Juego {
    
    private List<Figura> barraArriba;
    private List<Figura> barraAbajo;
    private List<Figura> barraIzquierda;
    private List<Figura> barraDerecha;
    private List<Figura> listaFiguras;
    private Jugador jugador;

    public Juego() {
        this.barraArriba = new ArrayList<>();
        this.barraAbajo = new ArrayList<>();
        this.barraIzquierda = new ArrayList<>();
        this.barraDerecha = new ArrayList<>();
        this.listaFiguras = new ArrayList<>();
        this.jugador = new Jugador();
        agregarFiguras();
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

    public List<Figura> getBarraIzquierda() {
        return barraIzquierda;
    }

    public void setBarraIzquiaerda(List<Figura> barraIzquiaerda) {
        this.barraIzquierda = barraIzquiaerda;
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

    public List<Figura> getListaFiguras() {
        return listaFiguras;
    }

    public void setListaFiguras(List<Figura> listaFiguras) {
        this.listaFiguras = listaFiguras;
    }
    
    
    public void agregarFiguras(){
        Figura figura1 = new Figura("Figura 1", "ruta/a/imagen1.jpg");
        Figura figura2 = new Figura("Figura 2", "ruta/a/imagen2.jpg");
        Figura figura3 = new Figura("Figura 3", "ruta/a/imagen3.jpg");
        Figura figura4 = new Figura("Figura 4", "ruta/a/imagen4.jpg");
        Figura figura5 = new Figura("Figura 5", "ruta/a/imagen5.jpg");
        Figura figura6 = new Figura("Figura 6", "ruta/a/imagen6.jpg");
        Figura figura7 = new Figura("Figura 7", "ruta/a/imagen7.jpg");
        Figura figura8 = new Figura("Figura 8", "ruta/a/imagen8.jpg");
        Figura figura9 = new Figura("Figura 9", "ruta/a/imagen9.jpg");
        Figura figura10 = new Figura("Figura 10", "ruta/a/imagen10.jpg");

        anadirFig(figura1);
        anadirFig(figura2);
        anadirFig(figura3);
        anadirFig(figura4);
        anadirFig(figura5);
        anadirFig(figura6);
        anadirFig(figura7);
        anadirFig(figura8);
        anadirFig(figura9);
        anadirFig(figura10);
        System.out.println("Figuras agregadas");
    }
    
    public void anadirFig(Figura fig){
        listaFiguras.add(fig);
        System.out.println("Figura añadida: " + fig.getNombre());
    }
    
    
    public void agregarFigurasAleatorias(int cantidad) {
        if (cantidad > listaFiguras.size()) {
            System.out.println("No hay suficientes figuras en listaFiguras.");
            return;
        }
        
        barraArriba.clear();
        barraAbajo.clear();
        barraIzquierda.clear();
        barraDerecha.clear();

        Random random = new Random();

        for (int i = 0; i < cantidad; i++) {
            int indiceFiguraAleatoria = random.nextInt(listaFiguras.size());
            Figura figura = listaFiguras.get(indiceFiguraAleatoria);

            boolean figuraAgregada = false;

            while (!figuraAgregada) {
                int indiceBarraAleatoria = random.nextInt(4); 

                switch (indiceBarraAleatoria) {
                    case 0:
                        if (barraArriba.size() < 2) {
                            barraArriba.add(figura);
                            figuraAgregada = true;
                        }
                        break;
                    case 1:
                        if (barraAbajo.size() < 2) {
                            barraAbajo.add(figura);
                            figuraAgregada = true;
                        }
                        break;
                    case 2:
                        if (barraIzquierda.size() < 2) {
                            barraIzquierda.add(figura);
                            figuraAgregada = true;
                        }
                        break;
                    case 3:
                        if (barraDerecha.size() < 2) {
                            barraDerecha.add(figura);
                            figuraAgregada = true;
                        }
                        break;
                }
            }

            listaFiguras.remove(indiceFiguraAleatoria);
        }

        System.out.println("Todo bien");
    }
    
}
