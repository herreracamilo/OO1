package ar.edu.unlp.info.oo1.ejercicio8;

public class EmpleadoJerarquico extends Empleado {
	
	public EmpleadoJerarquico(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	public double sueldoBasico() {
		return super.sueldoBasico() + this.bonoPorCategoria();	}
	
	public double montoBasico() {
		return 45000;
	}
	
	public double bonoPorCategoria() {
		return 8000;
	}
}
