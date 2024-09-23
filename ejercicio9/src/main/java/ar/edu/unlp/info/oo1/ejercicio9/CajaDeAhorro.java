package ar.edu.unlp.info.oo1.ejercicio9;

public class CajaDeAhorro extends Cuenta {
	private double costo_adicional = 0.02;
	
	
	@Override
	protected boolean puedeExtraer(double monto) {
		double montoConCosto = monto * (costo_adicional + 1);
		if(this.getSaldo() >= montoConCosto) {
			return true;
		}
		return false;
	}
	
	
	@Override
	protected void extraerSinControlar(double monto) {
		double montoConCosto = monto * (costo_adicional + 1);
		super.extraerSinControlar(montoConCosto);
	}
	
	
	
	@Override
	public void depositar(double monto) {
		double montoConCosto = (( monto * costo_adicional));
		super.depositar(monto-montoConCosto);
	}
	
	
}
