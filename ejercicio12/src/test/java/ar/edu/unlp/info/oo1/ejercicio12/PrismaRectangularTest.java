package ar.edu.unlp.info.oo1.ejercicio12;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PrismaRectangularTest {

    private PrismaRectangular prisma;

    @BeforeEach
    public void setUp() {
        prisma = new PrismaRectangular("Madera", "Rojo", 2, 3, 5);
    }

    @Test
    public void testVolumen() {
        assertEquals(2 * 3 * 5, prisma.getVolumen(), 0.001);
    }

    @Test
    public void testSuperficie() {
        assertEquals(2 * ((2 * 3) + (2 * 5) + (3 * 5)), prisma.getSuperficie(), 0.001);
    }
}
