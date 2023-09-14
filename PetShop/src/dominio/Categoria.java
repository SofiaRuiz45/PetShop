package dominio;

public class Categoria {
    private String nombreCat;
    private int idCategoria;

    public Categoria(String nombreCat, int idCategoria) {
        this.nombreCat = nombreCat;
        this.idCategoria = idCategoria;
    }

    public String getNombreCat() {
        return nombreCat;
    }

    public void setNombreCat(String nombreCat) {
        this.nombreCat = nombreCat;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    @Override
    public String toString() {
        return "Categoría ID: " + idCategoria + ", Nombre: " + nombreCat + "\n";
    }
}
