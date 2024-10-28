package ar.edu.unlp.info.oo1.ejercicio19;

public class ClienteCorporativo extends Cliente{
	private String nombre;
	private String direccion;
	private String cuit;
	
	public ClienteCorporativo(String nombre,String direccion,String cuit) {
		super(nombre, direccion);
		this.cuit = cuit;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getCuit() {
		return cuit;
	}
	
	
	
}
