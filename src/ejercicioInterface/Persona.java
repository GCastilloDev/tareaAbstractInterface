/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioInterface;

/**
 *
 * @author tavoGeek
 */
public class Persona implements Identificacion{

    private String DNI;
    private String nombre;
    private String apellido;

    public Persona(String DNI, String nombre, String apellido) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public String leer() {
        return "Leyendo...";
    }
    
    public String saludar() {
        return "Holaaa";
    }
    
    public String despedirse() {
        return "Hasta luego";
    }

    public String identificarte() {
        return "Hola soy " + this.nombre;
    }  

}
