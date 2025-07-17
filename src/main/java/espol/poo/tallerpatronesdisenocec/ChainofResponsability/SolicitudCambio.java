/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espol.poo.tallerpatronesdisenocec.ChainofResponsability;

/**
 *
 * @author maza-
 */
public abstract class SolicitudCambio implements Solicitud{
    protected Solicitud siguiente;
    protected Producto producto;
    
    public SolicitudCambio(Producto producto){
        this.producto = producto;
    }

    @Override
    public void setSiguiente(Solicitud siguiente) {
        this.siguiente = siguiente;
    }
    
    @Override
    public abstract void iniciarProceso(String descripcion);

    @Override
    public abstract boolean comprobacion();
    

    
        
}
