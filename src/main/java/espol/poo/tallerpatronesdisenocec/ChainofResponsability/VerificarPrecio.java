/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package espol.poo.tallerpatronesdisenocec.ChainofResponsability;

/**
 *
 * @author maza-
 */
public class VerificarPrecio extends SolicitudCambio{

    public VerificarPrecio(Producto producto) {
        super(producto);
    }
    
    public Producto cambiarProducto(){
        return new Producto(producto.getNombre()+"Version Nueva",producto.getPrecio(),producto.getGarantia());
    }

    @Override
    public void iniciarProceso(String descripcion) {
        System.out.println("Verificando si el valor de producto supera los 1000 USD....");
        if(comprobacion()){
            avanzarSiguienteProceso(descripcion);
        }else{
            System.out.println("El producto cuesta menos de los 1000USD, asi que no necesita aprobacion gerencial");
        }
    }

    //Aqui verificamos si el producto no supere los 1000
    @Override
    public boolean comprobacion() {
        //Logica del negocio
        if(producto.getPrecio()>1000){
            return true;
        }
        return false;
    }
    
    private void avanzarSiguienteProceso(String descripcion){
        if(this.siguiente!=null){
            siguiente.iniciarProceso(descripcion);
        }else{
            System.out.println("Proceso terminado.");
            System.out.println("Producto listo para para el cambio");
        }
    }
    
}
