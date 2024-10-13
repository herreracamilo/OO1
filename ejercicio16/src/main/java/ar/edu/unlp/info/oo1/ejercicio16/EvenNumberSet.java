package ar.edu.unlp.info.oo1.ejercicio16;

import java.util.Collection;
//import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class EvenNumberSet<E> implements Set<Integer>{
	private Set<Integer> setInterno;
	
	/*
	 * El HashSet no permite añadir elementos que ya estan
	 * asi que es la mejor opcion para este ejercicio.
	 * Es rápida en términos de rendimiento para operaciones 
	 * de búsqueda, inserción y eliminación.
	 */
	
	public EvenNumberSet() {
		this.setInterno = new LinkedHashSet<>(); // con este mantenes el orden en que agregas
        //this.setInterno = new HashSet<>(); // con este no, cual uso?
    }
	
	@Override
	public int size() {
		return setInterno.size();
	}

	@Override
	public boolean isEmpty() {
		return setInterno.isEmpty();
	}

	@Override
	public boolean contains(Object o) {
		return setInterno.contains(o);
	}

	@Override
	public Iterator<Integer> iterator() {
		return 	setInterno.iterator();
	}

	
	// ??????????
	@Override
	public Object[] toArray() {
		return setInterno.toArray();
	}
	
	// ??????????
	@Override
	public <T> T[] toArray(T[] a) {
		return setInterno.toArray(a);
	}

	@Override
	public boolean add(Integer num) {
		if(num % 2 == 0) {
			return setInterno.add(num);
		}
		return false;
	}

	@Override
	public boolean remove(Object o) {
		return setInterno.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends Integer> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		setInterno.clear();
		
	}


}
