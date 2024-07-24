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
public abstract class Tipo {

    protected Comprador propietario;
    protected String marca;
    protected double precioBase;

    public Tipo(Comprador propietario, String marca, double precioBase) {
        this.propietario = propietario;
        this.marca = marca;
        this.precioBase = precioBase;
    }

    protected abstract double calcularPrecioFinal();

    public void establecerPropietario(Comprador p) {
        propietario = p;
    }

    public void establecerMarca(String m) {
        marca = m;
    }

    public Comprador obtenerComprador() {
        return propietario;
    }

    public String obtenerMarca() {
        return marca;
    }

    public double obtenerPrecioFinal() {
        return calcularPrecioFinal();
    }

    @Override
    public String toString() {
        return String.format("Vehiculo\n propietario=%s\n, marca= %s\n,"
                + " precioBase= %.2f\n, precioFinal=%.2f \n",
                propietario, marca, precioBase, obtenerPrecioFinal());
    }
}
