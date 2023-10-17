package petshop;

import dominio.Producto;
import dominio.Cliente;
import java.util.ArrayList;

public class Controlador {
    public static void main(String[] args) {
        Modelo.cargarProductos(); // Cargar productos y clientes al inicio
        Modelo.cargarClientes();
        int opt = 0;
        while (opt != 4) {
            // menú principal
            opt = Vista.menuPrincipal();

            if (opt == 1) {
                System.out.println("\nSeleccionaste Menú Producto");
                int resp = Vista.menuProducto();

                if (resp == 1) {
                    System.out.println("Seleccionaste agregar un nuevo producto");
                    Producto producto = Vista.menuNuevoProducto();
                    Modelo.agregarProducto(producto);
                } else if (resp == 2) {
                    System.out.println("\nSeleccionaste mostrar productos");
                    ArrayList<Producto> busqueda = Modelo.buscarArrayProd();
                    Vista.mostrarListaProducto(busqueda);
                } else if (resp == 3) {
                    System.out.println("Seleccionaste Modificar producto");
                    ArrayList<Producto> busqueda = Modelo.buscarArrayProd();
                    
                    Producto productoModificado = Vista.modificarProducto(busqueda);
                    if (productoModificado != null) {
                        // El producto fue modificado, puedes realizar cualquier acción adicional aquí
                        System.out.println("Producto modificado: " + productoModificado);
                        Modelo.agregarProducto(productoModificado);
                    }
                } else if (resp == 4) {
                    System.out.println("Seleccionaste Eliminar producto");
                    ArrayList<Producto> busqueda = Modelo.buscarArrayProd();
                    Producto productoEliminado = Vista.eliminarProducto(busqueda);
                    if (productoEliminado != null) {
                        // El producto fue eliminado, puedes realizar cualquier acción adicional aquí
                        System.out.println("Producto eliminado: " + productoEliminado);
                    }
                }
            } else if (opt == 2) {
                // Opción para trabajar con clientes
                System.out.println("\nSeleccionaste Menú Cliente");
                int resp = Vista.menuCliente();

                if (resp == 1) {
                    System.out.println("Seleccionaste agregar un nuevo cliente");
                    Cliente cliente = Vista.agregarNuevoCliente();
                    Modelo.agregarCliente(cliente);
                } else if (resp == 2) {
                    System.out.println("Seleccionaste eliminar un cliente");
                    
                    ArrayList<Cliente> busqueda = Modelo.buscarArrayClien();
                    Cliente clienteEliminado = Vista.eliminarCliente(busqueda);
                    if (clienteEliminado != null) {
                        System.out.println("Cliente eliminado : " + clienteEliminado);
                    }

                } else if (resp == 3) {
                    System.out.println("Seleccionaste modificar un cliente");
                    ArrayList<Cliente> busqueda = Modelo.buscarArrayClien();
                    Cliente clienteModificado = Vista.modificarCliente(busqueda);
                    if (clienteModificado != null ) {
                        System.out.println("Cliente modificado: " + clienteModificado);
                         Modelo.agregarCliente(clienteModificado);
                    }
                } else if (resp == 4) {
                    System.out.println("Seleccionaste mostrar clientes");
                    ArrayList<Cliente> busquedaa = Modelo.buscarArrayClien();
                    Vista.mostrarListaClientes(busquedaa);
                } else if (resp == 5) {
                    System.out.println("Saliendo del programa...");
                } else {
                    System.out.println("Opción no válida. Intente de nuevo.");
                }
            }
        }
    }
}
