package ar.edu.unlp.info.oo1.ejercicio16;

//import java.util.HashSet;
import java.util.LinkedHashSet;


public class EvenNumberSetOpcion2<E> extends LinkedHashSet<Integer>{
		/*
		 * Sobrescribo el metodo add de la clase LinkedHashSet directamente
		 * entonces no tengo que modificar todos los otros metodos
		 * que no me interesan en esta implementacion
		 */
	
	@Override
	public boolean add(Integer num) {
		if(num % 2 == 0) {
			return super.add(num);
		}
		return false;
	}

	
}
