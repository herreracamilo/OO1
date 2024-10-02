package ar.edu.unlp.info.oo1.ejercicio12;

import java.util.ArrayList;
import java.util.List;

public class ReporteDeConstruccion{
	private List<Pieza> piezas;
	
	public ReporteDeConstruccion() {
		piezas = new ArrayList<Pieza>();
	}
	
	public void agregarPieza(Pieza pieza) {
		this.piezas.add(pieza);
	}
	
	public int getPiezas() {
		return this.piezas.size();
	}

	public double getVolumenDeMaterial(String material) {
			double sumaVolumenes=0;
				for (Pieza p: piezas) {
					if(p.getMaterial() == material) {
						sumaVolumenes+= p.getVolumen();
					}
				}
			return sumaVolumenes;
	}
	
	public double getSuperficieDeColor(String color) {
			double sumaSuperficie=0;
				for(Pieza p: piezas) {
					if(p.getColor() == color) {
						sumaSuperficie+=p.getSuperficie();
					}
				}
			return sumaSuperficie;
	}
	
}
