/*
    Caso necessário, a classe deleta os registros.
    Na implementação apaga tudo.
*/
package dataBase;

import dataBase.conexaoMySQL;
import java.sql.*;

public class delete {

    public delete() {
        RemoveRegistrosUsuarios();
        RemoveRegistrosReservas();
        RemoveRegistrosPedidos();  
        System.out.println("As tabelas foram excluídas na base de dados.");
    }
    
    private void RemoveRegistrosUsuarios() {
        Statement stmt = null;
        String sql = null;
        
        try {
            // Cria uma instancia para a criacao do Banco de dados
            conexaoMySQL conn = conexaoMySQL.getConexao();
            try ( // Cria conexao com o banco
                    Connection c = conn.getConexaoMySQL()) {
                c.setAutoCommit(false);
                
                stmt = c.createStatement();
                sql = "DROP TABLE USUARIOS;";
                stmt.executeUpdate(sql);
                c.commit();
                
                stmt.close();
            }
        } catch ( SQLException e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }  
    }
    
    private void RemoveRegistrosReservas() {
        Statement stmt = null;
        String sql = null;
        
        try {
            // Cria uma instancia para a criacao do Banco de dados
            conexaoMySQL conn = conexaoMySQL.getConexao();
            try ( // Cria conexao com o banco
                    Connection c = conn.getConexaoMySQL()) {
                c.setAutoCommit(false);
                
                stmt = c.createStatement();
                sql = "DROP TABLE RESERVAS;";
                stmt.executeUpdate(sql);
                c.commit();
                
                stmt.close();
            }
        } catch ( SQLException e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }  
    }
    
    private void RemoveRegistrosPedidos() {
        Statement stmt = null;
        String sql = null;
        
        try {
            // Cria uma instancia para a criacao do Banco de dados
            conexaoMySQL conn = conexaoMySQL.getConexao();
            try ( // Cria conexao com o banco
                    Connection c = conn.getConexaoMySQL()) {
                c.setAutoCommit(false);
                
                stmt = c.createStatement();
                sql = "DROP TABLE PEDIDOS;";
                stmt.executeUpdate(sql);
                c.commit();
                
                stmt.close();
            }
        } catch ( SQLException e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }  
    }
    
}
