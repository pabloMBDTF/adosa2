/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Pablo Becerrra G. - 2243506 - pablo.becerra@correounivalle.edu.co
Tiffany Torres F. - 2241747 - tiffany.torre@correounivalle.edu.do

Fundamentos de programacion orientada a eventos

*/

package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
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
    private JLabel puntaje;
    private JLabel errores;
    private JLabel aciertos;

    public ControladorStats(VentanaStats ventana, Jugador modelo) {
        this.ventana = ventana;
        this.modelo = modelo;
        ventana.addBtnListener(new btnListener());
        mostrarStats();
    }
    
    class btnListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            ventana.getVentanaParaQue().dispose();
            Jugador jugador = new Jugador();
            VentanaInicio ventanaInicio = new VentanaInicio() ;
            ControladorInicio inicio = new ControladorInicio(jugador, ventanaInicio);
        }
    }
    
    public void mostrarStats(){
        ventana.getPuntaje().setBounds(100, 120, 200, 30);
        ventana.getPuntaje().setText("Puntaje: " + modelo.getPuntaje());
        ventana.getErrores().setBounds(100, 240, 150, 30);
        ventana.getErrores().setText("Errores: " + modelo.getErrores());
        ventana.getAciertos().setBounds(100, 360, 150, 30);
        ventana.getAciertos().setText("Aciertos: " + modelo.getAciertos());
        
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
