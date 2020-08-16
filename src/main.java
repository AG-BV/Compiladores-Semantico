import Analizadores.*;
import java_cup.runtime.Symbol;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.io.FileWriter; // Import the FileWriter class
import java.io.IOException;

public class main {
    static FileWriter myWriter;

    public static void accessToken(Lexer lexico) {
        System.out.println("--------------------------- Tokens correctos ---------------------------");
        for (Token t : Lexer.tokens) {
            t.print();
        }

        System.out.println("--------------------------- Tokens incorrectos ---------------------------");
        System.out.println("\nErrores\n");
        for (Token t : Lexer.errores) {
            t.print();
        }
    }

    public static void accessErrors(analisis_sintactico parser) {
        for (TError t : analisis_sintactico.TablaES) {
            t.print();
        }
    }

    public static void createFile(String name) throws IOException {
        File archivo = new File(name);
        if (archivo.createNewFile()) {
            System.out.println("Archivo creado");
        } else {
            System.out.println("Ya el archivo existe");
        }
    }

    public static void openFile(String file) {
        try {
            myWriter = new FileWriter(file);
            System.out.println("Successfully wrote to the file.");
        } catch (final IOException e) {
            System.out.println("An error occurred.");
        }
    }

    public static void closeFile() throws IOException {
        myWriter.close();
    }

    public static void main(String[] args) {
        try {
            File file = new File(
                    "/media/bryan/Disco 1/Documentos/Ingeniería en computación/Semestre V/Compiladores/Proyectos/Proyecto 3/codigo/Compiladores-Semantico/src/Analizadores/pruebas/PruebaBasica.txt");
            String nombreArchivoFuente = file.getName();
            String[] fileSplit = nombreArchivoFuente.split("\\.");
            String nombreSalida = fileSplit[0];
            nombreSalida = nombreSalida.concat(".asm");

            Lexer lexico = new Lexer(new BufferedReader(new FileReader(file)));

            analisis_sintactico sintactico = new analisis_sintactico(lexico);
            createFile(nombreSalida);
            sintactico.myWriter = new FileWriter(nombreSalida);
            System.out.println("--------------------------- Parseando... ---------------------------");
            sintactico.parse();
            // System.out.println("------------------------ Datos de ejecucion
            // ---------------------------");
            // accessToken(lexico);
            // System.out.println("--------------------------- Errores sintacticos
            // ---------------------------");
            // accessErrors(sintactico);
            LinkedList<RegistroSemantico> pilaSemantica = sintactico.pilaSemantica;
            LinkedList<Simbolo> tablaSimbolos = sintactico.tablaSimbolos;
            for (Simbolo simbolo : tablaSimbolos) {
                simbolo.printDatos();
            }
            // System.out.println(sintactico.resultado);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}