public class Paciente {
    int codigo;
    public String nome;
    public String cpf;
    public String telefone;
    public String genero;
    public int idade;
    String email;

    public void cadastrar(){
        //TODO
    }
    public void consultar(){
        //TODO
    }
    
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
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
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Paciente(int pCodigo, String pNome, String pEmail, String pCpf, String pTelefone, String pGenero, int pIdade){
        setCodigo(pCodigo);
        setEmail(pEmail);
        setNome(pNome);
        setCpf(pCpf);
        setTelefone(pTelefone);
        setGenero(pGenero);
        setIdade(pIdade);
    }

    public void mostrar(){
        System.out.println(">>>>>Paciente<<<<<<<");
        System.out.println("nome:"+getNome());
        System.out.println("cpf:"+getCpf());
        System.out.println("tel:"+getTelefone());
        System.out.println("Genero:"+getGenero());
        System.out.println("idade:"+getIdade());
        System.out.println("codigo:"+getCodigo());
        System.out.println("email:"+getEmail());
    }
}
