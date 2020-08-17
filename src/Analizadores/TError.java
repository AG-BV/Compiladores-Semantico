package Analizadores;

public class TError {
    String lexema, tipo, descripcion;
    int linea, columna;

    public TError(String le, int li, int co, String t, String de) {
        lexema = le;
        linea = li;
        columna = co;
        tipo = t;
        descripcion = de;
    }

    public void print() {
        System.out.printf("%25s\t línea: %d,\t columna: %d,\t tipo: %s,\t descripcion: %s\n", this.lexema, this.linea,
                this.columna, this.tipo, this.descripcion);
    }
}
