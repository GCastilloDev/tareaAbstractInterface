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
public class Coche extends Vehiculo {

    private String marca;
    private String modelo;
    private int puertas;

    public Coche(String marca, String modelo, int puertas) {
        this.marca = marca;
        this.modelo = modelo;
        this.puertas = puertas;
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

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String arrancar() {
        return "Arrancando el coche " + this.modelo;
    }

    public String acelerar() {
        return "Acelerando el coche " + this.modelo;
    }

    public String frenar() {
        return "Frenando el coche " + this.modelo;
    }

    public String apagar() {
        return "Apango el coche " + this.modelo;
    }

    public String cambiarAceite() {
        return "Cambiando el aceite al coche " + this.modelo;
    }

    public String prenderParabrisas() {
        return "Limpia parabrisas encendido...";
    }

    public String apagarParabrisas() {
        return "Limpia parabrisas apagado...";
    }

}
