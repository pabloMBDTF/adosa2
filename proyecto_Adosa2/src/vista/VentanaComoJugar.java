/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.ControladorInicio;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import modelo.Jugador;

public class VentanaComoJugar extends JFrame {

    private ArrayList<JPanel> paneles;
    private int posicionActual;
    private JPanel panelPrincipal;
    private JPanel controlPanel;
    private JButton anteriorButton;
    private JButton siguienteButton;
    private JButton volver;

    public VentanaComoJugar() {
        setTitle("Ventana Como Jugar");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        // Inicializar los paneles y la lista
        paneles = new ArrayList<>();
        for (int i = 1; i <= 4; i++) {
            final int index = i;
            JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                try {
                    Image imagen = ImageIO.read(new File("img/fondos/comoJugar" + index + ".png")); // Reemplaza con la ruta de tu imagen
                    g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            };
            paneles.add(panel);
        }

        // Configurar los botones de navegación
        anteriorButton = new JButton("Anterior");
        ImageIcon imagen_1 = new ImageIcon("img/cuadros/flechaDerecha.png");
        Image imagenEscalada1 = imagen_1.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        anteriorButton.setBorderPainted(false);
        anteriorButton.setContentAreaFilled(false);
        anteriorButton.setIcon(new ImageIcon(imagenEscalada1));
        anteriorButton.setPreferredSize(new Dimension(80, 80));
        anteriorButton.setVisible(true);
        
        
        siguienteButton = new JButton("Siguiente");
        ImageIcon imagen_2 = new ImageIcon("img/cuadros/flechaIzquierda.png");
        Image imagenEscalada2 = imagen_2.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        siguienteButton.setBorderPainted(false);
        siguienteButton.setContentAreaFilled(false);
        siguienteButton.setIcon(new ImageIcon(imagenEscalada2));
        siguienteButton.setPreferredSize(new Dimension(80, 80));
        siguienteButton.setVisible(true);
        
        
        volver = new JButton("volver");
        ImageIcon imagen_3 = new ImageIcon("img/cuadros/volver.png");
        Image imagenEscalada3 = imagen_3.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        volver.setBorderPainted(false);
        volver.setContentAreaFilled(false);
        volver.setIcon(new ImageIcon(imagenEscalada3));
        volver.setPreferredSize(new Dimension(80, 80));
        volver.setVisible(true);
  

        anteriorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarPanelAnterior();
            }
        });

        siguienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarPanelSiguiente();
            }
        });
        
         volver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                
                dispose();
                Jugador jugador = new Jugador();
                VentanaInicio ventanaInicio = new VentanaInicio() ;
                ControladorInicio inicio = new ControladorInicio(jugador, ventanaInicio);
                
                
            }
        });

        // Agregar los botones a un panel de control
        controlPanel = new JPanel();
        controlPanel.add(anteriorButton);
        controlPanel.add(volver);
        controlPanel.add(siguienteButton);
        controlPanel.setBackground(Color.BLACK);

        // Agregar el panel de control y el panel principal al marco
        panelPrincipal = new JPanel(new BorderLayout());
        setContentPane(panelPrincipal);
        add(controlPanel, BorderLayout.SOUTH);
        
        // Mostrar el panel inicial
        mostrarPanelActual();
        
        setVisible(true);
    }

   private void mostrarPanelActual() {
    panelPrincipal.removeAll();

    // Configurar el diseño del panel principal
    panelPrincipal.setLayout(new BorderLayout());
    panelPrincipal.add(paneles.get(posicionActual), BorderLayout.CENTER);
    panelPrincipal.add(controlPanel, BorderLayout.SOUTH);
    
    //panelPrincipal.setBackground(Color.BLACK);

    panelPrincipal.revalidate();
    panelPrincipal.repaint();
}


    private void cambiarPanelSiguiente() {
        if (posicionActual < paneles.size() - 1) {
            posicionActual++;
            mostrarPanelActual();
        }
    }

    private void cambiarPanelAnterior() {
        if (posicionActual > 0) {
            posicionActual--;
            mostrarPanelActual();
        }
    }

    
}
