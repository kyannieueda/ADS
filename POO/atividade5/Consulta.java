public class Consulta {
    String data;
    String hora;
    Medico medico;
    Paciente paciente;
    String motivo;
    String historico;

    public void marcar(){
        //TODO
    }
    public void cancelar(){
        //TODO
    }
    public void consultar(){
        //TODO
    }
    public void realizar(){
        //TODO
    }
    public void atualizar(){
        //TODO
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
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
    public void setMedico(Medico medico) throws Exception{
        if(medico==null){
            throw new Exception("Campo médico obrigatório!!!");
        } else{
            this.medico = medico;
        }
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public String getMotivo() {
        return motivo;
    }
    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    public String getHistorico() {
        return historico;
    }
    public void setHistorico(String historico) {
        this.historico = historico;
    }
    public Consulta(String pData, String pHora, Medico pMedico, Paciente pPaciente, String pMotivo, String pHirotico) throws Exception{
        setData(pData);
        setHora(pHora);
        setMedico(pMedico);
        setPaciente(pPaciente);
        setMotivo(pMotivo);
        setHistorico(pHirotico);
    }
    public void mostrar(){
        System.out.println(">>>>>>Consulta<<<<<<<");
        System.out.println("data:"+getData());
        System.out.println("hora:"+getHora());
        System.out.println("medico:"+getMedico());
        System.out.println("paciente:"+getPaciente());
        System.out.println("motivo:"+getMotivo());
        System.out.println("historico:"+getHistorico());
    }
}
