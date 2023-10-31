/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Pablo Becerrra G. - 2243506 - pablo.becerra@correounivalle.edu.co
Tiffany Torres F. - 2241747 - tiffany.torre@correounivalle.edu.do

Fundamentos de programacion orientada a eventos

*/

package modelo;

/**
 *
 * @author USER CT
 */
public class Jugador {
    private String nombre;
    private int vidas;
    private int aciertos;
    private int errores;
    private int puntaje;

    
    public Jugador() {
        this.nombre = "";
        this.vidas = 3;
        this.aciertos = 0;
        this.errores = 0;
        this.puntaje = 0;
        
    }
    
    public Jugador(int aciertos, int errores, int puntaje) {
        this.nombre = "";
        this.vidas = 3;
        this.aciertos = aciertos;
        this.errores = errores;
        this.puntaje = puntaje;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getAciertos() {
        return aciertos;
    }

    public void setAciertos(int aciertos) {
        this.aciertos = aciertos;
    }

    public int getErrores() {
        return errores;
    }

    public void setErrores(int errores) {
        this.errores = errores;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    
    
    
    public void sumarPuntaje(){
        this.puntaje += 15;
    }
    
    public void sumarAciertos(){
        this.aciertos += 1;
    }
    
    public void sumarErrores(){
        this.errores += 1;
    }
    
    
   
    }
