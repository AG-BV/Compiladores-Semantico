package Analizadores;

public class RS_ACCESS extends RegistroSemantico {
    public String access;

    RS_ACCESS(String access) {
        this.access = access;
        this.valueType = Value.ACCESS;
    }

    @Override
    public void printDatos() {
        System.out.print("Tipo: \t");
        System.out.print(this.valueType);
        System.out.print("\tValor: \t");
        System.out.println(this.access);
    }
}