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
        //assertFalse(new FachadaContaCorrente().verificarAgencia(001, "abcd"));
        //assertFalse(new FachadaContaCorrente().verificarConta(001, "abcd", "12345"));
        
    }
    
    @Test
    public void testBancoDoBrasil() {
        assertTrue(new FachadaContaCorrente().verificarAgencia(001, "1584-9"));
        assertFalse(new FachadaContaCorrente().verificarAgencia(001,"0189"));
        assertFalse(new FachadaContaCorrente().verificarAgencia(001,"0189-4"));
        assertTrue(new FachadaContaCorrente().verificarAgencia(001,"0189-9"));
        //assertTrue(new FachadaContaCorrente().verificarConta(001, "1584-9 ", "00210169-6"));
    }
    
    @Test
    public void testSantander() {
        assertFalse(new FachadaContaCorrente().verificarAgencia(033, "1584-9"));
        assertTrue(new FachadaContaCorrente().verificarAgencia(033,"0189"));
        assertFalse(new FachadaContaCorrente().verificarAgencia(033,"48852"));
        assertTrue(new FachadaContaCorrente().verificarAgencia(033,"0956"));
        //assertTrue(new FachadaContaCorrente().verificarConta(001, "1584-9 ", "00210169-6"));
    }
    
    @Test
    public void testBradesco() {
        assertTrue(new FachadaContaCorrente().verificarAgencia(237, "14257"));
        assertFalse(new FachadaContaCorrente().verificarAgencia(237,"0189"));
        assertTrue(new FachadaContaCorrente().verificarAgencia(237,"48852"));
        assertFalse(new FachadaContaCorrente().verificarAgencia(237,"48859"));
        assertTrue(new FachadaContaCorrente().verificarAgencia(237,"09563"));
        //assertTrue(new FachadaContaCorrente().verificarConta(001, "1584-9 ", "00210169-6"));
    }
    
}
