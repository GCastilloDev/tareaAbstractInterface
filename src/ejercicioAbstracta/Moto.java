/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioAbstracta;

/**
 *
 * @author tavoGeek
 */
public class Moto extends Vehiculo{
    
    private String marca;
    private String modelo;
    private int anio;

    public Moto(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
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

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String arrancar() {
        return "Arrancando la moto...";
    }

    public String acelerar() {
        return "Acelerando la moto...";
    }

    public String frenar() {
        return "Frenando la moto...";
    }

    public String apagar() {
        return "Apagando la moto...";
    }
    
    public String cambiarLlanta() {
        return "Cambiando la llanta...";
    }
    
    public String lavarMoto() {
        return "Lavando la moto...";
    }
    
    public String cambiarFrenos() {
        return "Cambiando los frenos...";
    }
    
}
