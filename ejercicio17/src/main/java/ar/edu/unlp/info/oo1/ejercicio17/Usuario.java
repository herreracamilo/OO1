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
	// tiene mas sentido que todas estas cosas las haga propiedad y el usuario nada mas reciba la reserva para guardarla
	public void crearReserva(Propiedad propiedad,LocalDate fechaInicio,LocalDate fechaFinal) {
			Reserva nuevaReserva = propiedad.hacerReserva(propiedad, fechaInicio, fechaFinal);
			if(nuevaReserva!=null) {
				this.reservas.add(nuevaReserva);
				System.out.println("reserva realizada ;)");
			}else System.out.println("reserva NO realizada :(");
				
	}
	
	
	public void cancerlarReserva(Reserva reserva, LocalDate hoy) {
		if(reserva.puedeCancelar(hoy)) {
			this.reservas.remove(reserva);
			reserva.getPropiedad().eliminarReserva(reserva);
			System.out.println("se canceló la reserva");
		}else System.out.println("NO se canceló la reserva");
	}
	
	/* el usuario no debe hacer cosas que no le interesan, él 
	 * solo quiere conocer el valor de los ingresos
	 * entonces no tiene porque ir a reservas y mapear esas reservas,
	 * solo tengo que iterar por propiedades consiguiendo el monto
	 */
	public double calcularIngresos(DateLapse fecha) {
		return propiedades.stream()
				.mapToDouble(propiedad -> propiedad.montoPropiedad(fecha))
				.sum() * 0.75;
	}
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
