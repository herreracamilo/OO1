package ar.edu.unlp.info.oo1.ejercicio6;
import java.time.LocalDate;
public class Mamifero {
	private String identificador;
	private String especie;
	private LocalDate fechaNacimiento;
	private Mamifero madre;
	private Mamifero padre;
	
	public Mamifero(String identificador) {
		this.identificador = identificador;
	}
	public Mamifero() {
		// TODO Auto-generated constructor stub
	}
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String id) {
		this.identificador = id;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento() {
		this.fechaNacimiento = LocalDate.now();;
	}
	public Mamifero getMadre() {
		return madre;
	}
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	public Mamifero getPadre() {
		return padre;
	}
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	public Mamifero getAbuelaMaterna() {
		if(this.madre != null) {
			return this.madre.getMadre();
		}else return null;
			
	}
	public Mamifero getAbueloMaterno() {
		if(this.madre != null) {
			return this.madre.getPadre();
		}else return null;
	}
	public Mamifero getAbuelaPaterna() {
		if(this.madre != null) {
			return this.padre.getMadre();
		}else return null;
	}
	public Mamifero getAbueloPaterno() {
		if(this.madre != null) {
			return this.padre.getPadre();
		}else return null;
	}
	
	public boolean siEsMiMadre(Mamifero unMamifero) {
		return (this.madre!= null && this.madre == unMamifero);
	}
	
	public boolean siEsMiPadre(Mamifero unMamifero) {
		return (this.padre!= null && this.padre == unMamifero);
	}
	
	public boolean siEsAncestroDeMiPadre(Mamifero unMamifero) {
		return (this.padre!= null && (this.padre == unMamifero || this.padre.tieneComoAncestroA(unMamifero)));
	    }
	
	public boolean siEsAncestroDeMiMadre(Mamifero unMamifero) {
	     return (this.madre!= null && (this.madre == unMamifero || this.madre.tieneComoAncestroA(unMamifero)));
	    }
	
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		if(siEsAncestroDeMiMadre(unMamifero) || siEsAncestroDeMiPadre(unMamifero)) {
			return true;
		}
		return false;
	}
	
	
	
	
	
	
	
}
