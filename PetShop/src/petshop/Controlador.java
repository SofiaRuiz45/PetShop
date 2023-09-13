package petshop;
import dominio.Categoria;
import java.util.ArrayList;

public class Controlador{
    	public static void main(String[] args) {
            int opt =0;
            while(opt != 4){
             opt = Vista.menuPrincipal(); // menuPrincipal
        if(opt == 1){
        System.out.println("seleccionaste 1");  
        int resp = Vista.MenuProducto();
            if(resp == 1){
                Vista.nuevoProducto();
            }   
	}
        //gestionar categorias
        else if(opt == 2) {
            System.out.println("Seleccionaste 2 ");
            int opt1 = Vista.menuCategoria();
                 switch (opt1) {
                     case 1:
                         //añadir categoria
                         Categoria unaCategoria = Vista.nuevaCategoria();
                         Modelo.anadirCategoria(unaCategoria);
                         System.out.println("");
                         break;
                     case 2:
                         //eliminar categoria
                         int idCat = Vista.obtenerId_Categoria();
                         Modelo.eliminarCategoria(idCat);
                         //Vista.mostrarCategorias(categorias);
                         break;
                     case 3:
                         //mostrar categorias
                         System.out.println("Categorias:");
                         ArrayList<Categoria> categorias = Modelo.obtenerCategorias();
                         Vista.mostrarCategorias(categorias);
                         break;
                     default:
                         break;
                 }
        }else {
            System.out.println("Programa finalizado");
        } 
            }
        
        }
        }
        

