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
public class TipoSuvan extends Tipo {

    private double porcentajeSeguro;

    public TipoSuvan(Comprador propietario, String marca, double precioBase,
             double porcentaje) {
        super(propietario, marca, precioBase);
        porcentajeSeguro = porcentaje;
    }

    @Override
    protected double calcularPrecioFinal() {
        return precioBase + (precioBase * porcentajeSeguro / 100);
    }

    @Override
    public String toString() {
        return "TipoSuv\n" + super.toString();
    }
}
