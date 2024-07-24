/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

import paquete2.*;
import java.util.*;

/**
 *
 * @author natsu
 */
public class Concesionaria {

    private ArrayList<Tipo> listadoTipos;
    private String nombre;
    private double ventasTotales;
    private double costoTipoMasCaro;
    private double costoTipoMasBarato;

    public Concesionaria(String nombre) {
        this.nombre = nombre;
        this.listadoTipos = new ArrayList<>();
        this.ventasTotales = 0;
        this.costoTipoMasCaro = Double.MIN_VALUE;
        this.costoTipoMasBarato = Double.MAX_VALUE;
    }

    public void agregarTipo(Tipo vehiculo) {
        listadoTipos.add(vehiculo);
        actualizarVentas(vehiculo);
    }

    private void actualizarVentas(Tipo t) {
        double precioFinal = t.obtenerPrecioFinal();
        ventasTotales += precioFinal;
        costoTipoMasCaro = Math.max(costoTipoMasCaro, precioFinal);
        costoTipoMasBarato = Math.min(costoTipoMasBarato, precioFinal);
    }

    @Override
    public String toString() {
        return String.format("Concesionaria\n"
                + "nombre=%s\n"
                + "listadoTipos=%s\n"
                + "ventasTotales=%.2f\n"
                + "costoTipoMasCaro=%.2f\n"
                + "costoTipoMasBarato=%.2f\n",
                nombre, listadoTipos, ventasTotales, costoTipoMasCaro
                , costoTipoMasBarato);
    }
}
