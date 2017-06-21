/*
    A classe faz conexão com o Banco de dados
*/
package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexaoMySQL {
    private static conexaoMySQL conexaoMySQL;
    public static String status = "Nao foi possivel conectar ao Banco de Dados.";
    
    // Construtor privado
    private conexaoMySQL() { 
        
    }
    
    // Construtor publico que cria uma unica instancia
    public static synchronized conexaoMySQL getConexao() {
        if(conexaoMySQL == null)
            conexaoMySQL = new conexaoMySQL();  

        return conexaoMySQL;
    }
    
    public java.sql.Connection getConexaoMySQL() {
        
        Connection connection = null;
        
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("C:\\Users\\Philipe\\Documents\\NetBeansProjects\\ES_SimplifyInn\\SimplifyInn\\test.db");
            //connection = DriverManager.getConnection("jdbc:sqlite:test.db");

            
            //Testa a conexao  
            if (connection != null) {
                status = ("Conexao com o Banco de Dados criada com sucesso.");
            } else {
                status = ("Nao foi possivel conectar ao Banco de Dados.");
            }
            
            return connection;
        } catch (ClassNotFoundException e) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            JOptionPane.showMessageDialog(null, "O driver especificado nao foi encontrado.");
            System.exit(0);
            return null;
        } catch (SQLException e) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            JOptionPane.showMessageDialog(null, "Nao foi possivel conectar ao Banco de Dados.");
            System.exit(0);
            return null;
        }
    }

    public String statusConection() {
        return status;
    }
    
    //Metodo que fecha a conexao
    public boolean fecharConexao() {
        try {
            conexaoMySQL.getConexaoMySQL().close();
            status = ("Nao foi possivel conectar ao Banco de Dados.");
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    
    //Metodo que reinicia a conexao
    public java.sql.Connection reiniciarConexao() {
        fecharConexao();
        return conexaoMySQL.getConexaoMySQL();
    }    
}
