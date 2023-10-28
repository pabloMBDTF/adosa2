/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.Dimension;
import java.awt.FlowLayout;
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
 * @author USER CT
 */
public class VentanaInicio extends JFrame{
 
     private JFrame ventanaInicio;
     private JPanel panel;
     private JLabel label1;
     private JLabel label2;
     private JLabel label3;
     private JLabel label4;
     
    
     public VentanaInicio(){
     
         ventanaInicio = new JFrame("inicio");
         ventanaInicio.setSize(800, 600);
         ventanaInicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         iniciarComponentes();
     
     }
     
     public void iniciarComponentes(){
         
        panel = new JPanel() {
          @Override
          protected void paintComponent(Graphics g) {
              super.paintComponent(g);
              // Cargar la imagen de fondo desde un archivo
              try {
                  BufferedImage imagenFondo = ImageIO.read(new File("img/fondos/fondoInicio.png"));
                  g.drawImage(imagenFondo, 0, 0, getWidth(), getHeight(), this);
              } catch (IOException e) {
                  e.printStackTrace();
              }
          }
      };
        ventanaInicio.setContentPane(panel);
        panel.setLayout(null);
        
        
        
        label1 = new JLabel();
        label1.setBounds(325, 30, 200, 200);//150-100
        ImageIcon img = new ImageIcon("img/cuadros/adosa2.png");
        label1.setIcon(new ImageIcon(img.getImage().getScaledInstance(label1.getWidth(),label1.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(label1);
        
        label2 = new JLabel();
        label2.setBounds(50, 225, 96, 96);
        ImageIcon img2 = new ImageIcon("img/cuadros/comoJugar.png");
        label2.setIcon(new ImageIcon(img2.getImage().getScaledInstance(label2.getWidth(), label2.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(label2);
       
        label3 = new JLabel();
        label3.setBounds(350, 450, 96, 96);
        ImageIcon img3 = new ImageIcon("img/cuadros/jugar.png");
        label3.setIcon(new ImageIcon(img3.getImage().getScaledInstance(label3.getWidth(), label3.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(label3);
        
        
        
        label4 = new JLabel();
        label4.setBounds(660, 225, 96, 96);
        ImageIcon img4 = new ImageIcon("img/cuadros/paraQue.png");
        label4.setIcon(new ImageIcon(img4.getImage().getScaledInstance(label4.getWidth(), label4.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(label4);
        
        ventanaInicio.setVisible(true);
    }
}
