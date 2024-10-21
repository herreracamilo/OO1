package ar.edu.unlp.info.oo1.ejercicio17;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nombre;
	private String direccion;
	private String dni;
	private List<Propiedad> propiedades;
	private List<Reserva> reservas;
	
	public Usuario (String nombre, String direccion, String dni) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.dni = dni;
		this.propiedades = new ArrayList<Propiedad>();
		this.reservas = new ArrayList<Reserva>();
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getDni() {
		return dni;
	}
	
	public void agregarPropiedad(Propiedad propiedad) {
		this.propiedades.add(propiedad);
	}
	
	public void crearReserva(Propiedad propiedad,LocalDate fechaInicio,LocalDate fechaFinal) {
		if(propiedad.estaDisponible(fechaInicio, fechaFinal)) {
			Reserva nuevaReserva = new Reserva(fechaInicio, fechaFinal, propiedad);
			this.reservas.add(nuevaReserva);
			propiedad.agregarReserva(nuevaReserva);
		}else System.out.println("ERROR! propiedad no disponible");
	}
	
	
	public void cancerlarReserva(Reserva reserva, LocalDate hoy) {
		if(reserva.puedeCancelar(hoy)) {
			this.reservas.remove(reserva);
			reserva.getPropiedad().eliminarReserva(reserva);
			System.out.println("se canceló la reserva");
		}else System.out.println("NO se canceló la reserva");
	}
	
	public double calcularIngresos(DateLapse fecha) {
		return propiedades.stream()
				.flatMap(propiedad -> propiedad.getReservas().stream())
				.filter(reserva -> reserva.getFecha().overlaps(fecha))
				.mapToDouble(reserva -> reserva.calcularPrecio())
				.sum() * 0.75;
	}
	/*
	 * flatMap hace que si tengo esto:
	 * Propiedad 1 -> [Reserva 1, Reserva 2]
	   Propiedad 2 -> [Reserva 3, Reserva 4]
	   lo transforme en esto:
	   [Reserva 1, Reserva 2, Reserva 3, Reserva 4]
	   
	   filter va a filtrar por los que se superpongan con la fecha que mando
	   va a dejar los que se superponen
	   
	   mapToDouble va a transformar cada reserva en un double que será el
	   precio por noche
	   
	   como ahora el stream es de double uso el stream con sum para sumarlos a todos
	   y multiplicarles el 75%
	 */
}
