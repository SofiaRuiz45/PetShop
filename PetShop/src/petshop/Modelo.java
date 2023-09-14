package petshop;
<<<<<<< Updated upstream
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import dominio.Categoria;
import dominio.Producto;
import java.util.*;

public class Modelo {
    private static ArrayList<Categoria> listaCategorias= new ArrayList<>();
    
    public static void agregarProducto(Producto producto){
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
        
//    public static void eliminarProducto(ArrayList<Categoria> listaClientes, int id) {
//        for (int i = 0; i < listaClientes.size(); i++) {
//            Producto producto = listaCategoria.get(i);
//            if (cliente.getIdCliente() == id) {
//                listaClientes.remove(i);
//                System.out.println("Cliente eliminado con éxito.");
//                return;
//            }
//        }

        System.out.println("Cliente no encontrado. No se pudo eliminar.");
    }
        
    }
    
      public static void anadirCategoria(Categoria unaCategoria){
          
          
          if(! listaCategorias.contains(unaCategoria)){
              listaCategorias.add(unaCategoria);
          }
    }
=======
//import dominio.producto;
import java.util.ArrayList;
import java.util.Iterator;
import dominio.Categoria;
/**
 *
 * @author merce
 */
public class Modelo {
    private static ArrayList<Categoria> listaCategorias= new ArrayList<>();
      public static void anadirCategoria(Categoria unaCategoria){
          if(! listaCategorias.contains(unaCategoria)){
              listaCategorias.add(unaCategoria);
          }
    }
>>>>>>> Stashed changes
      public static ArrayList<Categoria> obtenerCategorias(){
       System.out.println("Las categorias son:");
          return listaCategorias;  
          
      }
      public static void eliminarCategoria(int id){
          //interator recorre elementos del ArrayList
          Iterator<Categoria> iterator = listaCategorias.iterator();
          while (iterator.hasNext()){
              Categoria cat = iterator.next();
              if(cat.getIdCategoria() == id){
                  iterator.remove();
                  System.out.println("Se elimino con exito");
                  return;
              }
          }
          System.out.println("No se encontro el id");
      }
      }
