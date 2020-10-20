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
public class Coche extends Vehiculo{
    
    private int anchura;
    private int altura;
    private int puertas;

    public Coche(int anchura, int altura, int puertas, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.anchura = anchura;
        this.altura = altura;
        this.puertas = puertas;
    }

    public int getAnchura() {
        return anchura;
    }

    public void setAnchura(int anchura) {
        this.anchura = anchura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    
    public String abrirCofre() {
        return "Abriendo cofre...";
    }
    
    public String cerrarCofre() {
        return "Cerrando cofre...";
    }
    
    public String prenderLuces() {
        return "Prendiendo luces";
    }
}
