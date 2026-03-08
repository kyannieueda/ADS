public class Consulta {
    public String data;
    public String hora;
    public String medico;
    public String paciente;
    public String motivo;
    public String historico;

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
    public String getMedico() {
        return medico;
    }
    public void setMedico(String medico) throws Exception {
    if (medico == null || medico.length() < 3) {
        throw new Exception("Nome do médico obrigatório");
    } else {
        this.medico = medico;
    }
    }
    public String getPaciente() {
        return paciente;
    }
    public void setPaciente(String paciente) {
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
    public Consulta (String pData, String pHora, String pMedico, String pPaciente, String pMotivo, String pHistorico) throws Exception {
        setData(pData);
        setHora(pHora);
        setMedico(pMedico);
        setPaciente(pPaciente);
        setMotivo(pMotivo);
        setHistorico(pHistorico);
    }   
    public void mostrar(){
        System.out.println(">>>>>Consulta<<<<<<<");
        System.out.println("data:"+getData());
        System.out.println("hora:"+getHora());
        System.out.println("medico:"+getMedico());
        System.out.println("paciente:"+getPaciente());
        System.out.println("motivo:"+getMotivo());
        System.out.println("historico:"+getHistorico());
    }
}