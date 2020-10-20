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
public class test {

    public static void main(String[] args) {

        Propietario propietario = new Propietario("Siempre viva 100", "RFC1234", "1234567890", "114455", "Homer", "Simpson");
        Cliente cliente = new Cliente("12345", "HSBC 12345", "114455", "Bart", "Simpson");
        Moto moto = new Moto(true, 2, "rojo", "1234", "Honda", "CBR250");
        Coche coche = new Coche(110, 105, 4, "1234", "Chevrolet", "Spark");

        System.out.println(propietario.leer());
        System.out.println(propietario.saludar());
        System.out.println(propietario.despedirse());
        System.out.println(propietario.cobrar());
        System.out.println(propietario.darCambio());
        System.out.println(propietario.inscribir());

        System.out.println("------------------------------------------");

        System.out.println(cliente.leer());
        System.out.println(cliente.saludar());
        System.out.println(cliente.despedirse());
        System.out.println(cliente.agregarVehiculo(moto));
        System.out.println(cliente.agregarVehiculo(coche));
        System.out.println(cliente.comprar());
        System.out.println(cliente.preguntarDuda());

    }
}
