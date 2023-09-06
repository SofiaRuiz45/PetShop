package petshop;
import java.util.Scanner;

/**
 *
 * @author merce
 */
public class Vista {
    
    public static int menuPrincipal(){
            Scanner lector= new Scanner(System.in);
            System.out.println("Bienvenido a pulgitas PetShop");
            System.out.println("Seleccione 1 para gestionar productos");
            System.out.println("Seleccione 2 para gestionar categorias");
            System.out.println("Seleccione 3 para realizar una venta");
            int resp=lector.nextInt();
            
            return resp;
    }public static int MenuProducto(){
        Scanner datos = new Scanner(System.in);
        System.out.println("1-Añadir producto\n 2- Eliminar producto\n 3-Modificar producto");
        int opt = datos.nextInt();
        return opt;
    }
    //opcion 1 de menuProducto
   public static void nuevoProducto(){
        Scanner datos= new Scanner (System.in);
        System.out.println("ingrese el nombre");
        String nom = datos.next();
        System.out.println("Ingrese el precio");
        float precio = datos.nextFloat();
        System.out.println("Ingrese el id de la categoria");
        int idCat= datos.nextInt();
        
        String tot = (nom+ " "+precio+" "+ idCat);
        System.out.println(tot);
    } /*
    //opcion2 de menuProducto
    public static Producto eliminarProducto(){
        System.out.println("");
    }
    //opcion 3 de menuProducto
    public static Producto ModificarProducto(){
        System.out.println("");
    }*/
    
}
