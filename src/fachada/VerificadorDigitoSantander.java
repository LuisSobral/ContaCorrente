/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

/**
 *
 * @author labccet
 */
public class VerificadorDigitoSantander extends VerificadorDigitosBancario {
    
     /**
	 * Verifica se um codigo de agencia e valido 
	 */
	@Override
	public boolean verificaAgencia(String codigo){
            
            char[] digitos = capturaDigitos(codigo, 4, 0);
        
            if (digitos == null)
                return false;
        
            return true;
            
        }

    @Override
    public boolean verificaContaCorrente(String codigoAgencia, String codigoConta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
