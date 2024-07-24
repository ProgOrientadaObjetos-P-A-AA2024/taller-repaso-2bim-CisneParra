/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

import paquete3.*;

import paquete2.*;

/**
 *
 * @author natsu
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Comprador comprador1 = new Comprador("Juan Pérez", "123456789");
        Comprador comprador2 = new Comprador("Ana Gómez", "987654321");
        Comprador comprador3 = new Comprador("Luis Martínez", "456789123");

        TipoSedan sedan1 = new TipoSedan(comprador1, "Toyota", 20000, 10);
        TipoSedan sedan2 = new TipoSedan(comprador2, "Honda", 22000, 5);
        TipoSuvan suv = new TipoSuvan(comprador3, "Ford", 30000, 10);
        TipoCamioneta camioneta = new TipoCamioneta(comprador1, "Chevrolet", 25000, 15);

        Concesionaria concesionaria = new Concesionaria("Autos del Mundo");
        concesionaria.agregarTipo(sedan1);
        concesionaria.agregarTipo(sedan2);
        concesionaria.agregarTipo(suv);
        concesionaria.agregarTipo(camioneta);

        System.out.println(concesionaria);
    }

}
