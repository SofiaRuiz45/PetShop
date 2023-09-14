package dominio;
import java.util.*;

<<<<<<< Updated upstream
import java.io.Serializable;

public class Producto implements Serializable {
    private String nombre;
    private float precio;
    private String cat;

    public Producto(String nombre, float precio, String cat) {
        this.nombre = nombre;
        this.precio = precio;
        this.cat = cat;
    }

    public String getNombre() {
        return nombre;
=======
public class Producto {
      String nombre;
    float precio;
    String cat;
    
    //array para almacenar productos
    private static ArrayList<Producto> arrayProductos = new ArrayList<>();

    
    public Producto(String nombre, float precio, String cat){
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
    public String getCategoria() {
        return cat;
    }
    public void setCategoria(String cat) {
        this.cat = cat;
    }

    // metodo para agregar productos al array
    public static void agregarProducto(Producto producto) {
        arrayProductos.add(producto);
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
>>>>>>> Stashed changes
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return cat;
    }

    public void setCategoria(String cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre + ", Precio: " + precio + ", Categoría: " + cat;
    }
}