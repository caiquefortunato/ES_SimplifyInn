package acoes;

import dataBase.operations.insercaoBanco;
import dataBase.operations.selecaoBanco;
import entidades.usuario;

public class telaCadastro {
        
    usuario user = usuario.getUsuarioAtivo();
    selecaoBanco selecao = new selecaoBanco();
    private boolean verificaExistencia;
    
    public telaCadastro() {
        
    }

    public telaCadastro(usuario user) {
        insercaoBanco insere = new insercaoBanco();
        insere.inserirUsuario(user);
    }
    
    public void VerificaDisponibilidade(String login) {
        this.verificaExistencia = selecao.verificarDisponibilidade(login);
    }

    public boolean getVerificaExistencia() {
        return verificaExistencia;
    }
    
    public void limparDadosUser( ) {
        user.setEmail(null);
        user.setNome(null);
        user.setUsername(null);
        user.setSenha(null);
    }
}
