package ar.edu.unlp.info.oo1.ejercicio18;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Propiedad {
	private String direccion;
	private String nombre;
	private double precioPorNoche;
	private List<Reserva> reservas;
	private PoliticaCancelacion politica;
	
	public Propiedad(String direccion, String nombre, double precioPorNoche, PoliticaCancelacion politica) {
		this.direccion = direccion;
		this.nombre = nombre;
		this.precioPorNoche = precioPorNoche;
		this.reservas = new ArrayList<Reserva>();
		this.politica = politica;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecioPorNoche() {
		return precioPorNoche;
	}
	
	public void agregarReserva(Reserva reserva) {
		this.reservas.add(reserva);
	}
	
	public boolean estaDisponible(LocalDate fechaInicio, LocalDate fechaFin) {
		DateLapse periodo = new DateLapse(fechaInicio,fechaFin);
		return reservas.stream()
				.noneMatch(reserva -> reserva.getFecha().overlaps(periodo));
		//.noneMatch verificando que ninguna reserva tenga un período que se superponga con el período que le mando
	}
	
	public void eliminarReserva(Reserva reserva) {
        this.reservas.remove(reserva);
    }

	public List<Reserva> getReservas() {
		return reservas;
	}
	/*
	 * recorro la coleccion de reservas que tiene la propiedad y 
	 * sumo los precios
	 * de las
	 * que estan dentro del periodo que me envian
	 */
	public double montoPropiedad(DateLapse periodo) {
		return this.reservas.stream()
				.filter(reserva -> reserva.getFecha().overlaps(periodo))
				.mapToDouble(reserva -> reserva.calcularPrecio())
				.sum();
	}
	
	
	public Reserva hacerReserva(Propiedad propiedad,LocalDate fechaInicio,LocalDate fechaFinal) {
		if(propiedad.estaDisponible(fechaInicio, fechaFinal)) {
			Reserva nuevaReserva = new Reserva(fechaInicio, fechaFinal, propiedad);
			this.reservas.add(nuevaReserva);
			return nuevaReserva;
		}else return null;
	}
	
	public void setPolitica(PoliticaCancelacion nuevaPolitica) {
        this.politica = nuevaPolitica;
    }
	
	public double cancelarReserva(Reserva reserva, LocalDate fechaCancelacion) {
        if (reserva.puedeCancelar(fechaCancelacion)) {
            double montoReembolso = this.politica.calcularReembolso(fechaCancelacion, reserva);
            this.reservas.remove(reserva);
            return montoReembolso;
        }
        return 0;
    }

	
}
