/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espol.poo.tallerpatronesdisenocec.ChainofResponsability;

/**
 *
 * @author maza-
 */
public class ComprobarExistencia extends SolicitudCambio{

    public ComprobarExistencia(Producto producto) {
        super(producto);
    }

    @Override
    public void iniciarProceso(String descripcion) {
        if(comprobacion()){
            System.out.println("Verificando existencia en la bodega....");
            avanzarSiguienteProceso(descripcion);
        }else{
            System.out.println("Producto no apto para devolver");
        }
    }
    
    //Aqui vemos si el fallo del producto existe en la bodega
    @Override
    public boolean comprobacion() {
        //Logica del negocio
        return true;
    }
    
    private void avanzarSiguienteProceso(String descripcion){
        if(this.siguiente != null){
            siguiente.iniciarProceso(descripcion);
        }else{
            System.out.println("Procedimiento terminado" + "\nProducto listo a devolver");
        }
    }
}
