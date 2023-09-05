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
            System.out.println("Seleccione 1 para añadir un producto");
            System.out.println("Seleccione 2 para añadir una nueva categoria de producto");
            System.out.println("Seleccione 3 para realizar una venta");
            int resp=lector.nextInt();
            
            return resp;
    }/*
    public static Producto nuevoProducto(){
        Scanner datos= new Scanner (System.in);
        
        System.out.println("ingrese el nombre");
        String nom = datos.next();
        System.out.println("Ingrese el precio")|;
        float precio= datos.next();
        System.out.println("Ingrese el id de la categoria");
        int idCat = datos.next();
        
        return nuevoProducto;
    }*/
}
