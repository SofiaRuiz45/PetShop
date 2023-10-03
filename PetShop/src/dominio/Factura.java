package dominio;

import java.util.Random;



//tiene que heredar de la clase Producto y de la clase Cliente
public class Factura {
    private String nombreProducto; //esto heredado
    private String categoriaProducto;
    private double precio; //esto heredado
    private int cantidad;
    private int codigoFactura;
    //falta la fecha
    //faltan los datos del clientee
    public Factura(String nombreProducto, String categoriaProducto, double precio, int cantidad) {
        this.nombreProducto = nombreProducto;
        this.categoriaProducto = categoriaProducto;
        this.precio = precio;
        this.cantidad = cantidad;
        this.codigoFactura = generarCodigoFactura();
    }

    private int generarCodigoFactura() {
        // Generar un código aleatorio de factura
        Random rand = new Random();
        return rand.nextInt(10000) + 1000; // Números entre 1000 y 19999
    }

    public void imprimirFactura() {
        System.out.println("***** Factura *****");
        System.out.println("Código de Factura: " + codigoFactura);
        System.out.println("Nombre del Producto: " + nombreProducto);
        System.out.println("Categoría del Producto: " + categoriaProducto);
        System.out.println("Precio Unitario: $" + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Total a Pagar: $" + (precio * cantidad));
    }

    public static void main(String[] args) {
        Factura factura1 = new Factura("Comida para perro", "Alimentos", 10.99, 3);
        factura1.imprimirFactura();
    }
}