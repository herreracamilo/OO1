package ar.edu.unlp.info.oo1.ejercicio9;

public class CajaDeAhorro extends Cuenta {
	private double costo_adicional = 0.02;
	
	private double montoConCosto(double monto) {
		return monto * (this.costo_adicional + 1);
	}
	
	@Override
	protected boolean puedeExtraer(double monto) {
		if(this.getSaldo() >= montoConCosto(monto)) {
			return true;
		}
		return false;
	}
	
	
	@Override
	protected void extraerSinControlar(double monto) {
		super.extraerSinControlar(montoConCosto(monto));
	}
	
	
	@Override
	public void depositar(double monto) {
		super.depositar(monto-(monto * costo_adicional));
	}
	
	
}
