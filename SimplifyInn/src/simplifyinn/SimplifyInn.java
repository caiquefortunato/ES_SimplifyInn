/*
 * Funcao princial do aplicativo SimplifyInn, chama a tela de inicio
 */
package simplifyinn;

import telas.inicio;

/**
 * Primeira Sprint. 
 * Autor: Caíque Fortunato
 */
public class SimplifyInn {
    
    public static void main(String[] args) throws ClassNotFoundException {
        
        java.awt.EventQueue.invokeLater(() -> {
            new inicio().setVisible(true);
        });
    }
    
}
