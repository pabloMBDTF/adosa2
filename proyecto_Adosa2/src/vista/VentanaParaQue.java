/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Pablo Becerrra G. - 2243506 - pablo.becerra@correounivalle.edu.co
Tiffany Torres F. - 2241747 - tiffany.torre@correounivalle.edu.do

Fundamentos de programacion orientada a eventos

*/

package vista;

import controlador.ControladorInicio;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import modelo.Jugador;

/**
 *
 * @author USER CT
 */
public class VentanaParaQue extends JFrame{
    
    private JFrame ventanaParaQue;
    private JPanel panel;
    private JButton boton;
    
    
    public VentanaParaQue(){
        ventanaParaQue = new JFrame("para que jugar");
        ventanaParaQue.setSize(800, 600);
        ventanaParaQue.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iniciarComponentes();
    }
     
     
    public void iniciarComponentes(){
        
        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                
                try {
                    BufferedImage imagenFondo = ImageIO.read(new File("img/fondos/paraQueJugar.png"));
                    g.drawImage(imagenFondo, 0, 0, getWidth(), getHeight(), this);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };

        ventanaParaQue.setContentPane(panel);
        panel.setLayout(null);

        boton = new JButton(); 
        boton.setBounds(50, 450, 150, 100);
        ImageIcon imagen_1 = new ImageIcon("img/cuadros/volver.png");
        Image imagenEscalada1 = imagen_1.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        boton.setBorderPainted(false);
        boton.setContentAreaFilled(false);
        boton.setFocusPainted(false);
        boton.setIcon(new ImageIcon(imagenEscalada1));
        boton.setPreferredSize(new Dimension(80, 80));
        boton.setVisible(true); 

        panel.add(boton);

        ventanaParaQue.setVisible(true);

        boton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                ventanaParaQue.dispose();
                Jugador jugador = new Jugador();
                VentanaInicio ventanaInicio = new VentanaInicio() ;
                ControladorInicio inicio = new ControladorInicio(jugador, ventanaInicio);
            }
        });
    }

    public JFrame getVentanaParaQue() {
        return ventanaParaQue;
    }

    public void setVentanaParaQue(JFrame ventanaParaQue) {
        this.ventanaParaQue = ventanaParaQue;
    }
}
     

