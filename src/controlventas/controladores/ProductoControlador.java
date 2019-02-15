/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlventas.controladores;

import java.util.*;
import controlventas.modelos.Producto;
/**
 *
 * @author chrisloops
 */
public class ProductoControlador {
    public static ProductoControlador instance;
    private ArrayList<Producto> productos;
    
   
    public ProductoControlador(){
        this.productos = new ArrayList<Producto>();
        this.productos.add(new Producto(1, "Jamón", 18.90, "Jamon marca dollar."));
        this.productos.add(new Producto(2, "Ketchup", 6.60, "Jamon marca dollar."));
        this.productos.add(new Producto(3, "Mayonesa", 9.50, "Jamon marca dollar."));
        this.productos.add(new Producto(4, "Mostaza", 11.50, "Jamon marca dollar."));
        this.productos.add(new Producto(5, "Frijoles", 20.80, "Jamon marca dollar."));
        this.productos.add(new Producto(6, "Arroz", 13.20, "Jamon marca dollar."));
        this.productos.add(new Producto(7, "Avichuelas", 2.25, "Jamon marca dollar."));
        this.productos.add(new Producto(8, "Lentejas", 1.75, "Jamon marca dollar."));
        this.productos.add(new Producto(9, "Salsa Mort", 25.00, "Jamon marca dollar."));
        this.productos.add(new Producto(10, "Mantequilla", 3.60, "Jamon marca dollar."));
    }
    
    public static ProductoControlador instance(){
        if(instance == null){
            instance = new ProductoControlador();
        }
        
        return instance;
    }
    
    public void agregarProducto(Producto producto){
        this.productos.add(producto);
    }
    
    public Producto buscarProducto(int idProducto){
        for( Producto producto : this.productos ){
            if(idProducto == producto.getId()){
                return producto;
            }
        }
                
        return null;
    }
}
