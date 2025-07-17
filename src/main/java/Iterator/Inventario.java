/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author CltControl
 */
public class Inventario {
    private List<Prod> Productos;

    public Inventario() {
        Productos = new ArrayList<>();
    }
    
    public Iterator<Prod> getIterator(){
        return Productos.iterator();
    }
}