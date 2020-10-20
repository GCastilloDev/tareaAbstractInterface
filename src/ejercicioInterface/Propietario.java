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
public class Propietario extends Persona {

    private String direccion;
    private String RFC;
    private String telefono;

    public Propietario(String direccion, String RFC, String telefono, String DNI, String nombre, String apellido) {
        super(DNI, nombre, apellido);
        this.direccion = direccion;
        this.RFC = RFC;
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String inscribir() {
        return "Inscribiendo...";
    }

    public String cobrar() {
        return "Cobrando...";
    }

    public String darCambio() {
        return "Dando cambio...";
    }
}
