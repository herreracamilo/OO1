package ar.edu.unlp.info.oo1.ejercicio17;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Propiedad {
	private String direccion;
	private String nombre;
	private double precioPorNoche;
	private List<Reserva> reservas;
	
	public Propiedad(String direccion, String nombre, double precioPorNoche) {
		this.direccion = direccion;
		this.nombre = nombre;
		this.precioPorNoche = precioPorNoche;
		this.reservas = new ArrayList<Reserva>();
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
	
	
	
}
