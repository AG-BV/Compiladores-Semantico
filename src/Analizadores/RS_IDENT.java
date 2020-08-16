package Analizadores;

public class RS_IDENT extends RegistroSemantico {
    public String ident;

    RS_IDENT(String ident) {
        this.ident = ident;
        this.valueType = Value.IDENT;
    }

    @Override
    public void printDatos() {
        System.out.print("Tipo: \t");
        System.out.print(this.valueType);
        System.out.print("\tValor: \t");
        System.out.println(this.ident);
    }
}