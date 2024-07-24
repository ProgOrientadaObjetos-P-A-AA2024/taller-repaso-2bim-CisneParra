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
class TipoSuv extends Tipo {

    private double porcentajeSeguro;

    public TipoSuv(Comprador propietario, String marca, double precioBase,
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
        return "TipoSuv{" + super.toString() + '}';
    }
}
