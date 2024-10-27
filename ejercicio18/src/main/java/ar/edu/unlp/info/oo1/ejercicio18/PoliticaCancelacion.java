package ar.edu.unlp.info.oo1.ejercicio18;

import java.time.LocalDate;

public enum PoliticaCancelacion {
    FLEXIBLE {
        @Override
        public double calcularReembolso(LocalDate fechaCancelacion, Reserva reserva) {
            return reserva.calcularPrecio();
        }
    },
    MODERADA {
        @Override
        public double calcularReembolso(LocalDate fechaCancelacion, Reserva reserva) {
            long diasAntes = fechaCancelacion.until(reserva.getFecha().getFrom()).getDays();
            if (diasAntes >= 7) {
                return reserva.calcularPrecio();
            } else if (diasAntes >= 2) {
                return reserva.calcularPrecio() * 0.5;
            }
            return 0;
        }
    },
    ESTRICTA {
        @Override
        public double calcularReembolso(LocalDate fechaCancelacion, Reserva reserva) {
            return 0;
        }
    };

    public abstract double calcularReembolso(LocalDate fechaCancelacion, Reserva reserva);
}

