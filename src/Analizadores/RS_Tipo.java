package Analizadores;

public class RS_Tipo extends RegistroSemantico {
    public String tipo;

    RS_Tipo(String tipo) {
        this.tipo = tipo;
        this.valueType = Value.TIPO;
    }

    @Override
    public void printDatos() {
        System.out.print("Tipo: \t");
        System.out.print(this.valueType);
        System.out.print("\tValor: \t");
        System.out.println(this.tipo);
    }
}