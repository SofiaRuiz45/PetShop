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
    
    public producto(String nombre, float precio, Categoria cat){
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
      @Override
    public String toString(){
        return "producto: " + nombre + ", precio: "+ precio+ "y categoria: "+ cat;
    }
}
