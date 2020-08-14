package Analizadores;

public class RS_DO extends RegistroSemantico {
    public String tipo;
    public String valor;

    RS_DO(String pTipo, String pValor) {
        this.tipo = pTipo;
        this.valor = pValor;
        this.valueType = Value.DO;
    }
}