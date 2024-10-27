package ar.edu.unlp.info.oo1.ejercicio17;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

public class AlquilerTest {

    private Usuario usuario;
    private Propiedad propiedad;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private LocalDate hoy;

    @BeforeEach
    public void setUp() {
        usuario = new Usuario("camilo herrera", "Calle 1 & 57", "12345678");
        propiedad = new Propiedad("Calle 7 456", "Duplex", 500);
        usuario.agregarPropiedad(propiedad);
        
        fechaInicio = LocalDate.of(2024, 11, 1); // YYYY/MM/DD
        fechaFin = LocalDate.of(2024, 11, 10);
        hoy = LocalDate.of(2024, 10, 27); // fecha de hoy para probar
    }

    @Test
    public void testDisponibilidadPropiedadSinReservas() {
        assertTrue(propiedad.estaDisponible(fechaInicio, fechaFin), 
                "la propiedad debería estar disponible ya que no hay reservas en este período");
    }

    @Test
    public void testDisponibilidadPropiedadConReservasEnPeriodo() {
        propiedad.hacerReserva(propiedad, fechaInicio, fechaFin);
        LocalDate fechaConflictoInicio = LocalDate.of(2024, 11, 5);
        LocalDate fechaConflictoFin = LocalDate.of(2024, 11, 15);

        assertFalse(propiedad.estaDisponible(fechaConflictoInicio, fechaConflictoFin), 
                "la propiedad no debería estar disponible ya que hay una reserva en este período");
    }

    @Test
    public void testReservarPropiedadParaPeriodo() {
        usuario.crearReserva(propiedad, fechaInicio, fechaFin);
        assertFalse(propiedad.estaDisponible(fechaInicio, fechaFin), 
                "la propiedad no debería estar disponible después de crear la reserva");
    }

    @Test
    public void testCancelarReserva() {
        Reserva reserva = propiedad.hacerReserva(propiedad, fechaInicio, fechaFin);
        usuario.cancerlarReserva(reserva, hoy);

        assertTrue(propiedad.estaDisponible(fechaInicio, fechaFin), 
                "la propiedad debería estar disponible después de cancelar la reserva");
    }
}
