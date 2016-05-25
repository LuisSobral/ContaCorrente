/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author labccet
 */
public class FachadaContaCorrenteTest {
   
    @Test
    public void testSimples() {
        assertFalse(new FachadaContaCorrente().verificarAgencia(001, "abcd"));
        assertFalse(new FachadaContaCorrente().verificarConta(001, "abcd", "12345"));
        
    }
    
    @Test
    public void testBancoDoBrasil() {
        assertTrue(new FachadaContaCorrente().verificarAgencia(001, "1584-9"));
        //assertTrue(new FachadaContaCorrente().verificarConta(001, "1584-9 ", "00210169-6"));
    }
    
}
