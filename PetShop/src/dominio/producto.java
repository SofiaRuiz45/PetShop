/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.util.*;

/**
 *
 * @author merce
 */
public class Producto {
      String nombre;
    float precio;
    Categoria cat;
    //Array para almacenar productos
    private static ArrayList<Producto> arrayProductos = new ArrayList<>();
    
    public Producto(String nombre, float precio, Categoria cat){
        super();
        this.nombre= nombre;
        this.precio= precio;
        this.cat= cat;
    }
    public String getNombre(String nombre){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public float getPrecio(float precio){
        return precio;
    }
    public void setPrecio(float precio){
        this.precio = precio;
    }
    public String getCategoria(Categoria cat){
        return cat;
    }
    public void setCategoria(Categoria cat){
        this.cat = cat;
    }
     // metodo para eliminar productos del array
public static void eliminarProducto(Producto producto) {
        arrayProductos.remove(producto);
    }

    // metodo para mostrar el array
    public static ArrayList<Producto> mostrarArray() {
        return arrayProductos;
    }
      @Override
    public String toString(){
        return "producto: " + nombre + ", precio: "+ precio+ "y categoria: "+ cat;
    }
}
