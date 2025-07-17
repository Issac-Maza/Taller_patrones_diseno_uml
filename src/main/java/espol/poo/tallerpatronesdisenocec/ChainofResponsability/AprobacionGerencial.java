/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espol.poo.tallerpatronesdisenocec.ChainofResponsability;

/**
 *
 * @author maza-
 */
public class AprobacionGerencial extends SolicitudCambio{

    public AprobacionGerencial(Producto producto) {
        super(producto);
    }

    @Override
    public void iniciarProceso(String descripcion) {
        if(comprobacion()){
            System.out.println("Gerente: Se aprobó el cambio " + descripcion);
            
        }else{
            System.out.println("No era necesario la aprobacion del cliente");
        }
    }

    @Override
    public boolean comprobacion() {
        return true;
    }
    
    /*private Producto cambiodeProducto(){
        return new Producto(this.producto.getNombre()+"-N°1",this.producto.precio,this.producto.garantia);
    }*/
    private void avanzarSiguienteProceso(String descripcion){
        if(this.siguiente != null){
            siguiente.iniciarProceso(descripcion);
        }else{
            System.out.println("Proceso terminado" + "\nProducto enlistado para el cambio");
        }
    }
}
