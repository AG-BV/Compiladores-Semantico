package Analizadores;

import java.util.ArrayList;

public class SimboloFuncion extends Simbolo {
    public ArrayList<ParametroFuncion> listaParametros;
    public ParametroFuncion retornoVariable;

    SimboloFuncion() {
        listaParametros = new ArrayList<ParametroFuncion>();
        retornoVariable = new ParametroFuncion();
    }

    @Override
    public void printDatos() {

    }
}