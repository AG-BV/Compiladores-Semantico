package Analizadores;

public class SimboloVariable extends Simbolo {
    public String tipoVariable;

    @Override
    public void printDatos() {
        System.out.print("Nombre: ");
        System.out.println(this.nombre);
        System.out.print("Tipo Simbolo: ");
        System.out.println(this.tipoSimbolo);
        System.out.print("Acceso: ");
        System.out.println(this.acceso);
        System.out.print("Tipo de la variable: ");
        System.out.println(this.tipoVariable);
    }
}