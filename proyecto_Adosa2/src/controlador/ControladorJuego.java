/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import javax.swing.JButton;
import modelo.Figura;
import modelo.Juego;
import vista.VentanaJuego;

/**
 *
 * @author pablo
 */
public class ControladorJuego {
    
    private Juego juego;
    private VentanaJuego ventana;
    private int figPantalla = 3;
    private List<Figura> barraArribaC;
    private List<Figura> barraAbajoC;
    private List<Figura> barraIzquierdaC;
    private List<Figura> barraDerechaC;
    private List<Figura> listaFigurasC;
    private JButton btn1C;
    private JButton btn2C;
    private JButton btn3C;
    private JButton btn4C;
    private JButton btn5C;
    private JButton btn6C;
    private JButton btn7C;
    private JButton btn8C;
    
    

    public ControladorJuego(Juego juego, VentanaJuego ventana) {
        this.juego = juego;
        this.ventana = ventana;
      
    }
    
    
    public void iniciarJuego(){
        
    }
    
    public void iniciarRonda(){
        List<Figura> barraArrivaC = juego.getBarraArriba();
        List<Figura> barraAbajoC = juego.getBarraAbajo();
        List<Figura> barraIzquierdaC = juego.getBarraIzquierda();
        List<Figura> barraDerechaC = juego.getBarraDerecha();
        
        
        
        
    } 
    
    public void cambiarFigura(){
        
    }
    
    
    
    
    
}
