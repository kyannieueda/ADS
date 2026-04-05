public class Recepcionista extends Funcionario {
    public String cpf;

    public void acessar(){
        //TODO
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Recepcionista() {
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

    // public Agenda marcarAgenda() throws Exception{
    //     var p1 = new Paciente();
    //     p1.setCodigo(1);
    //     p1.setEmail("jose@norton.net.br");
    //     p1.setNome("Jose da silva");
    
    //     var m1 = new Medico();
    //     m1.setNome("Maria Antonieta");
    //     m1.setCrm("234234234");
    //     m1.setTelefone("2344-2344");
    //     m1.setEspecialidade("Geriatria");
    //     m1.setSenha("senha");

    //     var a1 = new Agenda();
    //     a1.setData("01/04/2026");
    //     a1.setHora("10:20");
    //     a1.setMedico(m1);
    //     a1.setPaciente(p1);
    //     return a1;
    // }
}
