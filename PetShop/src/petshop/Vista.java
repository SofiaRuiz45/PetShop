package petshop;

import dominio.Producto;
import dominio.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

public class Vista {

    public static int menuPrincipal() {
        Scanner lector = new Scanner(System.in);
        System.out.println("Bienvenido a Pulguitas PetShop");
        System.out.println("Seleccione 1 para gestionar productos");
        System.out.println("Seleccione 2 para gestionar clientes");
        System.out.println("Seleccione 3 para realizar una venta");
        System.out.println("Seleccione 4 para finalizar");
        int resp = lector.nextInt();

        return resp;
    }

    // Menú de productos
    public static int menuProducto() {
        Scanner datos = new Scanner(System.in);
        System.out.println("1-Añadir producto");
        System.out.println("2-Mostrar productos");
        System.out.println("3-Modificar producto");
        System.out.println("4-Eliminar producto");
        int opt = datos.nextInt();
        return opt;
    }

    // Opción 1 de menuProducto
    public static Producto menuNuevoProducto() {
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingrese el nombre");
        String nom = datos.nextLine();
        System.out.println("Ingrese el precio");
        float preci = datos.nextFloat();
        System.out.println("Ingrese la categoría");
        String catt = datos.next();

        // Devuelve el objeto Producto creado
        Producto producto = new Producto(nom, preci, catt);
        return producto;
    }

    public static void mostrarListaProducto(ArrayList<Producto> listaProductos) {
                if (listaProductos.isEmpty()) {
            System.out.println("La lista de productos está vacía.");
        } else {
            System.out.println("Lista de productos:");
        for (Producto producto : listaProductos) {
            System.out.println(producto);
        }
        }
    }

    public static Producto modificarProducto(ArrayList<Producto> listaProductos) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese el nombre del producto a modificar: ");
        String nombre = lector.next();

        for (Producto producto : listaProductos) {
            if (producto.getNombre().equals(nombre)) {
                System.out.println("Producto encontrado. Ingrese los nuevos datos:");

                System.out.print("Nuevo nombre: ");
                String nuevoNombre = lector.next();

                System.out.print("Nuevo precio: ");
                float nuevoPrecio = lector.nextFloat();

                System.out.print("Nueva categoría: ");
                String nuevaCategoria = lector.next();

                producto.setNombre(nuevoNombre);
                producto.setPrecio(nuevoPrecio);
                producto.setCategoria(nuevaCategoria);

                System.out.println("Producto modificado exitosamente.");
                return producto;
            }
        }

        System.out.println("Producto no encontrado. No se pudo modificar.");
        return null;
    }

    public static Producto eliminarProducto(ArrayList<Producto> listaProductos) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese el nombre del producto a eliminar: ");
        String nombre = lector.next();

        for (Producto producto : listaProductos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                listaProductos.remove(producto);
                return producto;
            }
        }

        System.out.println("Producto no encontrado. No se pudo eliminar.");
        return null;
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

    public static Cliente agregarNuevoCliente() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el ID del cliente: ");
        int id = scanner.nextInt();

        System.out.print("Ingrese el teléfono del cliente: ");
        int telefono = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Ingrese la dirección del cliente: ");
        String direccion = scanner.nextLine();

                // Devuelve el objeto Cliente creado
        Cliente cliente = new Cliente(nombre, id, telefono, direccion);
        return cliente;
    }
    
    public static Cliente eliminarCliente(ArrayList<Cliente> listaClientes) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ID del cliente a eliminar: ");
        int id = scanner.nextInt();

        for (int i = 0; i < listaClientes.size(); i++) {
            Cliente cliente = listaClientes.get(i);
            if (cliente.getIdCliente() == id) {
                listaClientes.remove(i);
                return cliente;
            }
        }
        System.out.println("Cliente no encontrado. No se pudo eliminar.");
        return null;
    }
    
    public static Cliente modificarCliente(ArrayList<Cliente> listaClientes) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ID del cliente a modificar: ");
        int id = scanner.nextInt();
        

                
            Cliente cliente = listaClientes.get(i);
            
            if(cliente.getIdCliente()==id){
                scanner.nextLine(); // Consumir el salto de línea
                System.out.print("Ingrese el nuevo nombre del cliente: ");
                String nuevoNombre = scanner.nextLine();

                System.out.print("Ingrese el nuevo teléfono del cliente: ");
                int nuevoTelefono = scanner.nextInt();

                scanner.nextLine(); // Consumir el salto de línea

                System.out.print("Ingrese la nueva dirección del cliente: ");
                String nuevaDireccion = scanner.nextLine();
                
                Cliente cliente2 = new Cliente (nuevoNombre,id,nuevoTelefono,nuevaDireccion);            
                return cliente2;
            } 
                
                
            
        
        System.out.println("Cliente no encontrado. No se pudo modificar.");
        return null;
    }

    public static void mostrarListaClientes(ArrayList<Cliente> listaClientes) {
        if (listaClientes.isEmpty()) {
            System.out.println("La lista de clientes está vacía.");
        } else {
            System.out.println("Lista de clientes:");
            for (int i = 0; i < listaClientes.size(); i++) {
                Cliente cliente = listaClientes.get(i);
                System.out.println(cliente);
}
            }
        }
    
    public static int menuVenta(){
         Scanner dat = new Scanner(System.in);
        System.out.println("Menú de venta:");
        System.out.println("1. Agregar un cliente");
        System.out.println("2. Eliminar un cliente");
        System.out.println("3. Modificar un cliente");
        System.out.println("4. Mostrar clientes");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
        int resp = dat.nextInt();
        return resp;
    }
}
