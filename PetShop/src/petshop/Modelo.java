package petshop;

import dominio.Categoria;
import dominio.Producto;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Modelo {
    private static ArrayList<Categoria> listaCategorias = new ArrayList<>();

    public static void agregarProducto(Producto producto) {
        try {
            FileOutputStream archivoSalida = new FileOutputStream("archivo.ser");
            ObjectOutputStream objetoSalida = new ObjectOutputStream(archivoSalida);
            objetoSalida.writeObject(producto);
            objetoSalida.close();
            archivoSalida.close();
            System.out.println("Objeto serializado y guardado en archivo.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    public static void eliminarProducto(ArrayList<Categoria> listaClientes, int id) {
        for (int i = 0; i < listaClientes.size(); i++) {
            Producto producto = listaCategoria.get(i);
            if (cliente.getIdCliente() == id) {
                listaClientes.remove(i);
                System.out.println("Cliente eliminado con éxito.");
                return;
            }
        }
        System.out.println("Cliente no encontrado. No se pudo eliminar.");
    }
    */

    public static void anadirCategoria(Categoria unaCategoria) {
        if (!listaCategorias.contains(unaCategoria)) {
            listaCategorias.add(unaCategoria);
        }
    }
}
