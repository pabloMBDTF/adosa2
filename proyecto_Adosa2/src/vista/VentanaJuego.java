/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author pablo
 */



public class VentanaJuego extends JFrame{
    
    
    private JFrame ventanaJuego;
    private JPanel panel;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JButton boton;
    
    
    
    public VentanaJuego(){
        ventanaJuego = new JFrame("Juego");
        ventanaJuego.setSize(800, 500);
        ventanaJuego.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        VentanaJuego();               
    }
    
    public void VentanaJuego(){
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
        panel.setLayout(null);
        ventanaJuego.setContentPane(panel);
        ventanaJuego.setVisible(true);
        
        btn1 = new JButton("1");
        btn2 = new JButton("1");
        btn3 = new JButton("1");
        btn4 = new JButton("1");
        btn5 = new JButton("1");
        btn6 = new JButton("1");
        btn7 = new JButton("1");
        btn8 = new JButton("1");
        boton = new JButton("btn");
        
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);
        panel.add(btn5);
        panel.add(btn6);
        panel.add(btn7);
        panel.add(btn8);
        panel.add(boton);
        
        
        btn1.setBounds(400, 25, 80, 80);
        ImageIcon imagen_1 = new ImageIcon("img/cuadros/cuadradoRojo.png");
        Image imagenEscalada1 = imagen_1.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        btn1.setBorderPainted(false);
        btn1.setContentAreaFilled(false);
        btn1.setIcon(new ImageIcon(imagenEscalada1));
        btn1.setPreferredSize(new Dimension(80, 80));
        btn1.setVisible(false);
        
        btn2.setBounds(400, 125, 80, 80);
        ImageIcon imagen_2 = new ImageIcon("img/cuadros/cuadradoRojo.png");
        Image imagenEscalada2 = imagen_2.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        btn2.setBorderPainted(false);
        btn2.setContentAreaFilled(false);
        btn2.setIcon(new ImageIcon(imagenEscalada2));
        btn2.setPreferredSize(new Dimension(80, 80));
        btn2.setVisible(false);

        
        
        btn3.setBounds(400, 265, 80, 80);
        ImageIcon imagen_3 = new ImageIcon("img/cuadros/cuadradoRojo.png");
        Image imagenEscalada3 = imagen_3.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        btn3.setBorderPainted(false);
        btn3.setContentAreaFilled(false);
        btn3.setIcon(new ImageIcon(imagenEscalada3));
        btn3.setPreferredSize(new Dimension(80, 80));
        btn3.setVisible(false);
        
        btn4.setBounds(400, 365, 80, 80);
        ImageIcon imagen_4 = new ImageIcon("img/cuadros/cuadradoRojo.png");
        Image imagenEscalada4 = imagen_4.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        btn4.setBorderPainted(false);
        btn4.setContentAreaFilled(false);
        btn4.setIcon(new ImageIcon(imagenEscalada4));
        btn4.setPreferredSize(new Dimension(80, 80));
        btn4.setVisible(false);
        
        
        btn5.setBounds(120, 200, 80, 80);
        ImageIcon imagen_5 = new ImageIcon("img/cuadros/cuadradoRojo.png");
        Image imagenEscalada5 = imagen_5.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        btn5.setBorderPainted(false);
        btn5.setContentAreaFilled(false);
        btn5.setIcon(new ImageIcon(imagenEscalada5));
        btn5.setPreferredSize(new Dimension(80, 80));
        btn5.setVisible(false);
        
        btn6.setBounds(240, 200, 80, 80);
        ImageIcon imagen_6 = new ImageIcon("img/cuadros/cuadradoRojo.png");
        Image imagenEscalada6 = imagen_6.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        btn6.setBorderPainted(false);
        btn6.setContentAreaFilled(false);
        btn6.setIcon(new ImageIcon(imagenEscalada6));
        btn6.setPreferredSize(new Dimension(80, 80));
        btn6.setVisible(false);
        
        btn7.setBounds(535, 200, 80, 80);
        ImageIcon imagen_7 = new ImageIcon("img/cuadros/cuadradoRojo.png");
        Image imagenEscalada7 = imagen_7.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        btn7.setBorderPainted(false);
        btn7.setContentAreaFilled(false);
        btn7.setIcon(new ImageIcon(imagenEscalada7));
        btn7.setPreferredSize(new Dimension(80, 80));
        btn7.setVisible(false);
        
        btn8.setBounds(655, 200, 80, 80);
        ImageIcon imagen_8 = new ImageIcon("img/cuadros/cuadradoRojo.png");
        Image imagenEscalada8 = imagen_8.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        btn8.setBorderPainted(false);
        btn8.setContentAreaFilled(false);
        btn8.setIcon(new ImageIcon(imagenEscalada8));
        btn8.setPreferredSize(new Dimension(80, 80));
        btn8.setVisible(false);
        
        
        
       
        
        
        
    }

    public JButton getBtn1() {
        return btn1;
    }

    public void setBtn1(JButton btn1) {
        this.btn1 = btn1;
    }

    public JButton getBtn2() {
        return btn2;
    }

    public void setBtn2(JButton btn2) {
        this.btn2 = btn2;
    }

    public JButton getBtn3() {
        return btn3;
    }

    public void setBtn3(JButton btn3) {
        this.btn3 = btn3;
    }

    public JButton getBtn4() {
        return btn4;
    }

    public void setBtn4(JButton btn4) {
        this.btn4 = btn4;
    }

    public JButton getBtn5() {
        return btn5;
    }

    public void setBtn5(JButton btn5) {
        this.btn5 = btn5;
    }

    public JButton getBtn6() {
        return btn6;
    }

    public void setBtn6(JButton btn6) {
        this.btn6 = btn6;
    }

    public JButton getBtn7() {
        return btn7;
    }

    public void setBtn7(JButton btn7) {
        this.btn7 = btn7;
    }

    public JButton getBtn8() {
        return btn8;
    }

    public void setBtn8(JButton btn8) {
        this.btn8 = btn8;
    }

    public JButton getBoton() {
        return boton;
    }

    public void setBoton(JButton boton) {
        this.boton = boton;
    }
    
   
    
    
    
}
