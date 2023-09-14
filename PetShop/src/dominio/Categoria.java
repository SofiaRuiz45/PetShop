
package dominio;
//import java.util.ArrayList;

/**
 *
 * @author merce
 */
public class Categoria {
    private String nombreCat;
    private int idCategoria;
<<<<<<< Updated upstream
    
    public Categoria(String nombreCat, int idCategoria){
        super();
        this.nombreCat = nombreCat;
        this.idCategoria=idCategoria;
    }
    public String getNombreCat(){
        return nombreCat;
    }
    public void setNombreCat(String nombreCat){
        this.nombreCat = nombreCat;
    }
     public int getIdCategoria(){
        return idCategoria;
    }
    public void setIdCategoria(String id_Categoria){
        this.idCategoria = idCategoria;
    }

    /**
     *
     * @return
     */
=======

   
    public Categoria(String nombreCat, int idCategoria){
        super();
        this.nombreCat = nombreCat;
        this.idCategoria=idCategoria;
    }
    public String getNombreCat(){
        return nombreCat;
    }
    public void setNombreCat(String nombreCat){
        this.nombreCat = nombreCat;
    }
     public int getIdCategoria(){
        return idCategoria;
    }
    public void setIdCategoria(String id_Categoria){
        this.idCategoria = idCategoria;
    }
    
    
    
    
>>>>>>> Stashed changes
    @Override
    public String toString(){
        return "categoria id: "+idCategoria +", nombre: "+ nombreCat+ "\n";
    }
}
