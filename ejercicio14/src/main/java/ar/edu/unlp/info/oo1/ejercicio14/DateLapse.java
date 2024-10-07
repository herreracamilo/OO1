package ar.edu.unlp.info.oo1.ejercicio14;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse {
	private LocalDate from;
	private LocalDate to;
	
	
	public DateLapse(LocalDate from, LocalDate to) {
		this.from = from;
		this.to = to;
	}


	public LocalDate getFrom() { // “Retorna la fecha de inicio del rango”
		return this.from;
	}
	

	public LocalDate getTo() { //“Retorna la fecha de fin del rango”
		return this.to;
	}
	

	public int sizeInDays() { // “Retorna la cantidad de días entre la fecha 'from' y la fecha 'to'”
		long cantidad = this.from.until(to, ChronoUnit.DAYS);
		return (int) cantidad; // tengo que castear
	}
	

	public boolean includesDate(LocalDate other) { //“Recibe un objeto LocalDate y retorna true si la fecha está entre el from y el to del receptor y false en caso contrario”.
		return (other.isEqual(this.from) || other.isAfter(this.from)) && other.isBefore(this.getTo());
	}
	

}
