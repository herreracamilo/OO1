package ar.edu.unlp.info.oo1.ejercicio12;

public class Cilindro extends Pieza{
	private int radio;
	private int altura;
	
	public Cilindro(String material,String color,int radio, int altura) {
		super(material, color);
		this.radio= radio;
		this.altura= altura;
	}
	
	public int getRadio() {
		return radio;
	}

	public int getAltura() {
		return altura;
	}

	@Override
	public double getVolumen() {
		return (Math.PI * (Math.pow(getRadio(), 2))* getAltura());
	}

	@Override
	public double getSuperficie() {
		return ((2* Math.PI * getRadio()*getAltura())+2*Math.PI*Math.pow(getRadio(), 2));
	}
}
