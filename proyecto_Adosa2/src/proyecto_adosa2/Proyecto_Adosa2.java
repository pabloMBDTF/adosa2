/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_adosa2;

import controlador.ControladorInicio;
import controlador.ControladorJuego;
import modelo.Juego;
import modelo.Jugador;
import vista.VentanaComoJugar;
import vista.VentanaJuego;
import vista.VentanaInicio;
import vista.VentanaParaQue;

/**
 *
 * @author pablo
 */
public class Proyecto_Adosa2 {

   
    public static void main(String[] args) {
        
        //VentanaJuego ventana = new VentanaJuego();
        //new VentanaInicio().setVisible(true);

        //VentanaInicio ventanaa = new VentanaInicio() ;
        //Juego juego = new Juego();

        VentanaInicio ventanaInicio = new VentanaInicio() ;
        //VentanaParaQue ventanaParaQue= new VentanaParaQue();
        VentanaComoJugar ventanaComoJugar = new VentanaComoJugar();
        //Juego juego = new Juego();

        //juego.agregarFigurasAleatorias(3);
        //juego.agregarFiguras();
        //juego.agregarFigurasAleatorias(3);

        //ControladorJuego controlador = new ControladorJuego(juego, ventana);
       // Jugador jugador = new Jugador();

        Jugador jugador = new Jugador();

        ControladorInicio contInicio = new ControladorInicio(jugador, ventanaInicio);
        

        //ControladorJuego controlador = new ControladorJuego(juego, ventana);
        //Jugador jugador = new Jugador();

        //ControladorInicio controladorInicio = new ControladorInicio(jugador, ventanaInicio);

        
    }
    
}
