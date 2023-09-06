/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author merce
 */
public class producto {
      String nombre;
    float precio;
    Categoria cat;
    
    public productoInstaciado(String nombre, float precio, Categoria cat){
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
    public String getPrecio(String precio){
        return precio;
    }
    public void setPrecio(String precio){
        this.precio = precio;
    }
    public String getCategoria(Categoria cat){
        return cat;
    }
    public void setCategoria(Categoria cat){
        this.cat = cat;
    }
    public String toString(){
        return "producto: " + nombre + ", precio: "+ precio+ "y categoria: "+ cat;
    }
}
