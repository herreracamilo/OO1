package ar.edu.unlp.info.oo1.ejercicio9;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ViceversaTest {
	private CuentaCorriente camilo;
	private CajaDeAhorro juan;
	@BeforeEach
	  void setUp() throws Exception {
	    camilo = new CuentaCorriente();
	    juan = new CajaDeAhorro();
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
	void testTransferencias() {
		camilo.transferirACuenta(1500, juan);
		assertEquals(-500, camilo.getSaldo());
		assertEquals(1470, juan.getSaldo()); // 1470 por el 2% de comision
		assertEquals(-500, camilo.getSaldo());
		juan.transferirACuenta(1440.6, camilo);
		assertEquals(0.5879999999999654, juan.getSaldo());
		assertEquals(940.5999999999999, camilo.getSaldo());
	}
	
	
	
	
}

