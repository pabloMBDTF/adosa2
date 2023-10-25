/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_adosa2;

import controlador.ControladorJuego;
import modelo.Juego;
import vista.VentanaJuego;

/**
 *
 * @author pablo
 */
public class Proyecto_Adosa2 {

   
    public static void main(String[] args) {
        
        VentanaJuego ventana = new VentanaJuego();
        Juego juego = new Juego();
        //juego.agregarFigurasAleatorias(3);
        //juego.agregarFiguras();
        //juego.agregarFigurasAleatorias(3);
        
        ControladorJuego controlador = new ControladorJuego(juego, ventana);
        
    }
    
}
