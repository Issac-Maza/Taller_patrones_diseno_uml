/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package espol.poo.tallerpatronesdisenocec.ChainofResponsability;

/**
 *
 * @author maza-
 */
public interface Solicitud {
    public void setSiguiente(Solicitud solicitud);
    public void iniciarProceso(String descripcion);
    public boolean comprobacion();//Todos los procesos tienen un valor de verdadero o falso para seguir con el proceso de devolucion
    
}
