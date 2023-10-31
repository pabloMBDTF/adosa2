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
 * @author pablo
 */
public class Figura {
    
    private String nombre;
    private String rutaImg;

    public Figura() {
    }
    
    public Figura duplicar() {
        Figura figuraDuplicada = new Figura();
        figuraDuplicada.setNombre(this.nombre);
        figuraDuplicada.setRutaImg(this.rutaImg); 

       

        return figuraDuplicada;
    }

    public Figura(String nombre, String rutaImg) {
        this.nombre = nombre;
        this.rutaImg = rutaImg;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRutaImg() {
        return rutaImg;
    }

    public void setRutaImg(String rutaImg) {
        this.rutaImg = rutaImg;
    }
    
    
    
    
    
    
}
