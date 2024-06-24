/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.io.Serializable;
import javax.persistence.Entity;

import javax.persistence.Id;


@Entity
public class imagenActividad implements Serializable {  
    
    private String nombre; 
    
    
    @Id
    private String nombreActividad;
    
    private String UrlVideo;

    
    public imagenActividad() {
    }
    
    public imagenActividad(String nombre, String nombreActividad, String UrlVideo) {
        this.nombre = nombre;
        this.nombreActividad = nombreActividad;
        this.UrlVideo = UrlVideo;
    }

    // Getters y setters para nombre y ruta
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public String getnombreActividad() {
        return nombreActividad;
    }

    public void setnombreActividad(Actividad actividad) {
        this.nombreActividad = nombreActividad;
    }
    
    public String getUrlVideo() {
        return UrlVideo;
    }
}