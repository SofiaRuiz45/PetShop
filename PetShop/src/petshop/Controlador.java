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
                System.out.println("\nSeleccionaste 1");
                int resp = Vista.MenuProducto();
                if (resp == 1) {
                    System.out.println("Seleccionaste 1  \n nota: menu de agregar un nuevo producto");
                    Producto producto = Vista.menuNuevoProducto();
                    Modelo.setItem(producto);
                }
            if (resp == 2) {
                System.out.println("Seleccionaste 2 \n nota: menu de mostrar producto");
                Producto producto = (Producto) Modelo.getItem("archivo.ser");
                if (producto != null) {
                    // Haz lo que necesites con el objeto Producto
                    System.out.println(producto);
                } else {
                    System.out.println("No hay productos para mostrar.");
                }
            }

                if (resp == 3){
                    System.out.println("Seleccionaste 3");
                }
                if (resp == 4){
                    System.out.println("Seleccionaste 4");
                }
                else if (resp != 1 && resp != 2 && resp != 3 && resp != 4){
                    System.out.println("\nSeleccione una opcion correcta");
                }
            }        
//                System.out.println("\nSeleccionaste 2 ");
//                int opt1 = Vista.menuCategoria();
//                switch (opt1) {
//                    case 1:
//                        // Añadir categoria
//                        Categoria unaCategoria = Vista.nuevaCategoria();
//                        //Modelo.anadirCategoria(unaCategoria);
//                        System.out.println("");
//                        break;
//                    case 2:
//                        // Eliminar categoria
//                        int idCat = Vista.obtenerId_Categoria();
//                        //Modelo.eliminarCategoria(idCat);
//                        // Vista.mostrarCategorias(categorias);
//                        break;
//                    case 3:
//                        // Mostrar categorias
//                        System.out.println("Categorías:");
//                        //ArrayList<Categoria> categorias = Modelo.obtenerCategorias();
//                        //Vista.mostrarCategorias(categorias);
//                        break;
//                    default:
//                        break;
                }
            } 
             
        }


