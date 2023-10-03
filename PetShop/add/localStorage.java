import java.io.*;
class LocalStorage{
    // Serializaci�n
    public static void setItem(String nombre, Object objeto){
        try {
            FileOutputStream archivoSalida = new FileOutputStream(nombre);
            ObjectOutputStream objetoSalida = new ObjectOutputStream(archivoSalida);
            objetoSalida.writeObject(objeto);
            objetoSalida.close();
            archivoSalida.close();
            System.out.println("Objeto serializado y guardado en archivo.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object getItem(String nomArchivo){
        // Deserializaci�n
        Object objetoDeserializado = null;
        try {
            FileInputStream archivoEntrada = new FileInputStream(nomArchivo);
            ObjectInputStream objetoEntrada = new ObjectInputStream(archivoEntrada);
            objetoDeserializado = objetoEntrada.readObject();
            objetoEntrada.close();
            archivoEntrada.close();
            System.out.println("Objeto deserializado desde archivo.ser");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return objetoDeserializado;
    }
}
