/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static java.lang.Math.random;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.Timer;
import modelo.Figura;
import modelo.Juego;
import vista.VentanaJuego;

/**
 *
 * @author pablo
 */
public class ControladorJuego {
    
    private Juego juego;
    private VentanaJuego ventana;
    private int figPantalla = 3;
    private List<Figura> barraArribaC;
    private List<Figura> barraAbajoC;
    private List<Figura> barraIzquierdaC;
    private List<Figura> barraDerechaC;
    private List<Figura> listaFigurasC;
    private List<Integer> botonesActivos = new ArrayList<>();
    private List<Figura> figActivas = new ArrayList<>();
    private Timer timer;
    private JButton btn1C;
    private JButton btn2C;
    private JButton btn3C;
    private JButton btn4C;
    private JButton btn5C;
    private JButton btn6C;
    private JButton btn7C;
    private JButton btn8C;
    private JButton btnAccion;
    private JLabel vida1;
    private JLabel vida2;
    private JLabel vida3;
    private boolean respuesta = false;
    private boolean imgIguales = true;
    
    

    public ControladorJuego(Juego juego, VentanaJuego ventana) {
        this.juego = juego;
        this.ventana = ventana;
        iniciarJuego();
        JButton botonAccion = ventana.getBoton();
        
        ventana.addBtnListener(new btnListener());
        
        
        
      
    }
    
