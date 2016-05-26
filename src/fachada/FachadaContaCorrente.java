/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

/**
 * Classe que representa a fachada de acesso aos serviços de verificação de 
 * agênca e contas correntes em bancos
 */
public class FachadaContaCorrente {
    
    /*
        Verificar se uma agencia é válida para um determinado banco
    */
    public boolean verificarAgencia(int banco, String agencia){
        
        if(banco == 001)
        {
            return new VerificadorDigitoBancoDoBrasil().verificaAgencia(agencia);
        }
        
        if(banco == 033)
        {
            return new VerificadorDigitoSantander().verificaAgencia(agencia);
        }
        
        if(banco == 237)
        {
            return new VerificadorDigitoBradesco().verificaAgencia(agencia);
        }
        
        
         return false;
    }
    
    
    /*
        Verificar se uma agencia é válida para um determinado banco e agencia
    */
    public boolean verificarConta(int banco, String agencia, String conta){
        return false;
    }

       
}
