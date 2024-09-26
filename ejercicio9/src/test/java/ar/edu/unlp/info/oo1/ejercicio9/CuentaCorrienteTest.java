package ar.edu.unlp.info.oo1.ejercicio9;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CuentaCorrienteTest {
	private CuentaCorriente camilo;
	private CuentaCorriente juan;
	@BeforeEach
	  void setUp() throws Exception {
	    camilo = new CuentaCorriente();
	    juan = new CuentaCorriente();
	    camilo.depositar(1000);
	    camilo.setDescubierto(500);
	    
	  }
	
	@Test
	void testDescubierto() {
        assertEquals(500, camilo.getDescubierto());
    }
	
	@Test
	void testSaldo() {
        assertEquals(1000, camilo.getSaldo());
    }
	
	
	@Test
	void testExtraer() {
		camilo.extraer(100);
		assertEquals(900, camilo.getSaldo());
	}
	
	
	@Test
	void testTransferir() {
		camilo.transferirACuenta(1500, juan);
		assertEquals(-500, camilo.getSaldo());
		assertEquals(1500, juan.getSaldo());
	}
	
	
	
}

