package ar.edu.unlp.info.oo1.ejercicio12;

public class Esfera extends Pieza{
	private int radio;
	
	public Esfera(String material,String color, int radio) {
		super(material, color);
		this.radio=radio;
	}

	public int getRadio() {
		return radio;
	}

	@Override
	public double getVolumen() {
		return ((4/3)*Math.PI*Math.pow(getRadio(), 3));
	}

	@Override
	public double getSuperficie() {
		return (4*Math.PI*(Math.pow(getRadio(), 2)));
	}
	
	
}
