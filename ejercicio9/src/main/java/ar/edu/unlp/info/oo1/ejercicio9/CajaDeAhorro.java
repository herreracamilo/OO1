package ar.edu.unlp.info.oo1.ejercicio9;

public class CajaDeAhorro extends Cuenta {
	private double costo_adicional = 1.02;
	
	public CajaDeAhorro(double monto) {
		this.saldo = monto;
	}

	@Override
	public boolean extraer(double monto) {
		return super.extraer(monto*costo_adicional);
	}
	
	@Override
	protected boolean puedeExtraer(double monto) {
		double montoConCosto = monto * costo_adicional;
		if(this.getSaldo() >= montoConCosto) {
			return true;
		}
		return false;
	}
	
	
	@Override
	protected void extraerSinControlar(double monto) {
		double montoConCosto = monto * costo_adicional;
		super.extraerSinControlar(montoConCosto);
	}
	
	
	@Override
	public boolean transferirACuenta(double monto, Cuenta cuentaDestino) {
		return super.transferirACuenta(monto, cuentaDestino);
	}
	
	@Override
	public void depositar(double monto) {
		double montoConCosto = (monto -(monto * costo_adicional));
		this.saldo += montoConCosto;
	}
	
	
}
