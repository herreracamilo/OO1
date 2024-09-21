package ar.edu.unlp.info.oo1.ejercicio8;

public class main {

	public static void main(String[] args) {
		// 1
		Gerente alan1 = new Gerente("Alan Turing1");
		double aportesDeAlan = alan1.aportes();
		System.out.println(aportesDeAlan);
		
		Gerente alan2 = new Gerente("Alan Turing2");
		double sueldoBasicoDeAlan = alan2.sueldoBasico();
		System.out.println(sueldoBasicoDeAlan);
	}

}

/*
Para el alan1: entra a la clase Gerente y busca el metodo aportes
como ahi existe devuelve el resultado.

Para el alan2: entra a la clase Gerente y busca el metodo sueldoBasico,
como ahi no existe el metodo va y lo busca en la clase EmpleadoJerarquico,
ahi sí existe el metodo pero el metodo incluye un super.sueldoBasico() asi que va
a la clase Empleado para buscar el metodo sueldoBasico() y se lo devuelve a 
sueldoBasico() de EmpleadoJerarquico.

Los valores son luego de ejecutar cada fragmento son:
2850.0
67850.0

 */
