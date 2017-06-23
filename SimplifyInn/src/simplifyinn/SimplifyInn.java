/*
 * Funcao princial do aplicativo SimplifyInn, chama a tela de inicio
 */
package simplifyinn;

import telas.TelaCRS;

/**
 * Primeira Sprint. 
 * Autor: Caíque Fortunato
 */
public class SimplifyInn {
    
    public static void main(String[] args) throws ClassNotFoundException {
        
        java.awt.EventQueue.invokeLater(() -> {
            new TelaCRS().setVisible(true);
        });
    }
    
}
