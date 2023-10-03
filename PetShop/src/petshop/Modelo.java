package petshop;

import dominio.Producto;
import dominio.Cliente;

public class Modelo {

    public static void setItem(Producto producto) {
        LocalStorage.setItem("archivo_producto.ser", producto);
    }

    public static Producto getItemProducto(String nomArchivo) {
        return (Producto) LocalStorage.getItem(nomArchivo);
    }

    public static void setItemCliente(Cliente cliente) {
        LocalStorage.setItem("archivo_cliente.ser", cliente);
    }

    public static Cliente getItemCliente(String nomArchivo) {
        return (Cliente) LocalStorage.getItem(nomArchivo);
    }
}

