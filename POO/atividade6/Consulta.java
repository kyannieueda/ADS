import java.util.ArrayList;
import java.util.List;

public class Consulta extends Agenda {      //vai herdar todos os atributos da agenda
    String motivo;
    String historico;
    List<Exame> exames = new ArrayList<>();
    List<Receita> receitas = new ArrayList<>();


    public void marcar(){
        
    }
    public void cancelar(){
    
    }
    public void consultar(){
        
    }
    public void realizar(){
    
    }
    public void atualizar(){
        
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
    public List<Exame> getExames() {
        return exames;
    }
    public void setExames(List<Exame> exames) {
        this.exames = exames;
    }
    public List<Receita> getReceitas() {
        return receitas;
    }
    public void setReceitas(List<Receita> receitas) {
        this.receitas = receitas;
    }
    public Consulta(){
        this.data="";
        this.hora="";
        this.medico= null;
        this.paciente= null;
        this.motivo="";

    }

    public Consulta(String pData, String pHora, Medico pMedico, Paciente pPaciente, String pMotivo, String pHistorico) throws Exception{
        setData(pData);
        setHora(pHora);
        setMedico(pMedico);
        setPaciente(pPaciente);
        setMotivo(pMotivo);
        setHistorico(pHistorico);
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
