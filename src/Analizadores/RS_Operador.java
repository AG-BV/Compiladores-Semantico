package Analizadores;

public class RS_Operador extends RegistroSemantico {
    public String operador;

    RS_Operador(String pOperador) {
        this.valueType = Value.OPERADOR;
        this.operador = pOperador;
    }
}