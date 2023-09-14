package petshop;

import dominio.Categoria;
import dominio.Producto;
import java.util.ArrayList;

public class Controlador {

    // Array para almacenar productos
    ArrayList<Producto> arrayProductos = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        arrayProductos.add(producto);
    }

    public static void main(String[] args) {
        int opt = 0;
        while (opt != 4) {
            opt = Vista.menuPrincipal(); // menuPrincipal

            if (opt == 1) {
                System.out.println("Seleccionaste 1");
                int resp = Vista.MenuProducto();
                if (resp == 1) {
                    Producto producto = Vista.nuevoProducto();

                    // Muestra lo que ingresaste de forma crota
                    // System.out.println("Producto ingresado:");
                    // System.out.println("Nombre: " + producto.getNombre());
                    // System.out.println("Precio: " + producto.getPrecio());
                    // System.out.println("Categoría: " + producto.getCategoria());
                    Modelo.agregarProducto(producto);
                }
            } else if (opt == 2) {
                System.out.println("Seleccionaste 2 ");
                int opt1 = Vista.menuCategoria();
                switch (opt1) {
                    case 1:
                        // Añadir categoria
                        Categoria unaCategoria = Vista.nuevaCategoria();
                        Modelo.anadirCategoria(unaCategoria);
                        System.out.println("");
                        break;
                    case 2:
                        // Eliminar categoria
                        int idCat = Vista.obtenerId_Categoria();
                        Modelo.eliminarCategoria(idCat);
                        // Vista.mostrarCategorias(categorias);
                        break;
                    case 3:
                        // Mostrar categorias
                        System.out.println("Categorías:");
                        ArrayList<Categoria> categorias = Modelo.obtenerCategorias();
                        Vista.mostrarCategorias(categorias);
                        break;
                    default:
                        break;
                }
            } else {
                System.out.println("Programa finalizado");
            }
        }
    }
}
package petshop;

import dominio.Categoria;
import dominio.Producto;
import java.util.ArrayList;

public class Controlador {
    // Array para almacenar productos
    ArrayList<Producto> arrayProductos = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        arrayProductos.add(producto);
    }

    public static void main(String[] args) {
        int opt = 0;
        while (opt != 4) {
            opt = Vista.menuPrincipal(); // menuPrincipal

            if (opt == 1) {
                System.out.println("Seleccionaste 1");
                int resp = Vista.MenuProducto();
                if (resp == 1) {
                    Producto producto = Vista.nuevoProducto();

                    // Muestra lo que ingresaste de forma crota
                    // System.out.println("Producto ingresado:");
                    // System.out.println("Nombre: " + producto.getNombre());
                    // System.out.println("Precio: " + producto.getPrecio());
                    // System.out.println("Categoría: " + producto.getCategoria());
                    Modelo.agregarProducto(producto);
                }
            } else if (opt == 2) {
                System.out.println("Seleccionaste 2 ");
                int opt1 = Vista.menuCategoria();
                switch (opt1) {
                    case 1:
                        // Añadir categoria
                        Categoria unaCategoria = Vista.nuevaCategoria();
                        Modelo.anadirCategoria(unaCategoria);
                        System.out.println("");
                        break;
                    case 2:
                        // Eliminar categoria
                        int idCat = Vista.obtenerId_Categoria();
                        Modelo.eliminarCategoria(idCat);
                        // Vista.mostrarCategorias(categorias);
                        break;
                    case 3:
                        // Mostrar categorias
                        System.out.println("Categorías:");
                        ArrayList<Categoria> categorias = Modelo.obtenerCategorias();
                        Vista.mostrarCategorias(categorias);
                        break;
                    default:
                        break;
                }
            } else {
                System.out.println("Programa finalizado");
            }
        }
    }
}
