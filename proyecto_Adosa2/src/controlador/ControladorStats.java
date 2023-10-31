/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Jugador;
import vista.VentanaInicio;
import vista.VentanaStats;

/**
 *
 * @author pablo
 */
public class ControladorStats {
    
    private VentanaStats ventana;
    private Jugador modelo;

    public ControladorStats(VentanaStats ventana, Jugador modelo) {
        this.ventana = ventana;
        this.modelo = modelo;
        ventana.addBtnListener(new btnListener());
    }
    
    class btnListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            ventana.getVentanaParaQue().dispose();
            Jugador jugador = new Jugador();
            VentanaInicio ventanaInicio = new VentanaInicio() ;
            ControladorInicio inicio = new ControladorInicio(jugador, ventanaInicio);
        }
    }
    

    public VentanaStats getVentana() {
        return ventana;
    }

    public void setVentana(VentanaStats ventana) {
        this.ventana = ventana;
    }

    public Jugador getModelo() {
        return modelo;
    }

    public void setModelo(Jugador modelo) {
        this.modelo = modelo;
    }
    
    
    
}
