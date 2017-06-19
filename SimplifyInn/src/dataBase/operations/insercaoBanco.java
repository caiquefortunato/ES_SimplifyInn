/*
    Todas as operações de inserção no banco
*/
package dataBase.operations;

import dataBase.conexaoMySQL;
import entidades.Reserva;
import entidades.usuario;
import entidades.Pedido;
import java.sql.*;

public class insercaoBanco {
    
    public insercaoBanco() {

    }

    public void inserirUsuario(usuario user) {

        try {
            // Cria uma instancia para a criacao do Banco de dados
            conexaoMySQL conn = conexaoMySQL.getConexao();
            // Cria conexao com o banco
            Connection c = conn.getConexaoMySQL();

            String sql = "INSERT INTO USUARIOS (USERNAME, NOME, SENHA, EMAIL, CARGO) "
                    + "VALUES (?,?,?,?,?);";

            try (PreparedStatement stmt = c.prepareStatement(sql)) {
                stmt.setString(1, user.getUsername());
                stmt.setString(2, user.getNome());
                stmt.setString(3, user.getSenha());
                stmt.setString(4, user.getEmail());
                stmt.setString(5, user.getCargo());
                stmt.execute();
            }

        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);

        }
    }
    
    public void inserirReserva(Reserva res) {

        try {
            conexaoMySQL conn = conexaoMySQL.getConexao();
            Connection c = conn.getConexaoMySQL();

            String sql = "INSERT INTO RESERVAS (ID_RESERVA, ID, NUM, NOME, "
                    + "EMAIL, TELEFONE, DATANASC, CHECKIN, CHECKOUT, NUMHOSPEDES, "
                    + "OBSERVACOES, IDQUARTO, IDRESERVA) "
                        + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?);";

            try (PreparedStatement stmt = c.prepareStatement(sql)) {
                stmt.setString(1, null);
                stmt.setString(2, res.getIdentificacao());
                stmt.setInt(3, res.getNumero_identificacao());
                stmt.setString(4, res.getEmail());
                stmt.setString(5, res.getEmail());
                stmt.setInt(6, res.getTelefone());
                stmt.setString(7, res.getData_nascimento());
                stmt.setString(8, res.getData_checkin());
                stmt.setString(9, res.getData_checkout());
                stmt.setInt(10, res.getNum_hospedes());
                stmt.setString(11, res.getObservacoes());
                stmt.setInt(12, res.getNum_quarto());
                stmt.setInt(13, res.getCod_reserva());
                stmt.execute();
            }

        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);

        }
    }
        
    public void inserirPedido(Pedido pedido) {

        try {
            // Cria uma instancia para a criacao do Banco de dados
            conexaoMySQL conn = conexaoMySQL.getConexao();
            // Cria conexao com o banco
            Connection c = conn.getConexaoMySQL();

            String sql = "INSERT INTO PEDIDOS (ID, IDQUARTO, SERVICO, OBSERVACAO) "
                    + "VALUES (?,?,?,?);";

            try (PreparedStatement stmt = c.prepareStatement(sql)) {
                stmt.setString(1, null);
                stmt.setInt(2, pedido.getIdQuarto());
                stmt.setString(3, pedido.getServico());
                stmt.setString(4, pedido.getOBSERVACOES());
                stmt.execute();
            }

        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);

        }
    }
    
}
