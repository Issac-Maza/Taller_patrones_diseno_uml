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
public class Cliente {
    
    public static void main(String[] args) {
        Producto product = new Producto("Vaso de ceramica",1200, LocalDate.of(2025, 7, 17));

        SolicitudCambio primerProceso = new VerificarGarantía(product);
        SolicitudCambio segundoProceso = new ComprobarCoberturaGarantía(product);
        SolicitudCambio tercerProceso = new ComprobarExistencia(product);
        SolicitudCambio cuartoProceso = new VerificarPrecio(product);
        SolicitudCambio quintoProceso = new AprobacionGerencial(product);
        
        primerProceso.setSiguiente(segundoProceso);
        segundoProceso.setSiguiente(tercerProceso);
        tercerProceso.setSiguiente(cuartoProceso);
        cuartoProceso.setSiguiente(quintoProceso);
        
        primerProceso.iniciarProceso("Cambiar vaso de ceramica roto de p");

        
    }

    
}
