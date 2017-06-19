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
        criarTabelaReservas();
        criarTabelaPedidos();
        System.out.println("As tabelas foram criadas na base de dados.");
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
    
    private void criarTabelaReservas() {
            Statement stmt = null;
            conexaoMySQL conn = conexaoMySQL.getConexao();
            Connection conexao = conn.getConexaoMySQL();
            try {
                stmt = conexao.createStatement();
                String sql = "CREATE TABLE RESERVAS " +
                            "(ID_RESERVA    INTEGER     NOT NULL PRIMARY KEY AUTOINCREMENT," +
                            " ID            TEXT        NOT NULL," +
                            " NUM           INTEGER     NOT NULL, " + 
                            " NOME          TEXT        NOT NULL, " +
                            " EMAIL         TEXT        NOT NULL, " +
                            " TELEFONE      INTEGER     NOT NULL, " +
                            " DATANASC      DATE        NOT NULL, " +
                            " CHECKIN       DATE        NOT NULL,  "  +
                            " CHECKOUT      DATE        NOT NULL,  "  +
                            " NUMHOSPEDES   INTEGER     NOT NULL,  " + 
                            " OBSERVACOES   TEXT                ," +                        
                            " IDQUARTO      INTEGER     NOT NULL, " +
                            " IDRESERVA     INTEGER     NOT NULL )"; 
                stmt.executeUpdate(sql);
                stmt.close();
                
            } catch (SQLException e) {
                System.err.println( e.getClass().getName() + ": " + e.getMessage() );
                System.exit(0);
        }
    }
        
    private void criarTabelaPedidos() {
             
        Statement stmt = null;
        // Cria uma instancia para a criacao do Banco de dados
        conexaoMySQL conn = conexaoMySQL.getConexao();
        // Cria conexao com o banco
        Connection conexao = conn.getConexaoMySQL();
        
        try {
            stmt = conexao.createStatement();
            String sql = "CREATE TABLE PEDIDOS " +
                        "(ID            INTEGER    NOT NULL PRIMARY KEY AUTOINCREMENT," +
                        " IDQUARTO      INTEGER    KEY NOT NULL, " + 
                        " SERVICO       TEXT    NOT NULL, " +
                        " OBSERVACAO    TEXT    NOT NULL)";
            stmt.executeUpdate(sql);
            stmt.close();
        } catch (SQLException e) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }
    }    
}


