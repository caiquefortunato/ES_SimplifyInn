/*
    Todas as operações de seleção no banco
*/
package dataBase.operations;

import dataBase.conexaoMySQL;
import entidades.usuario;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class selecaoBanco {
    
    private boolean retorno = false;

    public selecaoBanco() {

    }
    
    public static void preencherCamposUsuario(usuario user) {
        Statement stmt = null;
        try {
            // Cria uma instancia para a criacao do Banco de dados
            conexaoMySQL conn = conexaoMySQL.getConexao();
            try ( // Cria conexao com o banco
                    Connection c = conn.getConexaoMySQL()) {
                c.setAutoCommit(false);
                
                stmt = c.createStatement();
                try (ResultSet rs = stmt.executeQuery("SELECT * FROM USUARIOS;")) {
                    while (rs.next()) {
                        String username = rs.getString("USERNAME");
                        String nome = rs.getString("NOME");
                        String senha = rs.getString("SENHA");
                        String email = rs.getString("EMAIL");
                        String cargo = rs.getString("CARGO");
                        
                        if (username.equals(user.getUsername())) {
                            user.setNome(nome);
                            user.setSenha(senha);
                            user.setEmail(email);
                            user.setCargo(cargo);
                        }
                    }
                }
                stmt.close();
            }
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
    }
    
    public boolean conferirEmail(String email) {
        Statement stmt = null;
        try {
            // Cria uma instancia para a criacao do Banco de dados
            conexaoMySQL conn = conexaoMySQL.getConexao();
            try ( // Cria conexao com o banco
                    Connection c = conn.getConexaoMySQL()) {
                c.setAutoCommit(false);
                
                stmt = c.createStatement();
                try (ResultSet rs = stmt.executeQuery("SELECT * FROM USUARIOS;")) {
                    while (rs.next()) {
                        String emailBanco = rs.getString("EMAIL");
                        
                        if (emailBanco.equals(email)) {
                            retorno = true;
                        }
                    }
                }
                stmt.close();
            }
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return retorno;
    }

    public usuario enviarDados(String emailUsuario) {
        usuario user = usuario.getUsuarioAtivo();

        Statement stmt = null;
        try {
            // Cria uma instancia para a criacao do Banco de dados
            conexaoMySQL conn = conexaoMySQL.getConexao();
            try ( // Cria conexao com o banco
                    Connection c = conn.getConexaoMySQL()) {
                c.setAutoCommit(false);
                
                stmt = c.createStatement();
                try (ResultSet rs = stmt.executeQuery("SELECT * FROM USUARIOS;")) {
                    while (rs.next()) {
                        String username = rs.getString("USERNAME");
                        String nome = rs.getString("NOME");
                        String senha = rs.getString("SENHA");
                        String email = rs.getString("EMAIL");
                        
                        if (emailUsuario.equals(email)) {
                            user.setNome(nome);
                            user.setSenha(senha);
                            user.setUsername(username);
                        }
                        
                    }
                }
                stmt.close();
            }
        } catch (SQLException e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }

        return user;
    }
    
    public boolean verificarSenha(String login, String senha) {
        retorno = false;
        
        Statement stmt = null;
        try {
            // Cria uma instancia para a criacao do Banco de dados
            conexaoMySQL conn = conexaoMySQL.getConexao();
            try ( // Cria conexao com o banco
                    Connection c = conn.getConexaoMySQL()) {
                c.setAutoCommit(false);
                
                stmt = c.createStatement();
                try (ResultSet rs = stmt.executeQuery( "SELECT * FROM USUARIOS;" )) {
                    while ( rs.next() ) {
                        String nomeUsuario = rs.getString("USERNAME");
                        String senhaUsuario = rs.getString("SENHA");
                        
                        if(nomeUsuario.equals(login)) {
                            if(senhaUsuario.equals(senha)) {
                                retorno = true;
                            }
                        }
                    }
                }
                stmt.close();
            }
        } catch ( SQLException e ) {
          System.err.println( e.getClass().getName() + ": " + e.getMessage() );
          System.exit(0);
        }        
        return retorno;        
    }
    
    public boolean verificarDisponibilidade(String login) {
        retorno = false;
        
        Statement stmt = null;
        try {
            // Cria uma instancia para a criacao do Banco de dados
            conexaoMySQL conn = conexaoMySQL.getConexao();
            try ( // Cria conexao com o banco
                    Connection c = conn.getConexaoMySQL()) {
                c.setAutoCommit(false);
                
                stmt = c.createStatement();
                try (ResultSet rs = stmt.executeQuery( "SELECT * FROM USUARIOS;" )) {
                    while ( rs.next() ) {
                        String username = rs.getString("USERNAME");
                        
                        if(username.equals(login)) {
                            retorno = true;
                        }
                    }
                }
                stmt.close();
            }
        } catch ( SQLException e ) {
          System.err.println( e.getClass().getName() + ": " + e.getMessage() );
          System.exit(0);
        }        
        
        return retorno;
    }
    
}
