package dataBase;

import dataBase.conexaoMySQL;
import java.sql.*;

public class delete {

    public delete() {
        RemoveRegistrosUsuarios();
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
    
    
}
