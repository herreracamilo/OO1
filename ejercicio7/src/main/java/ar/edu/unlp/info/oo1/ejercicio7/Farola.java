package ar.edu.unlp.info.oo1.ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Farola {
	private boolean prendida;
	private List<Farola> listaVecinos;
	
	public Farola() {
		this.prendida = false;
		this.listaVecinos = new ArrayList<Farola>();
	}
	
	/*
	* Crea la relación de vecinos entre las farolas. La relación de vecinos entre las farolas es recíproca, es decir el receptor del mensaje será vecino de otraFarola, al igual que otraFarola también se convertirá en vecina del receptor del mensaje
	*/
	public void pairWithNeighbor( Farola otraFarola ) {
		if(!this.listaVecinos.contains(otraFarola)) { // si mi lista de vecino no contiene a la otra farola
			this.listaVecinos.add(otraFarola); // la agrego a mi lista de vecinos
			otraFarola.pairWithNeighbor(this); // hago que la otra farola me agregue a mi (seria lo recíproco)
		}
	}
	/*
	* Retorna sus farolas vecinas
	*/
	public List<Farola> getNeighbors (){
		return listaVecinos;
	}


	/*
	* Si la farola no está encendida, la enciende y propaga la acción.
	*/
	public void turnOn() {
		if(this.isOff()) {
			this.prendida = true;
			for (Farola vecino : listaVecinos) {
				vecino.turnOn();
			}
		}
		
	}

	/*
	* Si la farola no está apagada, la apaga y propaga la acción.
	*/
	public void turnOff() {
		if(this.isOn()) {
			this.prendida = false;
			for (Farola vecino : listaVecinos) {
				vecino.turnOff();
			}
		}
		
	}
	
	/*
	* Retorna true si la farola está encendida.
	*/
	public boolean isOn() {
	    return this.prendida;
	}
	
	public boolean isOff() {
	    return !this.prendida;
	}

}
