package Analizadores;

public class SimboloVariable extends Simbolo {
    public String tipoVariable;

    @Override
    public void printDatos() {
        System.out.print("Nombre: ");
        System.out.print(this.nombre);
        System.out.print("\tTipo_Simbolo: "); 
        System.out.print(this.tipoSimbolo);
        System.out.print("\tAcceso: ");
        System.out.print(this.acceso);
        System.out.print("\tTipo_variable: ");
        System.out.println(this.tipoVariable);
    }
}