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
class TipoCamioneta extends Tipo {

    private double porcentajeAdicionalImportacion;

    public TipoCamioneta(Comprador propietario, String marca
            , double precioBase, double porcentaje) {
        super(propietario, marca, precioBase);
        porcentajeAdicionalImportacion = porcentaje;
    }

    @Override
    protected double calcularPrecioFinal() {
        double adicionalImportacion = (precioBase 
                * porcentajeAdicionalImportacion) / 100;
        double seguroMantenimiento = adicionalImportacion * 1.5;
        return precioBase + adicionalImportacion + seguroMantenimiento;
    }

    @Override
    public String toString() {
        return "TipoCamioneta{" + super.toString() + '}';
    }
}
