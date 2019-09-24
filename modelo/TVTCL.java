/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author aluno
 */
public class TVTCL extends TV implements IControleRemoto{
    public final String MODELO = "TCL 2019";
    
    public TVTCL(int tamanho){
        super(tamanho);
    }
    
    
    @Override
    public void mudarCanal(int canal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void aumentarVolume(int volume) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void diminuirVolume(int volume) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean ligar() {
        System.out.println("WELCOME...");
        super.setLigada(true);
        return true;
    }

    @Override
    public boolean Desligar() {
        System.out.println("BYE BYE...");
        super.setLigada(false);
        return false;
    }
}
