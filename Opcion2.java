package Principal;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Opcion2 {

    public static void main(String[] args) throws IOException {
        
        // leer fichero tipo byte
        try {
            FileInputStream info = new FileInputStream("informacion.txt");
            int i = 0;
            while ((i = info.read()) != -1) { //va a leer cada una de las lineas hasta la ultima linea del fichero byte-----!= hasta la ultima linea
                System.out.print((char) i);//esto se va a leeer hasta guardar todo lo que esta en el fichero en byte
            }                       // casteo de entero a char, convirtiendo el entero a char
            info.close();
        } catch (IOException e) {
            System.out.println(e);
        }
        // leer fichero tipo caracter
                File fichero = new File("Factura.txt");//instancio la clase fichero con parametro string (nombre de fichero y el tipo)

        if (fichero.exists()) {
            try {
                FileReader fr = new FileReader(fichero);
                BufferedReader objReader = null; //creando variable de tipo buferreader = null

                String cadena = "";
                objReader = new BufferedReader(fr); //instanciando un objeto

                while ((cadena = objReader.readLine()) != null) {// se lee todo lo del fichero
                    System.out.println(cadena);// se imprime todo lo del fichero
                }

            } catch (FileNotFoundException f) {
                System.out.println("El archivo no fue encontrado");
            }
        } else {
            System.out.println("No se encontró el archivo");
        }
    }
}

