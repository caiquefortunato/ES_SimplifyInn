package entidades;

import dataBase.operations.selecaoBanco;

public class usuario {
    
    private int id;
    private String nome;
    private String username;
    private String senha;
    private String email;
    private String cargo;
    
    private static usuario usuarioAtivo;
    
    private usuario() {
        
    }
    
    // Construtor publico que cria uma unica instancia
    public static synchronized usuario getUsuarioAtivo() {
        if(usuarioAtivo == null)
            usuarioAtivo = new usuario();  

        return usuarioAtivo;
    }

    public usuario(int id, String nome, String username, String senha, 
            String email, String cargo) {
        this.id = id;
        this.nome = nome;
        this.username = username;
        this.senha = senha;
        this.email = email;
        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public void preencherDadosAposLogin( ) {
        //SelecaoBanco recuperaDados = new SelecaoBanco();
        
        selecaoBanco.preencherCamposUsuario(usuario.usuarioAtivo);
    }
    
    public void limparDados() {
        this.id = 0;
        this.nome = null;
        this.username = null;
        this.senha = null;
        this.email = null;
        this.cargo = null;
    }
    
}
