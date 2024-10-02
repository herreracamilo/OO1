package ar.edu.unlp.info.oo1.ejercicio12;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EsferaTest {

    private Esfera esfera;

    @BeforeEach
    public void setUp() {
        esfera = new Esfera("Metal", "Azul", 3);
    }

    @Test
    public void testVolumen() {
        assertEquals((4/3) * Math.PI * Math.pow(3, 3), esfera.getVolumen(), 0.001);
    }

    @Test
    public void testSuperficie() {
        assertEquals(4 * Math.PI * Math.pow(3, 2), esfera.getSuperficie(), 0.001);
    }
}
