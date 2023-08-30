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
            int opt=lector.nextInt();
            
            return opt;
    }
}
