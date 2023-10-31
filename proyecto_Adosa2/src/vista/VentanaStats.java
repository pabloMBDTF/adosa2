/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.ControladorInicio;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
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
import javax.swing.JLabel;
import javax.swing.JPanel;
import modelo.Jugador;

/**
 *
 * @author pablo
 */
public class VentanaStats extends JFrame{
    
    private JFrame ventanaStats;
    private JPanel panel;
    private JButton boton;
    private JLabel puntaje;
    private JLabel errores;
    private JLabel aciertos;
    
    
    public VentanaStats(){
        ventanaStats = new JFrame("para que jugar");
        ventanaStats.setSize(800, 600);
        ventanaStats.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        iniciarComponentes();
    }
     
     
    public void iniciarComponentes(){
        
        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Cargar la imagen de fondo desde un archivo
                try {
                    BufferedImage imagenFondo = ImageIO.read(new File("img/fondos/fondo.png"));
                    g.drawImage(imagenFondo, 0, 0, getWidth(), getHeight(), this);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };

        ventanaStats.setContentPane(panel);
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
        panel.add(boton);
        panel.add(boton);
        panel.add(boton);
        
        puntaje = new JLabel("puntaje");
        errores = new JLabel("errores");
        aciertos = new JLabel("aciertos");
        puntaje.setVisible(true);
        errores.setVisible(true);
        aciertos.setVisible(true);
        
        Font font = new Font("Orbitron", Font.ITALIC, 30); // Reemplaza "Orbitron" con la fuente futurista que prefieras
        puntaje.setFont(font);

        // Establece el color azul fosforescente
        Color azulFosforescente = new Color(14, 152, 230); // Puedes ajustar los valores de RGB según tus preferencias
        puntaje.setForeground(azulFosforescente);
        
        errores.setForeground(azulFosforescente);
        errores.setFont(font);
        
        aciertos.setForeground(azulFosforescente);
        aciertos.setFont(font);
        
        panel.add(puntaje);
        panel.add(errores);
        panel.add(aciertos);

        ventanaStats.setVisible(true);

        
    }

    public JFrame getVentanaParaQue() {
        return ventanaStats;
    }

    public void setVentanaParaQue(JFrame ventanaParaQue) {
        this.ventanaStats = ventanaParaQue;
    }

    public JFrame getVentanaStats() {
        return ventanaStats;
    }

    public void setVentanaStats(JFrame ventanaStats) {
        this.ventanaStats = ventanaStats;
    }

    public JButton getBoton() {
        return boton;
    }

    public void setBoton(JButton boton) {
        this.boton = boton;
    }

    public JLabel getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(JLabel puntaje) {
        this.puntaje = puntaje;
    }

    public JLabel getErrores() {
        return errores;
    }

    public void setErrores(JLabel errores) {
        this.errores = errores;
    }

    public JLabel getAciertos() {
        return aciertos;
    }

    public void setAciertos(JLabel aciertos) {
        this.aciertos = aciertos;
    }
    
    public void addBtnListener(ActionListener listener) {
        boton.addActionListener(listener);
    }
    
    
}