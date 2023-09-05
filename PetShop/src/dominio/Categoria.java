/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;
import java.util.ArrayList;

/**
 *
 * @author merce
 */
public class Categoria {
    String ArrayList<String> misCategorias;
   
    //constructor
    public Categoria(){
        misCategorias = new ArrayList<>();
    }
    public void nuevaCategoria(String cat){
        misCategorias.add(cat);
    }
    //ver si hacer para eliminar categorias

}
