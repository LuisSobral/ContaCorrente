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
            if(agencia.length() == 6)
            {
                char caracter = ' ';
                int indice_agencia = 0;
                int indice_numeros = 0;
                int indice_produtos = 0;
                int[] numeros = new int[5];
                int[] produtos = new int[4];
                int soma = 0;
                int resto = 0;


                while(indice_agencia<6)
                {
                    if(indice_agencia == 4)
                    {
                        indice_agencia++;
                        continue;
                    }

                    caracter = agencia.charAt(indice_agencia);
                    numeros[indice_numeros] = Character.getNumericValue(caracter);
                    indice_agencia++; indice_numeros++;
                }

                for (indice_produtos=0; indice_produtos<4; indice_produtos++)
                {
                    int multiplicador = 5;
                    produtos[indice_produtos] = numeros[indice_produtos] * multiplicador;
                    multiplicador--;
                }

                for (indice_produtos=0; indice_produtos<produtos.length; indice_produtos++)
                    soma = soma + produtos[indice_produtos];

                resto = soma%11;

                if(Character.getNumericValue(caracter) == (11-resto))
                    return true;

            }
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
