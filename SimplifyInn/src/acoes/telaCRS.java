package acoes;

import dataBase.operations.insercaoBanco;
import entidades.Reserva;

public class telaCRS {

    insercaoBanco insercao = new insercaoBanco();
    
    public telaCRS() {
        
    }

    public void preencherDados(Reserva reserva){
        insercao.inserirReserva(reserva);
    }
}
