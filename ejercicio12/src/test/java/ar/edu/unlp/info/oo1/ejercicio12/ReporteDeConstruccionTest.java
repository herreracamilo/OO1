package ar.edu.unlp.info.oo1.ejercicio12;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReporteDeConstruccionTest {

    private ReporteDeConstruccion reporte;
    private Cilindro cilindro;
    private Esfera esfera;
    private PrismaRectangular prisma;

    @BeforeEach
    public void setUp() {
        reporte = new ReporteDeConstruccion();
        cilindro = new Cilindro("Madera", "Rojo", 2, 5);
        esfera = new Esfera("Metal", "Azul", 3);
        prisma = new PrismaRectangular("Madera", "Rojo", 2, 3, 5);
        
        reporte.agregarPieza(cilindro);
        reporte.agregarPieza(esfera);
        reporte.agregarPieza(prisma);
    }
    /*
     * Los 0.001 es la tolerancia de error
     * Ejemplo:
     * assertEquals(1.234, 1.2341, 0.001); Esto pasará, ya que la diferencia es menor que 0.001.
     * assertEquals(1.234, 1.235, 0.001); Esto fallará, ya que la diferencia es mayor que 0.001.
     */
    
    @Test
    public void testCantPiezas() {
        ReporteDeConstruccion nuevoReporte = new ReporteDeConstruccion();
        assertEquals(0, nuevoReporte.getPiezas()); 

        Pieza cilindro = new Cilindro("Madera", "Rojo", 2, 5);
        nuevoReporte.agregarPieza(cilindro);
        assertEquals(1, nuevoReporte.getPiezas()); 

        Pieza prisma = new PrismaRectangular("Metal", "Azul", 2, 3, 5);
        nuevoReporte.agregarPieza(prisma);
        assertEquals(2, nuevoReporte.getPiezas()); 
    }

    
    @Test
    public void testAgregarPieza() {
        // los volúmenes de las piezas de material "Madera" (Cilindro y Prisma)
        double volumenCilindro = Math.PI * Math.pow(2, 2) * 5; // Cilindro (radio = 2, altura = 5)
        double volumenPrisma = 2 * 3 * 5; // Prisma (lado mayor = 2, lado menor = 3, altura = 5)
        double volumenTotalMadera = volumenCilindro + volumenPrisma;

        // la superficie de las piezas de color "Rojo" (Cilindro y Prisma)
        double superficieCilindro = (2 * Math.PI * 2 * 5) + (2 * Math.PI * Math.pow(2, 2));
        double superficiePrisma = 2 * ((2 * 3) + (2 * 5) + (3 * 5));
        double superficieTotalRojo = superficieCilindro + superficiePrisma;

        assertEquals(volumenTotalMadera, reporte.getVolumenDeMaterial("Madera"), 0.001);
        assertEquals(superficieTotalRojo, reporte.getSuperficieDeColor("Rojo"), 0.001);
    }


    @Test
    public void testGetVolumenDeMaterial() {
        double volumenMadera = cilindro.getVolumen() + prisma.getVolumen();
        assertEquals(volumenMadera, reporte.getVolumenDeMaterial("Madera"), 0.001);

        double volumenMetal = esfera.getVolumen();
        assertEquals(volumenMetal, reporte.getVolumenDeMaterial("Metal"), 0.001);
    }

    @Test
    public void testGetSuperficieDeColor() {
        double superficieRoja = cilindro.getSuperficie() + prisma.getSuperficie();
        assertEquals(superficieRoja, reporte.getSuperficieDeColor("Rojo"), 0.001);

        double superficieAzul = esfera.getSuperficie();
        assertEquals(superficieAzul, reporte.getSuperficieDeColor("Azul"), 0.001);
    }
}

