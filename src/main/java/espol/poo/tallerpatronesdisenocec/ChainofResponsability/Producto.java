/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espol.poo.tallerpatronesdisenocec.ChainofResponsability;

import java.time.LocalDate;

/**
 *
 * @author maza-
 */
public class Producto {
    String nombre;
    int precio;
    LocalDate garantia;
    
    public Producto(String nombre, int precio, LocalDate garantía){
        this.nombre = nombre;
        this.precio = precio;
        this.garantia = garantia;
    }

    public String getNombre() {
        return nombre;
    }
    
    public int getPrecio(){
        return this.precio;
    }
    
    public LocalDate getGarantia(){
        return this.garantia;
    }
    
}
