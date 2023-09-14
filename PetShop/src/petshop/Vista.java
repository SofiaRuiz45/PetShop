package petshop;

import dominio.Categoria;
import dominio.Producto;
import java.util.ArrayList;
import java.util.Scanner;

public class Vista {

    public static int menuPrincipal() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Bienvenido a Pulguitas PetShop");
        System.out.println("Seleccione 1 para gestionar productos");
        System.out.println("Seleccione 2 para gestionar categorías");
        System.out.println("Seleccione 3 para realizar una venta");
        System.out.println("Seleccione 4 para finalizar");
        int resp = lector.nextInt();

        return resp;
    }

    public static int MenuProducto() {
        Scanner datos = new Scanner(System.in);
        System.out.println("1-Mostrar productos");
        System.out.println("2-Añadir producto");
        System.out.println("3-Modificar producto");
        System.out.println("4-Eliminar producto");
        int opt = datos.nextInt();
        return opt;
    }

    // Opción 1 de menuProducto
    public static Producto nuevoProducto() {
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        String nom = datos.next();
        System.out.println("Ingrese el precio");
        float preci = datos.nextFloat();
        System.out.println("Ingrese la categoría");
        String catt = datos.next();

        // Devuelve el objeto Producto creado
        Producto producto = new Producto(nom, preci, catt);
        return producto;
    }

    public static int menuCategoria() {
        Scanner datos2 = new Scanner(System.in);
        System.out.println("1-Agregar una categoría");
        System.out.println("2-Eliminar una categoría");
        System.out.println("3-Mostrar Categorías");
        int opc = datos2.nextInt();
        return opc;
    }

    // Añadir categoría
    public static Categoria nuevaCategoria() {
        Scanner datos3 = new Scanner(System.in);
        System.out.print("Ingresa el nombre de la categoría\n");
        String catNue = datos3.next();
        System.out.println("Ingresa el código de la categoría\n");
        int numCat = datos3.nextInt();
        Categoria unaCategoria = new Categoria(catNue, numCat);
        Modelo.anadirCategoria(unaCategoria);

        return unaCategoria;
    }

    // Mostrar categorías
    public static void mostrarCategorias(ArrayList<Categoria> categorias) {
        System.out.println("Categorías:");
        for (Categoria categoria : categorias) {
            System.out.println(categoria);
        }
    }

    // Eliminar categoría
    public static int obtenerId_Categoria() {
        Scanner datos4 = new Scanner(System.in);
        System.out.println("Categorías:");
        ArrayList<Categoria> categorias = Modelo.obtenerCategorias();
        mostrarCategorias(categorias);
        System.out.println("Ingresa el ID de la categoría a borrar");
        int num = datos4.nextInt();
        return num;
    }
}
