/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
    // Crea una nueva instancia de Figura y copia los atributos de la figura actual
        Figura figuraDuplicada = new Figura();
        figuraDuplicada.setNombre(this.nombre);
        figuraDuplicada.setRutaImg(this.rutaImg); // Suponiendo que tienes un atributo "color"

        // Si tienes otros atributos, asegúrate de copiarlos también

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
