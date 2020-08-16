package Analizadores;

public class RS_DO extends RegistroSemantico {
    public String tipo;
    public String valor;

    RS_DO(String pTipo, String pValor) {
        this.tipo = pTipo;
        this.valor = pValor;
        this.valueType = Value.DO;
    }

    @Override
    public void printDatos() {
        System.out.print("Tipo: \t");
        System.out.print(this.valueType);
        System.out.print("\tValor: \t");
        System.out.println(this.valor);
    }
}