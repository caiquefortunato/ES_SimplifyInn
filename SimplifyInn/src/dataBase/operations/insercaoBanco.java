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

            String sql = "INSERT INTO RESERVAS (ID, NUM, NOME, EMAIL, TELEFONE, DATANASC, CHECKIN, CHECKOUT,"
                        + " NUMHOSPEDES, OBSERVACOES, IDQUARTO, IDRESERVA) "
                        + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?);";

            try (PreparedStatement stmt = c.prepareStatement(sql)) {
                stmt.setString(1, String.valueOf(res.getId()));
                stmt.setString(2, res.getNum());
                stmt.setString(3, res.getNome());
                stmt.setString(4, res.getEmail());
                stmt.setString(5, res.getTelefone());
                stmt.setString(6, res.getDatansc());
                stmt.setString(7, res.getCheckin());
                stmt.setString(8, res.getCheckout());
                stmt.setString(9, String.valueOf(res.getNumHospedes()));
                stmt.setString(10, res.getOBSERVACOES());
                stmt.setString(11, String.valueOf(res.getIdQuarto()));
                stmt.setString(12, String.valueOf(res.getIdReserva()));
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

            String sql = "INSERT INTO PEDIDOS (IDQUARTO, SERVICO, OBSERVACOES) "
                    + "VALUES (?,?,?);";

            try (PreparedStatement stmt = c.prepareStatement(sql)) {
                stmt.setString(1,String.valueOf(pedido.getIdQuarto()));
                stmt.setString(2, pedido.getServico());
                stmt.setString(3, pedido.getOBSERVACOES());
                stmt.execute();
            }

        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);

        }
    }
    
}
