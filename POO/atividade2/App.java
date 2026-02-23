public class App {
    public static void main(String[] args) {

        // Paciente
        Paciente p = new Paciente();
        p.nome = "Abel";
        p.cpf = "123123123-23";
        p.telefone = "1244-2311";
        p.genero = "Masculino";
        p.idade = 50;

        // Médico
        Medico m = new Medico();
        m.nome = "Dr. Moreira";
        m.crm = "CRM1234";
        m.telefone = "9999-9999";
        m.especialidade = "Cardiologia";
        m.senha = "abc123";

        // Recepcionista
        Recepcionista r = new Recepcionista();
        r.nome = "Roberta";
        r.cpf = "111222333-44";
        r.telefone = "8888-8888";
        r.senha = "senha123";

        // Agenda
        Agenda a = new Agenda();
        a.data = "10/03/2026";
        a.hora = "13:00";
        a.medico = m.nome;
        a.paciente = p.nome;

        // Consulta
        Consulta c = new Consulta();
        c.data = "10/03/2026";
        c.hora = "13:00";
        c.medico = m.nome;
        c.paciente = p.nome;
        c.motivo = "Dor no peito";
        c.historico = "Paciente relata dor há 3 dias";

        // Receita
        Receita rc = new Receita();
        rc.consulta = "Consulta 10/03/2026";
        rc.data = "10/03/2026";
        rc.descritivo = "Tomar remédio X por 7 dias";

        // Exame
        Exame e = new Exame();
        e.consulta = "Consulta 10/03/2026";
        e.data = "11/03/2026";
        e.descritivo = "Exame ecocardiograma";

        // Mostrar tudo
        p.mostrar();
        m.mostrar();
        r.mostrar();
        a.mostrar();
        c.mostrar();
        rc.mostrar();
        e.mostrar();
    }
}