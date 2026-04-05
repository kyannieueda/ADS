public abstract class Funcionario {
    String nome;
    String telefone;
    String senha;
    private double salarioBase;

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
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) throws Exception {
        if(senha==null){
            throw new Exception("Campo senha obrigatório!!!");
        } else{
            this.senha = senha;
        }
    }
    /**
     * @return the salarioBase
     */
    public double getSalarioBase() {
        return salarioBase;
    }
    /**
     * @param salarioBase the salarioBase to set
     */
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    public double calculoSalario(){
        return salarioBase;
    }

}
