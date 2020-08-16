package Analizadores;

public class RS_WHILE extends RegistroSemantico {
    public String while_label;
    public String exit_label;

    RS_WHILE(String label_else, String label_exit) {
        this.while_label = label_else;
        this.exit_label = label_exit;
        this.valueType = Value.WHILE;
    }

    @Override
    public void printDatos() {
        System.out.print("Tipo: \t");
        System.out.print(this.valueType);
        System.out.print("\tValor: \t");
        System.out.println(this.exit_label);
    }

}