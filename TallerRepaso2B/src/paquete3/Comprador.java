/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

/**
 *
 * @author natsu
 */
public class Comprador {

    private String nombres;
    private String cedula;

    public Comprador(String nombres, String cedula) {
        this.nombres = nombres;
        this.cedula = cedula;
    }

    @Override
    public String toString() {
        return String.format("Comprador\nnombres=%s\n,"
                + "cedula= %s\n", nombres, cedula);
    }
}
