package Analizadores;

public class ParametroFuncion {
    public String tipo;
    public String nombre;
    public String offset;

    ParametroFuncion(String pTipo, String pNom, String pOff) {
        this.tipo = pTipo;
        this.nombre = pNom;
        this.offset = pOff;
    }

    ParametroFuncion() {

    }
}