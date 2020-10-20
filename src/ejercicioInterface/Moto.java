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
public class Moto extends Vehiculo {

    private Boolean limitador;
    private int llantas;
    private String color;

    public Moto(Boolean limitador, int llantas, String color, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.limitador = limitador;
        this.llantas = llantas;
        this.color = color;
    }

    public Boolean getLimitador() {
        return limitador;
    }

    public void setLimitador(Boolean limitador) {
        this.limitador = limitador;
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String abrirCanastilla() {
        return "Abriendo canastilla...";
    }

    public String cerrarCanastilla() {
        return "Cerrando canastilla";
    }

    public String ponerGasolina() {
        return "Poniendo gasolina";
    }
}
