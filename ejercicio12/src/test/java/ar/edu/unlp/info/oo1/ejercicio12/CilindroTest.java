package ar.edu.unlp.info.oo1.ejercicio12;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CilindroTest {

    private Cilindro cilindro;

    @BeforeEach
    public void setUp() {
        cilindro = new Cilindro("Madera", "Rojo", 2, 5);
    }

    @Test
    public void testVolumen() {
        assertEquals(Math.PI * Math.pow(2, 2) * 5, cilindro.getVolumen(), 0.001);
    }

    @Test
    public void testSuperficie() {
        assertEquals((2 * Math.PI * 2 * 5) + (2 * Math.PI * Math.pow(2, 2)), cilindro.getSuperficie(), 0.001);
    }
}
