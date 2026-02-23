public class Consulta {
    public String data;
    public String hora;
    public String medico;
    public String paciente;
    public String motivo;
    public String historico;

    public void marcar() { }
    public void cancelar() { }
    public void consultar() { }
    public void realizar() { }
    public void atualizar() { }

    public void mostrar() {
        System.out.println("Consulta:");
        System.out.println("Data: " + data);
        System.out.println("Hora: " + hora);
        System.out.println("Médico: " + medico);
        System.out.println("Paciente: " + paciente);
        System.out.println("Motivo: " + motivo);
        System.out.println("Histórico: " + historico);
    }
}