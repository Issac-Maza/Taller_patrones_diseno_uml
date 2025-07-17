/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espol.poo.tallerpatronesdisenocec.ChainofResponsability;

/**
 *
 * @author maza-
 */
public class ComprobarCoberturaGarantía extends SolicitudCambio{

    public ComprobarCoberturaGarantía(Producto producto) {
        super(producto);
    }

    @Override
    public void iniciarProceso(String descripcion) {
        if(comprobacion()){
            System.out.println("Comprobando si el fallo esta cubierot por la grantia ");
            
            avanzarSiguienteProceso(descripcion);
        }else{
            System.out.println("No apto para devolucion");
        }
    }

    //Aqui comprobamos si el fallo/caracteristica del producto lo cubre la garantia
    @Override
    public boolean comprobacion() {
        return true;
    }
    
    private void avanzarSiguienteProceso(String descripcion){
        if(this.siguiente != null){
            siguiente.iniciarProceso(descripcion);
        }else{
            System.out.println("Proceso terminado" + "\nProducto enlistado para el cambio");
        }
    }
    
}
