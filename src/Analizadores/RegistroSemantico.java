package Analizadores;

/**
 * RegistroSemantico
 */
public class RegistroSemantico {
    public Value valueType;

    // Enum para tener los tipos de registros semánticos posibles de manera que sea
    // más sencillo de buscar
    // por tipo en la pila semántica
    public static enum Value {
        TIPO, ACCESS, IDENT, DO, OPERADOR
    }

    public Value getValueType() {
        return this.valueType;
    }
}