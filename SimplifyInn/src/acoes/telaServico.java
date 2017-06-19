package acoes;

import dataBase.operations.insercaoBanco;
import entidades.Pedido;

public class telaServico {
    insercaoBanco insercao = new insercaoBanco();
    
    public telaServico() {
        
    }
    
    public void preencherDados(Pedido pedido){
        insercao.inserirPedido(pedido);
    }
}
