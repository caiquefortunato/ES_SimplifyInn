package dataBase;

import java.sql.Connection;

public class manipuladorSQL {

    public static void main(String[] args) {

        // Cria uma instancia para a criacao do Banco de dados
        conexaoMySQL conn = conexaoMySQL.getConexao();
        
        // Cria conexao com o banco
        Connection conexao = conn.getConexaoMySQL();
       
        // Verifica funcionamento do banco
        System.out.println(conn.statusConection());
        
        // Apaga dados existentes
        //delete apagar = new delete();
        
        // Cria tabelas
        tabelas tabelas = new tabelas();
    }
    
}