    class btnListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("a");
            if (imgIguales == true) {
                    figPantalla += 1;
                    juego.agregarFiguras();
                    juego.agregarFigurasAleatorias(figPantalla);
                    botonesActivos.clear();
                    figActivas.clear();
                    iniciarRonda();
                    System.out.println(botonesActivos);
                    repetirFigura();
                    
                    timer.stop();
            }
        }
    }
    
    
    public void iniciarJuego(){
        
        juego.agregarFiguras();
        juego.agregarFigurasAleatorias(figPantalla);
        iniciarRonda();
        timer = new Timer(4000, new ActionListener() {
        @Override
            public void actionPerformed(ActionEvent e) {
                //cambiarFigura();
                //botonesActivos.clear();
                //botonesActivos.clear();
                //iniciarRonda();
                repetirFigura();
                
               
            }
        });
        timer.start(); 
        
        
        
        
        
    

    }
    
    public void iniciarRonda(){
        List<Figura> barraArrivaC = juego.getBarraArriba();
        List<Figura> barraAbajoC = juego.getBarraAbajo();
        List<Figura> barraIzquierdaC = juego.getBarraIzquierda();
        List<Figura> barraDerechaC = juego.getBarraDerecha();
        
        pintarFigArriva();
        pintarFigAbajo();
        pintarFigIzquierda();
        pintarFigDerecha();
    } 
    
        
    //cambia una figura de una de las barras por una de el arreglo de figuras general
    public void cambiarFigura() {
        List<Figura> barraArribaC = juego.getBarraArriba();
        List<Figura> barraAbajoC = juego.getBarraAbajo();
        List<Figura> barraIzquierdaC = juego.getBarraIzquierda();
        List<Figura> barraDerechaC = juego.getBarraDerecha();
        List<Figura> listaFigurasC = juego.getListaFiguras();

        Random random = new Random();

        
        int indiceArregloOrigen;
        List<Figura> arregloSeleccionado = null;

        while (arregloSeleccionado == null) {
            indiceArregloOrigen = random.nextInt(4);

            switch (indiceArregloOrigen) {
                case 0:
                    arregloSeleccionado = barraArribaC.isEmpty() ? null : barraArribaC;
                    break;
                case 1:
                    arregloSeleccionado = barraAbajoC.isEmpty() ? null : barraAbajoC;
                    break;
                case 2:
                    arregloSeleccionado = barraIzquierdaC.isEmpty() ? null : barraIzquierdaC;
                    break;
                case 3:
                    arregloSeleccionado = barraDerechaC.isEmpty() ? null : barraDerechaC;
                    break;
            }
        }

        if (!listaFigurasC.isEmpty()) {
            // Obtiene un índice aleatorio en la lista de figuras
            int indiceListaFiguras = random.nextInt(listaFigurasC.size());
            int indiceBarra = random.nextInt(arregloSeleccionado.size());
            
            Figura figuraRemovidaDeBarra = arregloSeleccionado.get(indiceBarra);
            Figura figuraIntercambiada = listaFigurasC.get(indiceListaFiguras);
            
            
            listaFigurasC.add(figuraRemovidaDeBarra);
            arregloSeleccionado.set(indiceBarra, figuraIntercambiada);
            
            listaFigurasC.remove(figuraIntercambiada);
            
            
            
        }

        System.out.println(listaFigurasC);
        System.out.println(barraArribaC);
        System.out.println(barraAbajoC);
        System.out.println(barraIzquierdaC);
        System.out.println(barraDerechaC);
    }

    
    
   
    
    public void cambiarImgFig(JButton btn, String direccion){
        ImageIcon imagen = new ImageIcon(direccion);
        Image imagenEscalada = imagen.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
        btn.setIcon(new ImageIcon(imagenEscalada));
        btn.setPreferredSize(new Dimension(80, 80));              
    }
    
    public void repetirFigura() {
        List<Figura> barraArribaC = juego.getBarraArriba();
        List<Figura> barraAbajoC = juego.getBarraAbajo();
        List<Figura> barraIzquierdaC = juego.getBarraIzquierda();
        List<Figura> barraDerechaC = juego.getBarraDerecha();
        Random random = new Random();
        
        int valorProhibido = 0;
        int valorBoton;
        Figura figuraSeleccionada = null;
        
        
        if (!figActivas.isEmpty()) {
            
            int indiceAleatorio = random.nextInt(figActivas.size());

            // Obtén la Figura en el índice aleatorio
            figuraSeleccionada = figActivas.get(indiceAleatorio);

            // Asigna el índice aleatorio a la variable valorProhibido
            valorProhibido = indiceAleatorio;

            // Ahora puedes usar 'figuraSeleccionada' y 'valorProhibido' según tus necesidades
        }
        while (true) {
            // Genera un número aleatorio entre 0 y el tamaño de la lista - 1
            valorBoton = random.nextInt(botonesActivos.size());

            // Si el número generado es diferente a valorProhibido, sal del bucle
            if (valorBoton != valorProhibido) {
                break;
            }
        }
        switch (valorBoton) {
            case 1 -> cambiarImgFig(ventana.getBtn1(),figuraSeleccionada.getRutaImg()); // Tamaño pequeño
            case 2 -> cambiarImgFig(ventana.getBtn2(),figuraSeleccionada.getRutaImg()); 
            case 3 -> cambiarImgFig(ventana.getBtn3(),figuraSeleccionada.getRutaImg()); 
            case 4 -> cambiarImgFig(ventana.getBtn4(),figuraSeleccionada.getRutaImg()); 
            case 5 -> cambiarImgFig(ventana.getBtn5(),figuraSeleccionada.getRutaImg()); 
            case 6 -> cambiarImgFig(ventana.getBtn6(),figuraSeleccionada.getRutaImg()); 
            case 7 -> cambiarImgFig(ventana.getBtn7(),figuraSeleccionada.getRutaImg()); 
            case 8 -> cambiarImgFig(ventana.getBtn8(),figuraSeleccionada.getRutaImg()); 
            default -> {
            }
        }
        
        
        
    }
    
    public void pintarFigArriva() {
        List<Figura> barraArrivaC = juego.getBarraArriba();
        ventana.getBtn1().setVisible(false);
        ventana.getBtn2().setVisible(false);

        if (!barraArrivaC.isEmpty()) {
            if (barraArrivaC.size() >= 1) {

                Figura figura1 = barraArrivaC.get(0);
                ImageIcon imagen_1 = new ImageIcon(figura1.getRutaImg());                
                Image imagenEscalada1 = imagen_1.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
                ventana.getBtn1().setBorderPainted(false);
                ventana.getBtn1().setContentAreaFilled(false);
                ventana.getBtn1().setIcon(new ImageIcon(imagenEscalada1));
                ventana.getBtn1().setPreferredSize(new Dimension(80, 80));
                ventana.getBtn1().setVisible(true);
                ventana.getBtn1().setText(null);
                botonesActivos.add(1); 
                figActivas.add(figura1);
                //animarDesplazamientoBotones(ventana.getBtn1(), ventana.getBtn1().getX(), ventana.getBtn1().getY());
                //ventana.getBtn1().setText(figura1.getNombre());

            }

            if (barraArrivaC.size() >= 2) {


                Figura figura2 = barraArrivaC.get(1);
                ImageIcon imagen_2 = new ImageIcon(figura2.getRutaImg());                
                Image imagenEscalada2 = imagen_2.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
                ventana.getBtn2().setBorderPainted(false);
                ventana.getBtn2().setContentAreaFilled(false);
                ventana.getBtn2().setIcon(new ImageIcon(imagenEscalada2));
                ventana.getBtn2().setPreferredSize(new Dimension(80, 80));
                ventana.getBtn2().setVisible(true);
                ventana.getBtn2().setBorder(null);
                ventana.getBtn2().setText(null);
                botonesActivos.add(2);
                figActivas.add(figura2);
                //animarDesplazamientoBotones(ventana.getBtn2(), ventana.getBtn2().getX(), ventana.getBtn2().getY());
                //ventana.getBtn2().setText(figura2.getNombre());
            }
        } else {
            System.out.println("La lista está vacía");
        }
    }
    
    public void pintarFigAbajo() {
        List<Figura> barraAbajoC = juego.getBarraAbajo();
        
        ventana.getBtn3().setVisible(false);
        ventana.getBtn4().setVisible(false);

        if (!barraAbajoC.isEmpty()) {
            if (barraAbajoC.size() >= 1) {

                Figura figura3 = barraAbajoC.get(0);
                ImageIcon imagen_3 = new ImageIcon(figura3.getRutaImg());                
                Image imagenEscalada3 = imagen_3.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
                ventana.getBtn3().setBorderPainted(false);
                ventana.getBtn3().setContentAreaFilled(false);
                ventana.getBtn3().setIcon(new ImageIcon(imagenEscalada3));
                ventana.getBtn3().setPreferredSize(new Dimension(80, 80));
                ventana.getBtn3().setVisible(true);
                ventana.getBtn3().setText(null);
                botonesActivos.add(3); 
                figActivas.add(figura3);
                //animarDesplazamientoBotones(ventana.getBtn3(), ventana.getBtn3().getX(), ventana.getBtn3().getY());
                //ventana.getBtn3().setText(figura3.getNombre());

            }

            if (barraAbajoC.size() >= 2) {


                Figura figura4 = barraAbajoC.get(1);
                ImageIcon imagen_4 = new ImageIcon(figura4.getRutaImg());                
                Image imagenEscalada4 = imagen_4.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
                ventana.getBtn4().setBorderPainted(false);
                ventana.getBtn4().setContentAreaFilled(false);
                ventana.getBtn4().setIcon(new ImageIcon(imagenEscalada4));
                ventana.getBtn4().setPreferredSize(new Dimension(80, 80));
                ventana.getBtn4().setVisible(true);
                ventana.getBtn4().setText(null);
                botonesActivos.add(4); 
                figActivas.add(figura4);
                //animarDesplazamientoBotones(ventana.getBtn4(), ventana.getBtn4().getX(), ventana.getBtn4().getY());
                //ventana.getBtn4().setText(figura4.getNombre());
            }
        } else {
            System.out.println("La lista está vacía");
        }
    }
    
    public void pintarFigIzquierda() {
        List<Figura> barraIzquierdaC = juego.getBarraIzquierda();
        
        ventana.getBtn5().setVisible(false);
        ventana.getBtn6().setVisible(false);

        if (!barraIzquierdaC.isEmpty()) {
            if (barraIzquierdaC.size() >= 1) {

                Figura figura5 = barraIzquierdaC.get(0);
                ImageIcon imagen_5 = new ImageIcon(figura5.getRutaImg());               
                Image imagenEscalada5 = imagen_5.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
                ventana.getBtn5().setBorderPainted(false);
                ventana.getBtn5().setContentAreaFilled(false);
                ventana.getBtn5().setIcon(new ImageIcon(imagenEscalada5));
                ventana.getBtn5().setPreferredSize(new Dimension(80, 80));
                ventana.getBtn5().setVisible(true);
                ventana.getBtn5().setText(null);
                botonesActivos.add(5); 
                figActivas.add(figura5);
                //animarDesplazamientoBotones(ventana.getBtn5(), ventana.getBtn5().getX(), ventana.getBtn5().getY());
                

            }

            if (barraIzquierdaC.size() >= 2) {


                Figura figura6 = barraIzquierdaC.get(1);
                ImageIcon imagen_6 = new ImageIcon(figura6.getRutaImg());                
                Image imagenEscalada6 = imagen_6.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
                ventana.getBtn6().setBorderPainted(false);
                ventana.getBtn6().setContentAreaFilled(false);
                ventana.getBtn6().setIcon(new ImageIcon(imagenEscalada6));
                ventana.getBtn6().setPreferredSize(new Dimension(80, 80));
                ventana.getBtn6().setVisible(true);
                ventana.getBtn6().setText(figura6.getNombre());
                ventana.getBtn6().setText(null);
                botonesActivos.add(6); 
                figActivas.add(figura6);
                //animarDesplazamientoBotones(ventana.getBtn6(), ventana.getBtn6().getX(), ventana.getBtn6().getY());
            }
        } else {
            System.out.println("La lista está vacía");
        }
    }
    
    public void pintarFigDerecha() {
        List<Figura> barraDerechaC = juego.getBarraDerecha();
        
        ventana.getBtn7().setVisible(false);
        ventana.getBtn8().setVisible(false);

        if (!barraDerechaC.isEmpty()) {
            if (barraDerechaC.size() >= 1) {

                Figura figura7 = barraDerechaC.get(0);
                ImageIcon imagen_7 = new ImageIcon(figura7.getRutaImg());                
                Image imagenEscalada7 = imagen_7.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
                ventana.getBtn7().setBorderPainted(false);
                ventana.getBtn7().setContentAreaFilled(false);
                ventana.getBtn7().setIcon(new ImageIcon(imagenEscalada7));
                ventana.getBtn7().setPreferredSize(new Dimension(80, 80));
                ventana.getBtn7().setVisible(true);
                ventana.getBtn7().setText(figura7.getNombre());
                ventana.getBtn7().setText(null);
                botonesActivos.add(7);
                figActivas.add(figura7);
                
                //animarDesplazamientoBotones(ventana.getBtn7(), ventana.getBtn7().getX(), ventana.getBtn7().getY());
                

            }

            if (barraDerechaC.size() >= 2) {


                Figura figura8 = barraDerechaC.get(1);
                ImageIcon imagen_8 = new ImageIcon(figura8.getRutaImg());                
                Image imagenEscalada8 = imagen_8.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
                ventana.getBtn8().setBorderPainted(false);
                ventana.getBtn8().setContentAreaFilled(false);
                ventana.getBtn8().setIcon(new ImageIcon(imagenEscalada8));
                ventana.getBtn8().setPreferredSize(new Dimension(80, 80));
                ventana.getBtn8().setVisible(true);
                ventana.getBtn8().setText(figura8.getNombre());
                ventana.getBtn8().setText(null);
                botonesActivos.add(8); 
                figActivas.add(figura8);
                //animarDesplazamientoBotones(ventana.getBtn8(), ventana.getBtn8().getX(), ventana.getBtn8().getY());
            }
        } else {
            System.out.println("La lista está vacía");
        }
    }
    
    
    public void animarDesplazamientoBotones(JButton boton, int xDestino, int yDestino) {
        int xInicio = -boton.getWidth(); // Iniciar fuera de la pantalla a la izquierda
        int yInicio = yDestino; // Mismo nivel vertical que el destino

        Timer timer = new Timer(10, new ActionListener() {
            int x = xInicio;
            int y = yInicio;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (x < xDestino) {
                    x++;
                }
                if (y < yDestino) {
                    y++;
                }
                boton.setLocation(x, y);

                if (x == xDestino && y == yDestino) {
                    // La animación ha llegado a su destino, detén el timer
                    ((Timer) e.getSource()).stop();
                }
            }
        });

        timer.start();
    }
    
    
    
        
}
