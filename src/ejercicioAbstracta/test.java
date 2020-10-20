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
public class test {

    public static void main(String[] args) {

        Moto miMoto = new Moto("Honda", "CBR 250", 2020);

        System.out.println(miMoto.arrancar());
        System.out.println(miMoto.acelerar());
        System.out.println(miMoto.frenar());
        System.out.println(miMoto.apagar());
        System.out.println(miMoto.getAnio());
        System.out.println(miMoto.getMarca());
        System.out.println(miMoto.getModelo());
        System.out.println(miMoto.cambiarFrenos());
        System.out.println(miMoto.cambiarLlanta());
        System.out.println(miMoto.lavarMoto());
        
        Coche miCoche = new Coche("Ford", "Mustang", 2);
        
        System.out.println(miCoche.arrancar());
        System.out.println(miCoche.acelerar());
        System.out.println(miCoche.frenar());
        System.out.println(miCoche.apagar());
        System.out.println(miCoche.getMarca());
        System.out.println(miCoche.getModelo());
        System.out.println(miCoche.getPuertas());
        System.out.println(miCoche.cambiarAceite());
        System.out.println(miCoche.prenderParabrisas());
        System.out.println(miCoche.apagarParabrisas());

    }
}
