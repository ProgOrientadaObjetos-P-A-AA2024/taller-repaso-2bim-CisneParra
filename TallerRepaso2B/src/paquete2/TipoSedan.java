/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

import paquete3.*;

/**
 *
 * @author natsu
 */
class TipoSedan extends Tipo {

    private double porcentajeDescuento;

    public TipoSedan(Comprador propietario, String marca,
             double precioBase, double porcentaje) {
        super(propietario, marca, precioBase);
        porcentajeDescuento = porcentaje;
    }

    @Override
    protected double calcularPrecioFinal() {
        double descuento = (precioBase * porcentajeDescuento) / 100;
        double seguroMecanico = precioBase * 0.01; // 1% del precio base
        return precioBase - descuento + seguroMecanico;
    }

    @Override
    public String toString() {
        return "TipoSedan{" + super.toString() + '}';
    }
}
