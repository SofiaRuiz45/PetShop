package petshop;
import java.util.Scanner;
import dominio.Categoria;
import dominio.Producto;
import java.util.ArrayList;

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
            System.out.println("Seleccione 4 para finalizar");
            int resp=lector.nextInt();
            
            return resp;
    }public static int MenuProducto(){
        Scanner datos = new Scanner(System.in);
        System.out.println("1-Añadir producto\n 2- Eliminar producto\n 3-Modificar producto");
        //replantear la idea de modificar
        int opt = datos.nextInt();
        return opt;
    }
    
    //opcion 1 de menuProducto
public static Producto nuevoProducto(){
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

//    opcion2 de menuProducto
    public static Producto eliminarProducto(){
        System.out.println("");
    }
//    
//    opcion 3 de menuProducto
//    public static Producto ModificarProducto(){
//        System.out.println("");
//    }
//    menu de categoria






   public static int menuCategoria(){
       Scanner datos2 = new Scanner (System.in);
       System.out.println("1-Agregar una categoria \n2-Eliminar una categoria \n 3-mostrar Categorias");
       int opc = datos2.nextInt();
       return opc ;
   }
   //añadir categoria
   public static Categoria nuevaCategoria(){
       Scanner datos3 = new Scanner (System.in);
       System.out.print("Ingresa el nombre de la categoria\n");
       String catNue = datos3.next();
       System.out.println("ingresa el codigo de la categoria\n");
       int numCat= datos3.nextInt();
       Categoria unaCategoria = new Categoria (catNue, numCat);
       Modelo.anadirCategoria(unaCategoria);
       
     return unaCategoria;
   }
   //mostrar categorias
   public static ArrayList<Categoria> mostrarCategorias(ArrayList<Categoria>categorias){
       for(Categoria categoria: categorias){
           System.out.print(categoria);
       }
       return categorias;
   }
   //eliminar categoria
   public static int obtenerId_Categoria(){
       Scanner datos4= new Scanner (System.in);
       System.out.println("Categorias:");
                ArrayList<Categoria> categorias = Modelo.obtenerCategorias();
                Vista.mostrarCategorias(categorias);
       System.out.println("ingresa el id, de la categoria a borrar");
       int num = datos4.nextInt();
       return num;
     
   }
   
}
