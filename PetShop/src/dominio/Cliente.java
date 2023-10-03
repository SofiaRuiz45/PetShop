package dominio;

import java.util.ArrayList;
import java.io.Serializable;

public class Cliente implements Serializable {
    private String nombreCliente;
    private int idCliente;
    private int telefonoCliente;
    private String direccionCliente;

    public Cliente(String nombreCliente, int idCliente, int telefonoCliente, String direccionCliente) {
        this.nombreCliente = nombreCliente;
        this.idCliente = idCliente;
        this.telefonoCliente = telefonoCliente;
        this.direccionCliente = direccionCliente;
    }

    public static void eliminarCliente(ArrayList<Cliente> listaClientes, int idCliente) {
        // Itera sobre la lista de clientes
        for (int i = 0; i < listaClientes.size(); i++) {
            Cliente cliente = listaClientes.get(i);

            // Verifica si el ID del cliente coincide
            if (cliente.getIdCliente() == idCliente) {
                // Elimina el cliente de la lista
                listaClientes.remove(i);
                System.out.println("Cliente eliminado con éxito.");
                return; // Sale del bucle una vez que se ha eliminado el cliente
            }
        }

        // No se encontró al cliente con el ID ingresado
        System.out.println("Cliente no encontrado. No se pudo eliminar.");
    }

    public void modificarCliente(String nuevoNombre, int nuevoTelefono, String nuevaDireccion) {
        this.nombreCliente = nuevoNombre;
        this.telefonoCliente = nuevoTelefono;
        this.direccionCliente = nuevaDireccion;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(int telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }
}
