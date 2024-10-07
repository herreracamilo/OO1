package ar.edu.unlp.info.oo1.ejercicio14_b;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse implements DateLapseInterface{
	private LocalDate from;
	private int sizeInDays;
	
	// el constructor necesita recibir el inicio y la cantidad de dias
    public DateLapse(LocalDate from, int sizeInDays) {
        this.from = from;
        this.sizeInDays = sizeInDays;
    }

    @Override
    public LocalDate getFrom() {
        return this.from;
    }

    @Override
    public LocalDate getTo() {
        // como tengo el from que es el inicio le sumo la cantidad de dias y ya tengo el final
        return this.from.plusDays(this.sizeInDays);
    }

    @Override
    public int sizeInDays() {
        return this.sizeInDays;
    }

    @Override
    public boolean includesDate(LocalDate other) {
        return (other.isEqual(this.from) || other.isAfter(this.from)) && other.isBefore(this.getTo());
    }


}
