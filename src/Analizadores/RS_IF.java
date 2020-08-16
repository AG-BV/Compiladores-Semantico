package Analizadores;

public class RS_IF extends RegistroSemantico {
    public String else_label;
    public String exit_label;

    RS_IF(String label_else, String label_exit) {
        this.else_label = label_else;
        this.exit_label = label_exit;
    }

    @Override
    public void printDatos() {
        System.out.print("Tipo: \t");
        System.out.print(this.valueType);
        System.out.print("\tValor: \t");
        System.out.println(this.exit_label);
    }
}