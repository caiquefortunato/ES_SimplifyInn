/*
    A classe possui as tabelas, criando-as
*/
package dataBase;

import dataBase.conexaoMySQL;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class tabelas {
    
    // Quando a classe é chamada, cria todas as tabelas de uma vez
    public tabelas() {
        criarTabelaUsuario();
    }
    
    // Cria a tabela de usuários
    private void criarTabelaUsuario() {
        
        Statement stmt = null;
        // Cria uma instancia para a criacao do Banco de dados
        conexaoMySQL conn = conexaoMySQL.getConexao();
        // Cria conexao com o banco
        Connection conexao = conn.getConexaoMySQL();
        
        try {
            stmt = conexao.createStatement();
            String sql = "CREATE TABLE USUARIOS " +
                        "(USERNAME  TEXT    PRIMARY KEY NOT NULL," +
                        " NOME      TEXT    NOT NULL, " + 
                        " SENHA     TEXT    NOT NULL, " +
                        " EMAIL     TEXT    NOT NULL, " +
                        " CARGO     TEXT    )"; 
            stmt.executeUpdate(sql);
            stmt.close();
        } catch (SQLException e) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
    }
    
}


