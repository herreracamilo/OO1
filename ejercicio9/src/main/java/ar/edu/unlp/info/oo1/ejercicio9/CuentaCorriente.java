package ar.edu.unlp.info.oo1.ejercicio9;

public class CuentaCorriente extends Cuenta {
	private double descubierto; // limite negativo
	
	public CuentaCorriente() { // lo dice la consigna
		this.descubierto = 0;
	}

	public double getDescubierto() {
		return descubierto;
	}
	
	public void setDescubierto(double descubierto) {
		this.descubierto = descubierto;
	}

	@Override
	protected boolean puedeExtraer(double monto) {
		return getSaldo() + this.descubierto >= monto; // osea si el saldo + el descubierto es mayor/igual al monto si puede
	}
}
