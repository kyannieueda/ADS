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


    public void setSenha(String senha) {
        this.senha = senha;
    }
    public Medico(String pNome, String pCrm,  String pTelefone, String pEspecialidade, String pSenha){
        setNome(pNome);
        setCrm(pCrm);
        setTelefone(pTelefone);
        setEspecialidade(pEspecialidade);
        setSenha(pSenha);
    }
    public void mostrar(){
        System.out.println(">>>>>Medico<<<<<<<");
        System.out.println("nome:"+getNome());
        System.out.println("crm:"+getCrm());
        System.out.println("tel:"+getTelefone());
        System.out.println("especialidade:"+getEspecialidade());
        System.out.println("senha:"+getSenha());
    }
}