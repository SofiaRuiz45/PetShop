package petshop;

import dominio.Producto;
import java.util.ArrayList;

public class Modelo {


    public static void setItem(Producto producto) {
        LocalStorage.setItem("archivo.ser", producto);
    }

public static Producto getItem(String nomArchivo) {
    return (Producto) LocalStorage.getItem(nomArchivo);
}

} 
  