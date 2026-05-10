import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RecepcionistaDAO {

    // ------------------------------------------------------------------ INSERT
    /**
     * Insere uma nova recepcionista no banco de dados.
     *
     * @param recepcionista objeto Recepcionista preenchido
     * @return id gerado pelo banco, ou -1 em caso de falha
     */
    public int inserir(Recepcionista recepcionista) throws Exception {
        String sql = "INSERT INTO recepcionista (nome, cpf, telefone, senha, salario_base) "
                   + "VALUES (?, ?, ?, ?, ?)";

        Connection conn = null;
        try {
            conn = ConnectionFactory.getConnection();

            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, recepcionista.getNome());
            ps.setString(2, recepcionista.getCpf());
            ps.setString(3, recepcionista.getTelefone());
            ps.setString(4, recepcionista.getSenha());
            ps.setDouble(5, recepcionista.getSalarioBase());

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
     * Atualiza os dados de uma recepcionista existente.
     *
     * @param recepcionista objeto Recepcionista com os novos dados
     * @param id            chave primária do registro a ser atualizado
     * @return true se ao menos uma linha foi afetada
     */
    public boolean atualizar(Recepcionista recepcionista, int id) throws Exception {
        String sql = "UPDATE recepcionista SET nome = ?, cpf = ?, telefone = ?, "
                   + "senha = ?, salario_base = ? WHERE id = ?";

        Connection conn = null;
        try {
            conn = ConnectionFactory.getConnection();

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, recepcionista.getNome());
            ps.setString(2, recepcionista.getCpf());
            ps.setString(3, recepcionista.getTelefone());
            ps.setString(4, recepcionista.getSenha());
            ps.setDouble(5, recepcionista.getSalarioBase());
            ps.setInt   (6, id);

            return ps.executeUpdate() > 0;
        } finally {
            ConnectionFactory.closeConnection(conn);
        }
    }

    // ------------------------------------------------------------------ DELETE
    /**
     * Remove uma recepcionista pelo id.
     *
     * @param id chave primária do registro
     * @return true se ao menos uma linha foi afetada
     */
    public boolean deletar(int id) throws Exception {
        String sql = "DELETE FROM recepcionista WHERE id = ?";

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
     * Busca uma recepcionista pelo id.
     *
     * @param id chave primária
     * @return objeto Recepcionista preenchido, ou null se não encontrado
     */
    public Recepcionista buscarPorId(int id) throws Exception {
        String sql = "SELECT * FROM recepcionista WHERE id = ?";

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

    // ----------------------------------------------------------- BUSCAR POR CPF
    /**
     * Busca uma recepcionista pelo CPF (campo único).
     *
     * @param cpf CPF da recepcionista (somente dígitos ou formatado)
     * @return objeto Recepcionista, ou null se não encontrado
     */
    public Recepcionista buscarPorCpf(String cpf) throws Exception {
        String sql = "SELECT * FROM recepcionista WHERE cpf = ?";

        Connection conn = null;
        try {
            conn = ConnectionFactory.getConnection();

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, cpf);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return mapear(rs);
            }
        } finally {
            ConnectionFactory.closeConnection(conn);
        }
        return null;
    }

    // ------------------------------------------------------------ LISTAR TODOS
    /**
     * Retorna todas as recepcionistas cadastradas, ordenadas pelo nome.
     *
     * @return lista de recepcionistas (pode ser vazia)
     */
    public List<Recepcionista> listarTodos() throws Exception {
        String sql = "SELECT * FROM recepcionista ORDER BY nome";

        List<Recepcionista> lista = new ArrayList<>();
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
     * Valida as credenciais de uma recepcionista (login por CPF + senha).
     *
     * @param cpf   CPF informado no login
     * @param senha senha informada no login
     * @return objeto Recepcionista autenticado, ou null se credenciais inválidas
     */
    public Recepcionista autenticar(String cpf, String senha) throws Exception {
        String sql = "SELECT * FROM recepcionista WHERE cpf = ? AND senha = ?";

        Connection conn = null;
        try {
            conn = ConnectionFactory.getConnection();

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, cpf);
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
     * Converte uma linha do ResultSet em um objeto Recepcionista.
     */
    private Recepcionista mapear(ResultSet rs) throws Exception {
        Recepcionista recepcionista = new Recepcionista();
        recepcionista.setNome     (rs.getString("nome"));
        recepcionista.setCpf      (rs.getString("cpf"));
        recepcionista.setTelefone (rs.getString("telefone"));
        recepcionista.setSenha    (rs.getString("senha"));
        recepcionista.setSalarioBase(rs.getDouble("salario_base"));
        return recepcionista;
    }
}
