package ar.edu.unlp.info.oo1.ejercicio16;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Aca escribiremos los test de unidad para cada clase
 * 
 */
public class EvenNumberSetTestOpcion2 {
	private EvenNumberSetOpcion2<Integer> numbers; 

	@BeforeEach
	void setUp() throws Exception {
		numbers = new EvenNumberSetOpcion2<>();
	}

	@Test
	public void testAgregarNumeroImpar() {
		assertEquals(0, numbers.size()); // no hay ningun numero en la coleccion
		numbers.add(1); // agrego un impar
		assertEquals(0, numbers.size()); // la coleccion debe ser 0
	}
	
	@Test
	public void testAgregarNumeroPar() {
		assertEquals(0, numbers.size()); // no hay ningun numero en la coleccion
		numbers.add(2); // agrego un impar
		assertEquals(1, numbers.size()); // la coleccion debe ser 1
	}
	
	@Test
	public void testAgregarNumerosParesEImpares() {
		assertEquals(0, numbers.size()); // no hay ningun numero en la coleccion
		numbers.add(1); // agrego un impar
		numbers.add(2); // agrego un par
		numbers.add(5); // agrego un impar
		numbers.add(8); // agrego un par
		assertEquals(2, numbers.size()); // la coleccion debe ser 1
	}
	
	@Test
	public void testAgregarNumerosParesRepetidos() {
		assertEquals(0, numbers.size()); // no hay ningun numero en la coleccion
		numbers.add(2); // agrego un par
		numbers.add(8); // agrego un par
		numbers.add(16); // agrego un par
		numbers.add(2); // agrego el 2 pero no deberia agregarse porque ya esta en la coleccion
		assertEquals(3, numbers.size()); // la coleccion debe ser 1
		numbers.stream().forEach(num -> System.out.println(num));
	}
	
}
