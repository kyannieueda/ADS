public class Agenda {
    String data;
    String hora;
    Medico medico;
    Paciente paciente;

    public void consultar(){
        //TODO
    }
    
    public String getData() {
        return data;
    }

    public void setData(String data) throws Exception {
        if (data == null) {
            throw new Exception("Campo data obrigatório!!!");
        } else{
            this.data = data;
        }
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Agenda(String pData, String pHora, Medico pMedico, Paciente pPaciente) throws Exception {
        setData(pData);
        setHora(pHora);
        setMedico(pMedico);
        setPaciente(pPaciente);
    }

    public void mostrar(){
        System.out.println(">>>>>>Agenda<<<<<<<");
        System.out.println("data:"+getData());
        System.out.println("hora:"+getHora());
        System.out.println("medico:"+getMedico());
        System.out.println("paciente:"+getPaciente());
    }
}
