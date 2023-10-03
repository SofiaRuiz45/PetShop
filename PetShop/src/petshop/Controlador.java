package petshop;

import dominio.Producto;
import dominio.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

public class Controlador {

    // Lista estática para almacenar productos
    private static ArrayList<Producto> arrayProductos = new ArrayList<>();

    public static void agregarProducto(Producto producto) {
        arrayProductos.add(producto);
    }

    public static void main(String[] args) {
        int opt = 0;
        while (opt != 4) {
            // menuPrincipal
            opt = Vista.menuPrincipal();

            if (opt == 1) {
                System.out.println("\nSeleccionaste Menu Producto");
                int resp = Vista.menuProducto();

                if (resp == 1) {
                    System.out.println("Seleccionaste agregar un nuevo producto");
                    Producto producto = Vista.menuNuevoProducto();
                    agregarProducto(producto);
                    Modelo.setItem(producto);

                } else if (resp == 2) {
                    System.out.println("\nSeleccionaste mostrar productos");
                    Vista.mostrarListaProducto(arrayProductos);

                } else if (resp == 3) {
                    System.out.println("Seleccionaste Modificar producto");
                    Producto productoModificado = Vista.modificarProducto(arrayProductos);
                    if (productoModificado != null) {
                        // El producto fue modificado, puedes realizar cualquier acción adicional aquí
                        System.out.println("Producto modificado: " + productoModificado);
                    }

                } else if (resp == 4) {
                    System.out.println("Seleccionaste Eliminar producto");
                    Producto productoEliminado = Vista.eliminarProducto(arrayProductos);
                    if (productoEliminado != null) {
                        // El producto fue eliminado, puedes realizar cualquier acción adicional aquí
                        System.out.println("Producto eliminado: " + productoEliminado);
                    }
                }

            } else if (opt == 2) {
                // Opción para trabajar con clientes
                System.out.println("\nSeleccionaste Menu Cliente");
                int resp = Vista.menuCliente();

                if (resp == 1) {
                    System.out.println("Seleccionaste agregar un nuevo cliente");
                    // Agregar aquí la lógica para agregar un nuevo cliente
                } else if (resp == 2) {
                    System.out.println("Seleccionaste eliminar un cliente");
                    // Agregar aquí la lógica para eliminar un cliente
                } else if (resp == 3) {
                    System.out.println("Seleccionaste modificar un cliente");
                    // Agregar aquí la lógica para modificar un cliente
                } else if (resp == 4) {
                    System.out.println("Seleccionaste mostrar clientes");
                    // Agregar aquí la lógica para mostrar clientes
                } else if (resp == 5) {
                    System.out.println("Saliendo del programa...");
                } else {
                    System.out.println("Opción no válida. Intente de nuevo.");
                }
            }
        }
    }
}
