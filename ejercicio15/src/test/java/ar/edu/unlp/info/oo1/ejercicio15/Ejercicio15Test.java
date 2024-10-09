package ar.edu.unlp.info.oo1.ejercicio15;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Ejercicio15Test {
    
    private Usuario camilo;
    private Consumo consumo;
    private CuadroTarifario cuadroTarifario;
    
    @BeforeEach
    public void setUp() {
        
        consumo = new Consumo(500, 100); // energía activa y reactiva
        
        
        cuadroTarifario = new CuadroTarifario(10); // precio por kWh = 10
        
        
        camilo = new Usuario("camilo herrera", "1 y 57", consumo);
    }
    
    @Test
    public void testCostoDeConsumoSinBonificacion() {
        // si el factor de potencia es <= 0.8, no se aplica bonificación
        assertFalse(camilo.obtieneBonificacion());
        
        
        assertEquals(500 * 10, camilo.getCostoDeConsumo());
    }
    
    @Test
    public void testCostoDeConsumoConBonificacion() {
        // aca seria positivo
        Consumo nuevoConsumo = new Consumo(800, 100); // factor de potencia alto
        new Usuario("camilo herrera", "1 y 57", nuevoConsumo);
        
        assertTrue(camilo.obtieneBonificacion());

        // verifico el costo con bonificación (10% de descuento)
        double costoSinDescuento = 800 * 10;
        double descuento = costoSinDescuento * 0.10;
        double costoFinal = costoSinDescuento - descuento;
        assertEquals(costoFinal, camilo.getCostoDeConsumo());
    }
    
    @Test
    public void testEmitirFacturaSinBonificacion() {
        // emitir una factura sin bonificación
        Factura factura = camilo.emitirFactura();
        
    
        assertEquals(5000, factura.getMontoFinal()); // 500 * 10
        assertEquals(0, factura.getDescuentoAplicado()); // sin descuento
    }
    
    @Test
    public void testEmitirFacturaConBonificacion() {
        // modifico el consumo para tener un factor de potencia > 0.8
        Consumo nuevoConsumo = new Consumo(800, 100); // factor de potencia alto
        camilo = new Usuario("camilo herrera", "1 y 57", nuevoConsumo);
        
        // emito una factura con bonificación
        Factura factura = camilo.emitirFactura();
        
        // verifico que la factura tenga el descuento aplicado
        double costoSinDescuento = 800 * 10;
        double descuento = costoSinDescuento * 0.10;
        double costoFinal = costoSinDescuento - descuento;
        
        assertEquals(costoFinal, factura.getMontoFinal());
        assertEquals(descuento, factura.getDescuentoAplicado());
    }
}
