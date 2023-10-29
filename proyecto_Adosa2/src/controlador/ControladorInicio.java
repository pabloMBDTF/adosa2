/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import modelo.Jugador;
import vista.VentanaInicio;
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
    
     public ControladorInicio(Jugador jugador, VentanaInicio ventanaInicio) {

        this.Jugador = jugador;
        this.ventanaInicio = ventanaInicio;
        label4 = ventanaInicio.getLabel4();
        
        label4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                 ventanaInicio.getVentanaInicio().dispose();
                 
                 VentanaParaQue ventana = new VentanaParaQue();
                 ventana.setVisible(true);
            
               
                System.out.println("Botón presionado");
            }
        });

}
   
}

