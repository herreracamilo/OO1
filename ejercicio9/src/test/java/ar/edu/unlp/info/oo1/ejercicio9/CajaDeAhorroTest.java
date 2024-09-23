package ar.edu.unlp.info.oo1.ejercicio9;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CajaDeAhorroTest {
	private CajaDeAhorro camilo;
	private CajaDeAhorro juan;
	@BeforeEach
	  void setUp() throws Exception {
	    camilo = new CajaDeAhorro();
	    juan = new CajaDeAhorro();
	    camilo.depositar(10000);
	    
	  }
	
	@Test
	void testSaldo() {
        assertEquals(9800, camilo.getSaldo());
    }
	
	
	@Test
	void testExtraer() {
		camilo.extraer(100);
		assertEquals(9698, camilo.getSaldo());
	}
	
	
	@Test
	void testTransferir() {
		camilo.transferirACuenta(100, juan);
		assertEquals(9698, camilo.getSaldo());
		assertEquals(98, juan.getSaldo());
	}
	
	
	
}

