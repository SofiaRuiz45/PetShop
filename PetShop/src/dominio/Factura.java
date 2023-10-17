package dominio;

import java.util.Random;


public class Factura  {

    private int cantidad;
    private int codigoFactura;

    public Factura( double precio, int cantidad) {
        this.cantidad = cantidad;
        this.codigoFactura = generarCodigoFactura();
    }

    private int generarCodigoFactura() {
        // Generar un código aleatorio de factura
        Random rand = new Random();
        return rand.nextInt(10000) + 1000; // Números entre 1000 y 19999
    }
    
    @Override
    public String toString() {
        return "Factura{" + "cantidad=" + cantidad + ", codigoFactura=" + codigoFactura + '}';
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCodigoFactura() {
        return codigoFactura;
    }
}