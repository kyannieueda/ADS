import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MedicoDAO {

    // ------------------------------------------------------------------ INSERT
    /**
     * Insere um novo médico no banco de dados.
     *
     * @param medico objeto Medico preenchido
     * @return id gerado pelo banco, ou -1 em caso de falha
     */
    public int inserir(Medico medico) throws Exception {
        String sql = "INSERT INTO medico (nome, crm, telefone, especialidade, senha, salario_base, platoes) "
                   + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        Connection conn = null;
        try {
            conn = ConnectionFactory.getConnection();

            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, medico.getNome());
            ps.setString(2, medico.getCrm());
            ps.setString(3, medico.getTelefone());
            ps.setString(4, medico.getEspecialidade());
            ps.setString(5, medico.getSenha());
            ps.setDouble(6, medico.getSalarioBase());
            ps.setInt   (7, medico.getPlatoes());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } finally {
            ConnectionFactory.closeConnection(conn);
        }
        return -1;
    }

    // ------------------------------------------------------------------ UPDATE
    /**
     * Atualiza os dados de um médico existente (identificado pelo CRM).
     *
     * @param medico objeto Medico com os novos dados
     * @param id     chave primária do registro a ser atualizado
     * @return true se ao menos uma linha foi afetada
     */
    public boolean atualizar(Medico medico, int id) throws Exception {
        String sql = "UPDATE medico SET nome = ?, crm = ?, telefone = ?, especialidade = ?, "
                   + "senha = ?, salario_base = ?, platoes = ? WHERE id = ?";

        Connection conn = null;
        try {
            conn = ConnectionFactory.getConnection();

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, medico.getNome());
            ps.setString(2, medico.getCrm());
            ps.setString(3, medico.getTelefone());
            ps.setString(4, medico.getEspecialidade());
            ps.setString(5, medico.getSenha());
            ps.setDouble(6, medico.getSalarioBase());
            ps.setInt   (7, medico.getPlatoes());
            ps.setInt   (8, id);

            return ps.executeUpdate() > 0;
        } finally {
            ConnectionFactory.closeConnection(conn);
        }
    }

    // ------------------------------------------------------------------ DELETE
    /**
     * Remove um médico pelo id.
     *
     * @param id chave primária do registro
     * @return true se ao menos uma linha foi afetada
     */
    public boolean deletar(int id) throws Exception {
        String sql = "DELETE FROM medico WHERE id = ?";

        Connection conn = null;
        try {
            conn = ConnectionFactory.getConnection();

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            return ps.executeUpdate() > 0;
        } finally {
            ConnectionFactory.closeConnection(conn);
        }
    }

    // ------------------------------------------------------------ BUSCAR POR ID
    /**
     * Busca um médico pelo id.
     *
     * @param id chave primária
     * @return objeto Medico preenchido, ou null se não encontrado
     */
    public Medico buscarPorId(int id) throws Exception {
        String sql = "SELECT * FROM medico WHERE id = ?";

        Connection conn = null;
        try {
            conn = ConnectionFactory.getConnection();

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return mapear(rs);
            }
        } finally {
            ConnectionFactory.closeConnection(conn);
        }
        return null;
    }

    // ----------------------------------------------------------- BUSCAR POR CRM
    /**
     * Busca um médico pelo CRM (campo único).
     *
     * @param crm CRM do médico
     * @return objeto Medico, ou null se não encontrado
     */
    public Medico buscarPorCrm(String crm) throws Exception {
        String sql = "SELECT * FROM medico WHERE crm = ?";

        Connection conn = null;
        try {
            conn = ConnectionFactory.getConnection();

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, crm);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return mapear(rs);
            }
        } finally {
            ConnectionFactory.closeConnection(conn);
        }
        return null;
    }

    // --------------------------------------------------- BUSCAR POR ESPECIALIDADE
    /**
     * Retorna todos os médicos de uma determinada especialidade.
     *
     * @param especialidade nome da especialidade (ex.: "Cardiologista")
     * @return lista de médicos (pode ser vazia)
     */
    public List<Medico> buscarPorEspecialidade(String especialidade) throws Exception {
        String sql = "SELECT * FROM medico WHERE especialidade = ? ORDER BY nome";

        List<Medico> lista = new ArrayList<>();
        Connection conn = null;
        try {
            conn = ConnectionFactory.getConnection();

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, especialidade);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                lista.add(mapear(rs));
            }
        } finally {
            ConnectionFactory.closeConnection(conn);
        }
        return lista;
    }

    // ------------------------------------------------------------ LISTAR TODOS
    /**
     * Retorna todos os médicos cadastrados, ordenados pelo nome.
     *
     * @return lista de médicos
     */
    public List<Medico> listarTodos() throws Exception {
        String sql = "SELECT * FROM medico ORDER BY nome";

        List<Medico> lista = new ArrayList<>();
        Connection conn = null;
        try {
            conn = ConnectionFactory.getConnection();

            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                lista.add(mapear(rs));
            }
        } finally {
            ConnectionFactory.closeConnection(conn);
        }
        return lista;
    }

    // ------------------------------------------------------------------ LOGIN
    /**
     * Valida as credenciais de um médico (login por CRM + senha).
     *
     * @param crm   CRM informado no login
     * @param senha senha informada no login
     * @return objeto Medico autenticado, ou null se credenciais inválidas
     */
    public Medico autenticar(String crm, String senha) throws Exception {
        String sql = "SELECT * FROM medico WHERE crm = ? AND senha = ?";

        Connection conn = null;
        try {
            conn = ConnectionFactory.getConnection();

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, crm);
            ps.setString(2, senha);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return mapear(rs);
            }
        } finally {
            ConnectionFactory.closeConnection(conn);
        }
        return null;
    }

    // ----------------------------------------------------------------- MAPEAMENTO
    /**
     * Converte uma linha do ResultSet em um objeto Medico.
     */
    private Medico mapear(ResultSet rs) throws Exception {
        Medico medico = new Medico();
        medico.setNome        (rs.getString("nome"));
        medico.setCrm         (rs.getString("crm"));
        medico.setTelefone    (rs.getString("telefone"));
        medico.setEspecialidade(rs.getString("especialidade"));
        medico.setSenha       (rs.getString("senha"));
        medico.setSalarioBase (rs.getDouble("salario_base"));
        medico.setPlatoes     (rs.getInt   ("platoes"));
        return medico;
    }
}
