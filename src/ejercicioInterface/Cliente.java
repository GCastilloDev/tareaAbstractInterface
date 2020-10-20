/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioInterface;

import java.util.ArrayList;

/**
 *
 * @author tavoGeek
 */
public class Cliente extends Persona {

    private String telefono;
    private ArrayList<Vehiculo> vehiculos;
    private String cuentaBancaria;

    public Cliente(String telefono, String cuentaBancaria, String DNI, String nombre, String apellido) {
        super(DNI, nombre, apellido);
        this.telefono = telefono;
        this.cuentaBancaria = cuentaBancaria;
        this.vehiculos = new ArrayList();
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }
    
    public String comprar() {
        return "Comprar...";
    }
    
    public String agregarVehiculo(Vehiculo vehiculo){
        this.vehiculos.add(vehiculo);
        return "Vehiculo agregado";
    }
    
    public String preguntarDuda() {
        return "Preguntar duda...";
    }

}
