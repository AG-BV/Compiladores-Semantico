package Analizadores;

public class RS_Operador extends RegistroSemantico {
    public String operador;

    RS_Operador(String pOperador) {
        this.valueType = Value.OPERADOR;
        this.operador = pOperador;
    }

    @Override
    public void printDatos() {
        System.out.print("Tipo: \t");
        System.out.print(this.valueType);
        System.out.print("\tValor: \t");
        System.out.println(this.operador);
    }
}