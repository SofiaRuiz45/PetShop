package petshop;
//import dominio.producto;
import java.util.ArrayList;
import java.util.Iterator;
import dominio.Categoria;

public class Modelo {
    private static ArrayList<Categoria> listaCategorias= new ArrayList<>();
      public static void anadirCategoria(Categoria unaCategoria){
          
          
          if(! listaCategorias.contains(unaCategoria)){
              listaCategorias.add(unaCategoria);
          }
    }
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
