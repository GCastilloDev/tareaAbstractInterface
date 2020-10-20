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
public class Vehiculo implements Identificacion{
    
    private String matricula;
    private String marca;
    private String modelo;

    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String acelerar() {
        return "Acelerando " + this.modelo;
    }
    
    public String frenar() {
        return "Frenar " + this.modelo;
    }
    
    public String encender() {
        return "Encender " + this.modelo;
    }

    public String identificarte() {
        return "Hola soy " + this.modelo;
    }
    
    
}
