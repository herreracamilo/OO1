package ar.edu.unlp.info.oo1.ejercicio19;

public class PersonaFisica extends Cliente {
	private String nombre;
	private String direccion;
	private String dni;
	
	public PersonaFisica(String nombre,String direccion,String dni) {
		super(nombre, direccion);
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getDni() {
		return dni;
	}
	
	
}
