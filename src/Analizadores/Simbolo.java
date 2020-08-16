package Analizadores;

public abstract class Simbolo {
    // nombre de la variable
    public String nombre;
    // si es variable o funcion
    public String tipoSimbolo;
    // si es publico o privado
    public String acceso;

    public abstract void printDatos();
}