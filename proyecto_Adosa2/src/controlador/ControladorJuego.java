/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.Dimension;
import java.awt.Image;
import java.util.List;
import javax.swing.ImageIcon;
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
        iniciarJuego();
        iniciarRonda();
      
    }
    
    
    public void iniciarJuego(){
        juego.agregarFiguras();
        juego.agregarFigurasAleatorias(5);
        
    }
    
    public void iniciarRonda(){
        List<Figura> barraAbajoC = juego.getBarraAbajo();
        List<Figura> barraIzquierdaC = juego.getBarraIzquierda();
        List<Figura> barraDerechaC = juego.getBarraDerecha();
        
        pintarFigArriva();
        pintarFigAbajo();
        pintarFigIzquierda();
        pintarFigDerecha();
        
        
        
        
        
    } 
    
    public void cambiarFigura(){
        
    }
    
    public void pintarFigArriva() {
        List<Figura> barraArrivaC = juego.getBarraArriba();

        if (!barraArrivaC.isEmpty()) {
            if (barraArrivaC.size() >= 1) {

                Figura figura1 = barraArrivaC.get(0);
                ImageIcon imagen_1 = new ImageIcon(figura1.getRutaImg());
                System.out.println(figura1.getRutaImg());
                Image imagenEscalada1 = imagen_1.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
                ventana.getBtn1().setBorderPainted(false);
                ventana.getBtn1().setContentAreaFilled(false);
                ventana.getBtn1().setIcon(new ImageIcon(imagenEscalada1));
                ventana.getBtn1().setPreferredSize(new Dimension(80, 80));
                ventana.getBtn1().setVisible(true);

            }

            if (barraArrivaC.size() >= 2) {


                Figura figura2 = barraArrivaC.get(1);
                ImageIcon imagen_2 = new ImageIcon(figura2.getRutaImg());
                System.out.println(figura2.getRutaImg());
                Image imagenEscalada2 = imagen_2.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
                ventana.getBtn2().setBorderPainted(false);
                ventana.getBtn2().setContentAreaFilled(false);
                ventana.getBtn2().setIcon(new ImageIcon(imagenEscalada2));
                ventana.getBtn2().setPreferredSize(new Dimension(80, 80));
                ventana.getBtn2().setVisible(true);
            }
        } else {
            System.out.println("La lista está vacía");
        }
    }
    
    
    public void pintarFigAbajo() {
        List<Figura> barraAbajoC = juego.getBarraAbajo();

        if (!barraAbajoC.isEmpty()) {
            if (barraAbajoC.size() >= 1) {

                Figura figura3 = barraAbajoC.get(0);
                ImageIcon imagen_3 = new ImageIcon(figura3.getRutaImg());
                System.out.println(figura3.getRutaImg());
                Image imagenEscalada3 = imagen_3.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
                ventana.getBtn3().setBorderPainted(false);
                ventana.getBtn3().setContentAreaFilled(false);
                ventana.getBtn3().setIcon(new ImageIcon(imagenEscalada3));
                ventana.getBtn3().setPreferredSize(new Dimension(80, 80));
                ventana.getBtn3().setVisible(true);

            }

            if (barraAbajoC.size() >= 2) {


                Figura figura4 = barraAbajoC.get(1);
                ImageIcon imagen_4 = new ImageIcon(figura4.getRutaImg());
                System.out.println(figura4.getRutaImg());
                Image imagenEscalada4 = imagen_4.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
                ventana.getBtn4().setBorderPainted(false);
                ventana.getBtn4().setContentAreaFilled(false);
                ventana.getBtn4().setIcon(new ImageIcon(imagenEscalada4));
                ventana.getBtn4().setPreferredSize(new Dimension(80, 80));
                ventana.getBtn4().setVisible(true);
            }
        } else {
            System.out.println("La lista está vacía");
        }
    }
    
    public void pintarFigIzquierda() {
        List<Figura> barraIzquierdaC = juego.getBarraIzquierda();

        if (!barraIzquierdaC.isEmpty()) {
            if (barraIzquierdaC.size() >= 1) {

                Figura figura5 = barraIzquierdaC.get(0);
                ImageIcon imagen_5 = new ImageIcon(figura5.getRutaImg());
                System.out.println(figura5.getRutaImg());
                Image imagenEscalada5 = imagen_5.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
                ventana.getBtn5().setBorderPainted(false);
                ventana.getBtn5().setContentAreaFilled(false);
                ventana.getBtn5().setIcon(new ImageIcon(imagenEscalada5));
                ventana.getBtn5().setPreferredSize(new Dimension(80, 80));
                ventana.getBtn5().setVisible(true);

            }

            if (barraIzquierdaC.size() >= 2) {


                Figura figura6 = barraIzquierdaC.get(1);
                ImageIcon imagen_6 = new ImageIcon(figura6.getRutaImg());
                System.out.println(figura6.getRutaImg());
                Image imagenEscalada6 = imagen_6.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
                ventana.getBtn4().setBorderPainted(false);
                ventana.getBtn4().setContentAreaFilled(false);
                ventana.getBtn4().setIcon(new ImageIcon(imagenEscalada6));
                ventana.getBtn4().setPreferredSize(new Dimension(80, 80));
                ventana.getBtn4().setVisible(true);
            }
        } else {
            System.out.println("La lista está vacía");
        }
    }
    
    public void pintarFigDerecha() {
        List<Figura> barraDerechaC = juego.getBarraDerecha();

        if (!barraDerechaC.isEmpty()) {
            if (barraDerechaC.size() >= 1) {

                Figura figura7 = barraDerechaC.get(0);
                ImageIcon imagen_7 = new ImageIcon(figura7.getRutaImg());
                System.out.println(figura7.getRutaImg());
                Image imagenEscalada7 = imagen_7.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
                ventana.getBtn7().setBorderPainted(false);
                ventana.getBtn7().setContentAreaFilled(false);
                ventana.getBtn7().setIcon(new ImageIcon(imagenEscalada7));
                ventana.getBtn7().setPreferredSize(new Dimension(80, 80));
                ventana.getBtn7().setVisible(true);

            }

            if (barraDerechaC.size() >= 2) {


                Figura figura8 = barraDerechaC.get(1);
                ImageIcon imagen_8 = new ImageIcon(figura8.getRutaImg());
                System.out.println(figura8.getRutaImg());
                Image imagenEscalada8 = imagen_8.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
                ventana.getBtn8().setBorderPainted(false);
                ventana.getBtn8().setContentAreaFilled(false);
                ventana.getBtn8().setIcon(new ImageIcon(imagenEscalada8));
                ventana.getBtn8().setPreferredSize(new Dimension(80, 80));
                ventana.getBtn8().setVisible(true);
            }
        } else {
            System.out.println("La lista está vacía");
        }
    }
    
    
    
    
    
}
