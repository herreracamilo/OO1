package ar.edu.unlp.info.oo1.ejercicio14_b;

import java.time.LocalDate;

public interface DateLapseInterface {
	LocalDate getFrom();
	LocalDate getTo();
	int sizeInDays();
    boolean includesDate(LocalDate other);
}
