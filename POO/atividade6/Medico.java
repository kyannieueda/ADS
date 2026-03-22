public class Medico {
    public String nome;
    public String crm;
    public String telefone;
    public String especialidade;
    public String senha;

    public void acessar(){
        //TODO
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) throws Exception {
        if(senha==null){
            throw new Exception("Campo senha obrigatório!!");
        } else{
            this.senha = senha;
        }
    }

      public Medico(){
        this.nome="";
        this.crm="";
        this.telefone="";
        this.especialidade="";
        this.senha="";
    }

    public Medico(String pNome, String pCrm, String pTelefone, String pEspecialidade, String pSenha) throws Exception{
        setNome(pNome);
        setCrm(pCrm);
        setTelefone(pTelefone);
        setEspecialidade(pEspecialidade);
        setSenha(pSenha);
    }
    public void mostrar(){
        System.out.println(">>>>>>Medico<<<<<<<");
        System.out.println("nome:"+getNome());
        System.out.println("crm:"+getCrm());
        System.out.println("tel:"+getTelefone());
        System.out.println("especialidade:"+getEspecialidade());
        System.out.println("senha:"+getSenha());
    }
     public void realizarConsulta(Agenda agenda) throws Exception{
        var c1 = new Consulta();
        c1.setData(agenda.getData());
        c1.setHora(agenda.getHora());
        c1.setMedico(agenda.getMedico());
        c1.setPaciente(agenda.getPaciente());
        c1.setMotivo("Dor abdominal");
        c1.setHistorico("apresenta dores na região do estomago, possivel gastrite");
        
        var e1 = new Exame(c1, "01/04/2026", "Exame de sangue");
        c1.getExames().add(e1);
        c1.getExames().add(new Exame(c1,"01/04/2026", "Endoscopia"));
        c1.getReceitas().add(new Receita(c1,"01/04/2026", "Buscopan"));
        c1.mostrar();
    }

}
