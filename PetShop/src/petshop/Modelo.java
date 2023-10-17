package petshop;

import dominio.Producto;
import dominio.Cliente;
import java.util.ArrayList;

public class Modelo {
    public static void cargarProductos() {
        ArrayList<Producto> productos = getItemProductos("archivo_producto.txt");
        if (productos != null) {
            arrayProductos = productos;
        }
    }

    public static void cargarClientes() {
        ArrayList<Cliente> clientes = (ArrayList<Cliente>) LocalStorage.getItem("archivo_cliente.txt");
        if (clientes != null) {
            arrayClientes = clientes;
        }
    }
    private static ArrayList<Producto> arrayProductos = new ArrayList<>();
    private static ArrayList<Cliente> arrayClientes = new ArrayList<>();
    
        public static ArrayList<Producto> getItemProductos(String nomArchivo) {
        return (ArrayList<Producto>) LocalStorage.getItem(nomArchivo);
    }

    public static Cliente getItemCliente(String nomArchivo) {
        return (Cliente) LocalStorage.getItem(nomArchivo);
    }

    public static void agregarProducto(Producto producto) {
        arrayProductos.add(producto);
        guardarArrayProductos(arrayProductos);
    }

    public static ArrayList<Producto> buscarArrayProd() {
        return arrayProductos;
    }

    public static ArrayList<Producto> eliminarProducto() {
        arrayProductos.remove(productoEliminado);
    }
    
    public static void agregarCliente(Cliente cliente) {
        arrayClientes.clear();
        arrayClientes.add(cliente);
        guardarArrayClientes(arrayClientes);
    }

    public static ArrayList<Cliente> buscarArrayClien() {
        return arrayClientes;
    }
    
    public static void guardarArrayProductos(ArrayList<Producto> arrayProductos) {
        if (arrayProductos != null) {
            LocalStorage.setItem("archivo_producto.txt", arrayProductos);
        } else {
            ArrayList<Producto> book = new ArrayList<Producto>();
            LocalStorage.setItem("archivo_producto.txt", book);
        }
    }

    public static void guardarArrayClientes(ArrayList<Cliente> arrayClientes) {
        if (arrayClientes != null) {
            LocalStorage.setItem("archivo_cliente.txt", arrayClientes);
        } else {
            ArrayList<Cliente> book = new ArrayList<Cliente>();
            LocalStorage.setItem("archivo_cliente.txt", book);
        }
    }





}
