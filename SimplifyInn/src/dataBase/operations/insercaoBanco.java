package dataBase.operations;

import dataBase.conexaoMySQL;
import entidades.usuario;
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
    
}
