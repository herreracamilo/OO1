package ar.edu.unlp.info.oo1.ejercicio19;

public class PersonaFisica extends Cliente {
	private String dni;
	
	public PersonaFisica(String nombre,String direccion,String dni) {
		super(nombre, direccion);
		this.dni = dni;
	}

	public String getDni() {
		return dni;
	}

	@Override
	public double descuentoCliente() {
		return 0.9;
	}
	
	
}
