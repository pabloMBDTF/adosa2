/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class VentanaComoJugar extends JFrame {

    private ArrayList<JPanel> paneles;
    private int posicionActual;
    private JPanel panelPrincipal;
    private JPanel controlPanel;
    private JButton anteriorButton;
    private JButton siguienteButton;

    public VentanaComoJugar() {
        setTitle("Ventana Como Jugar");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

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
        siguienteButton = new JButton("Siguiente");

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

        // Agregar los botones a un panel de control
        controlPanel = new JPanel();
        controlPanel.add(anteriorButton);
        controlPanel.add(siguienteButton);

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

    /*public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new VentanaComoJugar();
        });
    }*/
}
