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
public interface IControleRemoto {
    //INTERFACE POSSUI APENAS A ASSINATURA DOS METODOS - E A IMPLEMENTAÇÃO DOS
    //METODOS ESTARÁ NAS CLASSES QUE ASSINAREM CONTRATO COM MINHA INTERFACE.
    //OBRIGATORIAMENTE TODOS OS METODOS DECLARADOS NA INTERFACE DEVERAO SER 
    //IMPLEMENTADOS NAS CLASSES QUE ASSINARAM OS METODOS
    
    public void mudarCanal(int canal);
    public void aumentarVolume(int volume);
    public void diminuirVolume(int volume);
    public boolean ligar();
    public boolean Desligar();
    
}
