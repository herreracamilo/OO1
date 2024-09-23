package ar.edu.unlp.info.oo1.ejercicio9;

public class CajaDeAhorro extends Cuenta {
	
	
	@Override
	public boolean extraer(double monto) {
		// TODO Auto-generated method stub
		return super.extraer(monto*1.02);
	}
	
	@Override
	public boolean transferirACuenta(double monto, Cuenta cuentaDestino) {
		// TODO Auto-generated method stub
		return super.transferirACuenta(monto*1.02, cuentaDestino);
	}
	
	@Override
	public void depositar(double monto) {
		// TODO Auto-generated method stub
		super.depositar(monto*1.02);
	}
	
	
}
