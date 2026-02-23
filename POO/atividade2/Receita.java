public class Receita {
    public String consulta;
    public String data;
    public String descritivo;

    public void prescrever() { }
    public void consultar() { }

    public void mostrar() {
        System.out.println("Receita:");
        System.out.println("Consulta: " + consulta);
        System.out.println("Data: " + data);
        System.out.println("Descritivo: " + descritivo);
    }
}