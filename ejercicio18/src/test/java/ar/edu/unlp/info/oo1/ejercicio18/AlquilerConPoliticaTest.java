package ar.edu.unlp.info.oo1.ejercicio18;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

public class AlquilerConPoliticaTest {


    private Propiedad propiedadFlexible;
    private Propiedad propiedadModerada;
    private Propiedad propiedadEstricta;
    private Reserva reserva;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private LocalDate hoy;

    @BeforeEach
    public void setUp() {

        propiedadFlexible = new Propiedad("Calle Falsa 456", "Casa en la playa", 500, PoliticaCancelacion.FLEXIBLE);
        propiedadModerada = new Propiedad("Calle Real 789", "Departamento", 700, PoliticaCancelacion.MODERADA);
        propiedadEstricta = new Propiedad("Avenida Siempre Viva 123", "Villa", 1000, PoliticaCancelacion.ESTRICTA);

        
        fechaInicio = LocalDate.of(2024, 11, 1);
        fechaFin = LocalDate.of(2024, 11, 10);
        hoy = LocalDate.of(2024, 10, 20);
    }
    @Test
    public void testCancelarReservaPoliticaFlexible() {
        reserva = propiedadFlexible.hacerReserva(propiedadFlexible, fechaInicio, fechaFin);
        double reembolso = propiedadFlexible.cancelarReserva(reserva, hoy);
        assertEquals(4500, reembolso, "el reembolso debería ser el monto total bajo la política flexible");
    }

    @Test
    public void testCancelarReservaPoliticaModerada_MasDeUnaSemana() {
        reserva = propiedadModerada.hacerReserva(propiedadModerada, fechaInicio, fechaFin);
        double reembolso = propiedadModerada.cancelarReserva(reserva, hoy);
        assertEquals(6300, reembolso, "el reembolso debería ser el monto total bajo la política moderada al cancelar con más de una semana");
    }

    @Test
    public void testCancelarReservaPoliticaModerada_MenosDeUnaSemana() {
        reserva = propiedadModerada.hacerReserva(propiedadModerada, fechaInicio, fechaFin);
        LocalDate menosDeUnaSemana = LocalDate.of(2024, 10, 27);
        double reembolso = propiedadModerada.cancelarReserva(reserva, menosDeUnaSemana);
        assertEquals(3150, reembolso, "el reembolso debería ser el 50% del monto bajo la política moderada al cancelar con menos de una semana");
    }

    @Test
    public void testCancelarReservaPoliticaModerada_MenosDeDosDias() {
        reserva = propiedadModerada.hacerReserva(propiedadModerada, fechaInicio, fechaFin);
        LocalDate menosDeDosDias = LocalDate.of(2024, 10, 31);
        double reembolso = propiedadModerada.cancelarReserva(reserva, menosDeDosDias);
        assertEquals(0, reembolso, "el reembolso debería ser 0 bajo la política moderada al cancelar con menos de dos días");
    }

    @Test
    public void testCancelarReservaPoliticaEstricta() {
        reserva = propiedadEstricta.hacerReserva(propiedadEstricta, fechaInicio, fechaFin);
        double reembolso = propiedadEstricta.cancelarReserva(reserva, hoy);
        assertEquals(0, reembolso, "el reembolso debería ser 0 bajo la política estricta sin importar la fecha de cancelación");
    }

}
