/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import modelo.Juego;
import modelo.Jugador;
import vista.VentanaComoJugar;
import vista.VentanaInicio;
import vista.VentanaJuego;
import vista.VentanaParaQue;

/**
 *
 * @author USER CT
 */
public class ControladorInicio {

    public static void abrirVentanaInicio() {
        VentanaInicio ventanaInicio = new VentanaInicio();
        ventanaInicio.setVisible(true);
      
    }
    
    private VentanaInicio ventanaInicio;
    private final Jugador Jugador;
    private JLabel label4;
    private JLabel label3;
    private JLabel label2;
    
    public ControladorInicio(Jugador jugador, VentanaInicio ventanaInicio) {

        this.Jugador = jugador;
        this.ventanaInicio = ventanaInicio;
        label4 = ventanaInicio.getLabel4();
        label3 = ventanaInicio.getLabel3();
        label2 = ventanaInicio.getLabel2();
        
        label4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ventanaInicio.getVentanaInicio().dispose();
                VentanaParaQue ventana = new VentanaParaQue();
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                label4.setBounds(660, 225, 120, 120);
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                label4.setBounds(660, 225, 96, 96);
                //label4.setPreferredSize(new Dimension(96, 96));
            }
        });
        
        label3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ventanaInicio.getVentanaInicio().dispose();
                Juego juego = new Juego();
                VentanaJuego ventana = new VentanaJuego();
                ControladorJuego controlador = new ControladorJuego(juego, ventana);
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                label3.setBounds(350, 450, 120, 120);
                //label4.setPreferredSize(new Dimension(84, 84));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                label3.setBounds(350, 450, 96, 96);
                //label4.setPreferredSize(new Dimension(96, 96));
            }
        });
        
        label2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ventanaInicio.getVentanaInicio().dispose();
                VentanaComoJugar ventanaComoJugar = new VentanaComoJugar();
            }
            @Override
            public void mouseEntered(MouseEvent e) {
                label2.setBounds(50, 225, 120, 120);
                //label4.setPreferredSize(new Dimension(84, 84));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                label2.setBounds(50, 225, 96, 96);
                //label4.setPreferredSize(new Dimension(96, 96));
            }
        });

}
   
}


