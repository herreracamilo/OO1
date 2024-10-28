package ar.edu.unlp.info.oo1.ejercicio19;

public class ClienteCorporativo extends Cliente{
	private String cuit;
	
	public ClienteCorporativo(String nombre,String direccion,String cuit) {
		super(nombre, direccion);
		this.cuit = cuit;
	}

	public String getCuit() {
		return cuit;
	}

	@Override
	public double descuentoCliente() {
		return 1;
	}
	
	
	
}
