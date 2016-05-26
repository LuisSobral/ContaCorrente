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
public class VerificadorDigitoBradesco extends VerificadorDigitosBancario{
    
    @Override
	public boolean verificaAgencia(String codigo){
            
            char[] digitos = capturaDigitos(codigo, 4, 1);
            int soma = 0;
            
            if (digitos == null)
                return false;
            
            for (int i = 0; i < 4; i++)
                soma += (digitos[i] - '0') * (5 - i);
            
            int digito = 11 - soma % 11;
            char c = (digito == 10) ? 'P' : (char)('0' + digito);		
            return digitos[4] == c;
        }

    @Override
    public boolean verificaContaCorrente(String codigoAgencia, String codigoConta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
