package Analizadores;

public class ErrorSemantico {
    int linea;
    String descripcion;

    ErrorSemantico(int pLinea, String pDescripcion) {
        this.linea = pLinea;
        this.descripcion = pDescripcion;
    }

    public void printDatos() {
        System.out.printf("Linea: %d\tDescripcion: %s\n", this.linea, this.descripcion);
    }
}