public class Recepcionista {
    public String nome;
    public String cpf;
    public String telefone;
    public String senha;

    public void acessar(){
        //TODO
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception{
        if(nome==null){
            throw new Exception("Campo nome é obrigatório!!");
        }else{
            this.nome = nome;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha(){
        return senha;
    }

    public void setSenha(String senha) throws Exception {
        if(senha==null){
            throw new Exception("Campo senha obrigatório!!!");
        } else{
            this.senha = senha;
        }
    }

    public Recepcionista(String pNome, String pCpf, String pTelefone, String pSenha) throws Exception{
        setNome(pNome);
        setCpf(pCpf);
        setTelefone(pTelefone);
        setSenha(pSenha);
    }
    public void mostrar(){
        System.out.println(">>>>>>Recepcionista<<<<<<<");
        System.out.println("nome:"+getNome());
        System.out.println("cpf:"+getCpf());
        System.out.println("telefone:"+getTelefone());
        System.out.println("senha:"+getSenha());
    }
}
