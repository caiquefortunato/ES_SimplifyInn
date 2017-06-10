/*
    A classe possui as ações da tela de login
*/
package acoes;

import dataBase.operations.selecaoBanco;
import entidades.usuario;

public class telaLogin {
    private boolean verificaExistencia;
    private boolean verificaSenha = false;
    selecaoBanco selecao = new selecaoBanco();
    usuario user = usuario.getUsuarioAtivo();
    
    public telaLogin() {
        
    }
    
    public void VerificaDisponibilidade(String login) {
        this.verificaExistencia = selecao.verificarDisponibilidade(login);
    }

    public boolean getVerificaExistencia() {
        return verificaExistencia;
    }
    
    public void VerificaSenha(String usuario, String senha) {
        this.verificaSenha = selecao.verificarSenha(usuario, senha);
    }
    
    public boolean getVerificaSenha() {
        return verificaSenha;
    }
    
    public void definirUsuario(String usuarioLogin) {
        user.setUsername(usuarioLogin);
    }
    
    public void preencherDados() {
        user.preencherDadosAposLogin();
    }
    
}
