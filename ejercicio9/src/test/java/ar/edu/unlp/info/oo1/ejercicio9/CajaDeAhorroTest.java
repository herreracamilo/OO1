package ar.edu.unlp.info.oo1.ejercicio9;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CajaDeAhorroTest {
	private CajaDeAhorro camilo;
	private CajaDeAhorro juan;
	@BeforeEach
	  void setUp() throws Exception {
	    camilo = new CajaDeAhorro(10000);
	    juan = new CajaDeAhorro(0);
	  }
	
	@Test
	void testSaldo() {
        assertEquals(10000, camilo.getSaldo());
    }
	
	void testTransferir() {
		camilo.transferirACuenta(100, juan);
		assertEquals(9898, camilo.getSaldo());
		assertEquals(100, juan.getSaldo());
	}
	
}
