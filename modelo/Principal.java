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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        TVSharps objTVSharp = new TVSharps(14);
        TVPhilips objTVPhilip = new TVPhilips(32);
        TVTCL objTVTCL = new TVTCL(60);
        
        objTVPhilip.ligar();
        //objTVSharp.ligar();
        
        
        
        System.out.print("TVPhilips - modelo "+objTVPhilip.MODELO + " está ");
        System.out.println(objTVPhilip.isLigada() ? "Ligada\n" : "Desligada\n");
        
        
        
        objTVTCL.ligar();
        System.out.print("TVTCL - modelo "+objTVTCL.MODELO + " está ");
        System.out.println(objTVTCL.isLigada() ? "Ligada" : "Desligada");
        
        objTVTCL.Desligar();
        System.out.print("TVTCL - modelo "+objTVTCL.MODELO + " está ");
        System.out.println(objTVTCL.isLigada() ? "Ligada" : "Desligada");
        
    }
    
}
