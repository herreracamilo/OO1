package ar.edu.unlp.info.oo1.ejercicio14_b;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase 
 * 
 */
public class DateLapseTest {
	
	LocalDate inicio;
	LocalDate fin;
	DateLapse test;
	
	@BeforeEach
	void setUp() throws Exception {
		inicio = LocalDate.of(1972, 12, 15);
		fin = LocalDate.of(2032, 12, 15);
		long cantidad = this.inicio.until(fin, ChronoUnit.DAYS);
		
		test = new DateLapse(inicio, (int) cantidad);
	}
	
    @Test
    public void testGetFrom() {
    	LocalDate resultado = LocalDate.of(1972, 12, 15);
        assertEquals(resultado, test.getFrom());
    }
    
    @Test
    public void testGetTo() {
    	LocalDate resultado = LocalDate.of(2032, 12, 15);
    	assertEquals(resultado, test.getTo());
    }
    
    @Test
    public void testSizeInDays() {
    	assertEquals(21915, test.sizeInDays());
    }
    
    @Test
    public void testIncludesDate() {
    	LocalDate fecha = LocalDate.of(2001, 07, 15);
    	assertEquals(true, test.includesDate(fecha));
    }
}
