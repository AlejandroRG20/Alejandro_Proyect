package Principal;

import java.io.File;
import java.io.FileWriter;

public class Opcion3 {

    public static void main(String[] args) {
        File info = new File("informacion.txt");
        if (info.exists()) {
            System.out.println("el archivo existe");
            if (info.delete()) {
                System.out.println("archivo eliminado");
            } else {
                System.out.println("No se ha podido eliminar el archivo");
            }
        } else {
            System.out.println("No se a podido eliminar el archivo ya que no existe");
        }
        Opcion3.EliminarFichero();
    }

    public static void CrearFichero(String datos) {

        File fichero = new File("Factura.txt");

        try {
            FileWriter fw = new FileWriter(fichero, true);

            fw.write(datos + "\n");
            fw.close();
        } catch (Exception e) {

        }
    }

    public static void EliminarFichero() {



        File f = new File("Factura.txt");

        if (f.exists()) {
            System.out.println(f.getAbsolutePath());
            if (f.delete()) {
                System.out.println("Fichero ha sido eliminado");
            } else {
                System.out.println("No se ha podido eliminar el fichero");
            }
        } else {
            System.out.println("El fichero " + f.getAbsolutePath() + " no existe");

        }
    }
}