import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cliente> listaClientes;

        // Intenta cargar la lista de clientes desde el almacenamiento local
        listaClientes = (ArrayList<Cliente>) LocalStorage.getItem("clientes.ser");

        if (listaClientes == null) {
            // Si no se pudo cargar, crea una lista nueva
            listaClientes = new ArrayList<>();
        }

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            opcion = menuCliente();

            switch (opcion) {
                case 1:
                    agregarNuevoCliente(listaClientes);
                    break;
                case 2:
                    eliminarCliente(listaClientes);
                    break;
                case 3:
                    modificarCliente(listaClientes);
                    break;
                case 4:
                    mostrarListaClientes(listaClientes);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 5);

        // Guarda la lista de clientes en el almacenamiento local al salir del programa
        LocalStorage.setItem("clientes.ser", listaClientes);
    }

    public static int menuCliente() {
        Scanner dat = new Scanner(System.in);
        System.out.println("Menú de opciones:");
        System.out.println("1. Agregar un cliente");
        System.out.println("2. Eliminar un cliente");
        System.out.println("3. Modificar un cliente");
        System.out.println("4. Mostrar clientes");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
        int resp = dat.nextInt();
        return resp;
    }

    public static void agregarNuevoCliente(ArrayList<Cliente> listaClientes) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el ID del cliente: ");
        int id = scanner.nextInt();

        System.out.print("Ingrese el teléfono del cliente: ");
        int telefono = scanner.nextInt();

        scanner.nextLine(); // Consumir el salto de línea

        System.out.print("Ingrese la dirección del cliente: ");
        String direccion = scanner.nextLine();

        Cliente nuevoCliente = new Cliente(nombre, id, telefono, direccion);
        listaClientes.add(nuevoCliente);
        System.out.println("Cliente agregado con éxito.");
    }

    public static void eliminarCliente(ArrayList<Cliente> listaClientes) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ID del cliente a eliminar: ");
        int id = scanner.nextInt();

        for (int i = 0; i < listaClientes.size(); i++) {
            Cliente cliente = listaClientes.get(i);
            if (cliente.getIdCliente() == id) {
                listaClientes.remove(i);
                System.out.println("Cliente eliminado con éxito.");
                return;
            }
        }
        System.out.println("Cliente no encontrado. No se pudo eliminar.");
    }

    public static void modificarCliente(ArrayList<Cliente> listaClientes) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ID del cliente a modificar: ");
        int id = scanner.nextInt();

        for (Cliente cliente : listaClientes) {
            if (cliente.getIdCliente() == id) {
                scanner.nextLine(); // Consumir el salto de línea
                System.out.print("Ingrese el nuevo nombre del cliente: ");
                String nuevoNombre = scanner.nextLine();

                System.out.print("Ingrese el nuevo teléfono del cliente: ");
                int nuevoTelefono = scanner.nextInt();

                scanner.nextLine(); // Consumir el salto de línea

                System.out.print("Ingrese la nueva dirección del cliente: ");
                String nuevaDireccion = scanner.nextLine();

                cliente.modificarCliente(nuevoNombre, nuevoTelefono, nuevaDireccion);
                System.out.println("Cliente modificado con éxito.");
                return;
            }
        }
        System.out.println("Cliente no encontrado. No se pudo modificar.");
    }

    public static void mostrarListaClientes(ArrayList<Cliente> listaClientes) {
        if (listaClientes.isEmpty()) {
            System.out.println("La lista de clientes está vacía.");
        } else {
            System.out.println("Lista de clientes:");
            for (Cliente cliente : listaClientes) {
                System.out.println("Nombre: " + cliente.getNombreCliente());
                System.out.println("ID: " + cliente.getIdCliente());
                System.out.println("Teléfono: " + cliente.getTelefonoCliente());
                System.out.println("Dirección: " + cliente.getDireccionCliente());
                System.out.println();
            }
        }
    }
}
