
public class App {

    public static void main(String[] args) {
        testarMedicoDAO();
        testarRecepcionistaDAO();
    }

     private static void testarMedicoDAO() {
        MedicoDAO dao = new MedicoDAO();
        System.out.println("\n========== TESTES MEDICO DAO ==========\n");

        try {
            // --- INSERT ---
            Medico novoMedico = new Medico("Dr. House", "CRM-99999", "11 91111-1111", "Diagnóstico", "house123");
            novoMedico.setSalarioBase(12000.00);
            novoMedico.setPlatoes(3);

            int idGerado = dao.inserir(novoMedico);
            System.out.println("[INSERT] ID gerado: " + idGerado);

            // --- BUSCAR POR ID ---
            Medico encontrado = dao.buscarPorId(idGerado);
            if (encontrado != null) {
                System.out.println("[BUSCAR POR ID]");
                encontrado.mostrar();
            }

            // --- BUSCAR POR CRM ---
            Medico porCrm = dao.buscarPorCrm("CRM-99999");
            System.out.println("[BUSCAR POR CRM] nome: " + (porCrm != null ? porCrm.getNome() : "não encontrado"));

            // --- BUSCAR POR ESPECIALIDADE ---
            System.out.println("[BUSCAR POR ESPECIALIDADE - Cardiologista]");
            dao.buscarPorEspecialidade("Cardiologista").forEach(m -> System.out.println("  -> " + m.getNome()));

            // --- AUTENTICAR ---
            Medico autenticado = dao.autenticar("CRM-99999", "house123");
            System.out.println("[AUTENTICAR] " + (autenticado != null ? "Login OK - " + autenticado.getNome() : "Credenciais inválidas"));

            // --- UPDATE ---
            encontrado.setEspecialidade("Neurologia");
            encontrado.setPlatoes(5);
            boolean atualizado = dao.atualizar(encontrado, idGerado);
            System.out.println("[UPDATE] " + (atualizado ? "Atualizado com sucesso" : "Falha na atualização"));

            // --- LISTAR TODOS ---
            System.out.println("[LISTAR TODOS]");
            dao.listarTodos().forEach(m -> System.out.println("  -> " + m.getNome() + " | " + m.getEspecialidade()));

            // --- DELETE ---
            boolean deletado = dao.deletar(idGerado);
            System.out.println("[DELETE] " + (deletado ? "Deletado com sucesso" : "Falha ao deletar"));

        } catch (Exception e) {
            System.err.println("[ERRO MedicoDAO] " + e.getMessage());
        }
    }

    private static void testarRecepcionistaDAO() {
        RecepcionistaDAO dao = new RecepcionistaDAO();
        System.out.println("\n========== TESTES RECEPCIONISTA DAO ==========\n");

        try {
            // --- INSERT ---
            Recepcionista nova = new Recepcionista("Ana Paula", "987.654.321-00", "11 92222-2222", "ana@clinica");
            nova.setSalarioBase(3000.00);

            int idGerado = dao.inserir(nova);
            System.out.println("[INSERT] ID gerado: " + idGerado);

            // --- BUSCAR POR ID ---
            Recepcionista encontrada = dao.buscarPorId(idGerado);
            if (encontrada != null) {
                System.out.println("[BUSCAR POR ID]");
                encontrada.mostrar();
            }

            // --- BUSCAR POR CPF ---
            Recepcionista porCpf = dao.buscarPorCpf("987.654.321-00");
            System.out.println("[BUSCAR POR CPF] nome: " + (porCpf != null ? porCpf.getNome() : "não encontrado"));

            // --- AUTENTICAR ---
            Recepcionista autenticada = dao.autenticar("987.654.321-00", "ana@clinica");
            System.out.println("[AUTENTICAR] " + (autenticada != null ? "Login OK - " + autenticada.getNome() : "Credenciais inválidas"));

            // --- UPDATE ---
            encontrada.setTelefone("11 93333-3333");
            boolean atualizada = dao.atualizar(encontrada, idGerado);
            System.out.println("[UPDATE] " + (atualizada ? "Atualizada com sucesso" : "Falha na atualização"));

            // --- LISTAR TODOS ---
            System.out.println("[LISTAR TODOS]");
            dao.listarTodos().forEach(r -> System.out.println("  -> " + r.getNome() + " | CPF: " + r.getCpf()));

            // --- DELETE ---
            boolean deletada = dao.deletar(idGerado);
            System.out.println("[DELETE] " + (deletada ? "Deletada com sucesso" : "Falha ao deletar"));

        } catch (Exception e) {
            System.err.println("[ERRO RecepcionistaDAO] " + e.getMessage());
        }
    }
}
