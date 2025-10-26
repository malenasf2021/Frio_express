/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import modelo.Producto;

/**
 *
 * @author maria
 */
public class ProductoControlador {
    private TreeMap <Integer, Producto> colProductos;

    public ProductoControlador() {
        this.colProductos = new TreeMap<>();// inicializo la lista treemap en el constructor
    }
    
    
    public void agregarProducto(Producto unProducto){
        colProductos.put(unProducto.getCodigo(), unProducto);
    }
    
    public List<Producto>RompeCadenaFrio(){
        List<Producto> productos = new ArrayList<>();
        for(Producto unProducto: colProductos.values()){
            if(unProducto.getTemperatura()> -18 && unProducto.getMinutos()>=30){
                productos.add(unProducto);
            }
        }
        
        return productos;
    }
}
